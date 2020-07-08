package demo.steps_definition;

import demo.api.bibit.products.get_products.ProductsApi;
import demo.models.products.details.Asset;
import demo.models.products.details.Data;
import demo.models.products.details.Holding;
import demo.models.products.details.ProductDetailsResponse;
import demo.models.products.factsheets.ProductFactsheetsResponse;
import demo.models.products.list.Datum;
import demo.models.products.list.TopProductsResponse;
import demo.models.products.prospectus.ProductProspectusResponse;
import demo.pages.bibit.ProductDetailPage;
import demo.pages.bibit.TopReksaDanaPilihanPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TopReksaDanaPilihanSteps {
    TopReksaDanaPilihanPage topReksaDanaPilihanPage = new TopReksaDanaPilihanPage();
    ProductDetailPage productDetailPage = new ProductDetailPage();

    ProductsApi productApi = new ProductsApi();
    int topReksadanaLimit = 5;
    Data reksaData = new Data();

    Locale locale = new Locale("id", "ID");

    @When("User click Top Reksadana")
    public void userClickTopReksadana() {
        topReksaDanaPilihanPage.clickTopReksaDana();
    }

    @Then("Sucessfully display Top Reksadana according to API results")
    public void compareTopReksadanaAPIResultsWithTheUI() {
        Response getTopReksadanaResponse = productApi.getBestProductsByCategoryName("moneymarket", topReksadanaLimit);
        TopProductsResponse topReksaDanaResponseBody = getTopReksadanaResponse.as(TopProductsResponse.class);

        Assert.assertEquals(topReksadanaLimit, topReksaDanaResponseBody.getData().size());

        for (int i = 0; i < topReksadanaLimit; i++) {
            Datum datum = topReksaDanaResponseBody.getData().get(i);

            String name = datum.getName();
            Assert.assertEquals(name, topReksaDanaPilihanPage.getName(i));

            String type = datum.getType();
            Assert.assertEquals(type, topReksaDanaPilihanPage.getType(i));

            double oneYearReturn = datum.getSimplereturn().getY() * 100;
            String oneYearReturnString = doubleToSignedString(oneYearReturn, 2) + "%";
            Assert.assertEquals(oneYearReturnString, topReksaDanaPilihanPage.getOneYearReturn(i));

            String expenseRatio = doubleToString(datum.getExpenseratio().getPercentage() * 100, 2) + "%";
            Assert.assertEquals(expenseRatio, topReksaDanaPilihanPage.getExpenseRatio(i));

            String totalAum = doubleToString(datum.getAum().getValue() / 1000000000, 2) + "B";
            Assert.assertEquals(totalAum, topReksaDanaPilihanPage.getTotalAum(i));
        }
    }

    @And("^User check details of Reksadana #(.*?)$")
    public void userCheckDetailsOfReksadanaAttempt(int position) {
        position -= 1;
        topReksaDanaPilihanPage.clickReksaDanaCard(position);

        Response getTopReksadanaResponse = productApi.getBestProductsByCategoryName("moneymarket", topReksadanaLimit);
        TopProductsResponse topReksaDanaResponseBody = getTopReksadanaResponse.as(TopProductsResponse.class);

        Datum datum = topReksaDanaResponseBody.getData().get(position);
        Response getDetailReksadanaResponse = productApi.getProductDetail(datum.getSymbol());
        ProductDetailsResponse reksadanaDetailsResponseBody = getDetailReksadanaResponse.as(ProductDetailsResponse.class);
        reksaData = reksadanaDetailsResponseBody.getData();
    }

    @Then("Sucessfully display name according to API results")
    public void sucessfullyDisplayNameAccordingToAPIResults() {
        Assert.assertEquals(reksaData.getName(), productDetailPage.getName());
    }

    @And("Sucessfully display reksa value according to API results")
    public void sucessfullyDisplayReksaValueAccordingToAPIResults() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date navDate = formatter.parse(reksaData.getNav().getDate());
        Date aumDate = formatter.parse(reksaData.getAum().getDate());
        formatter = new SimpleDateFormat("d MMM yy", locale);
        String navDateFormatted = formatter.format(navDate);
        String aumDateFormatted = formatter.format(aumDate);

        String navValue = doubleToString(reksaData.getNav().getValue(), 4);

        Assert.assertEquals(navValue, productDetailPage.getNavValue());
        Assert.assertEquals(navDateFormatted, productDetailPage.getNavDate());

        // scroll to next
        productDetailPage.scrollToAum();

        Assert.assertEquals(aumDateFormatted, productDetailPage.getAumDate());

        // Aum
        System.out.println(reksaData.getAum().getValue());
        System.out.println();
    }

    @And("Sucessfully display summary according to API results")
    public void sucessfullyDisplaySummaryAccordingToAPIResults() {
        productDetailPage.scrollToSummary();

        String cagr1yString = doubleToSignedString(reksaData.getCagr().getY() * 100, 2) + "%";
        Assert.assertEquals(cagr1yString, productDetailPage.getCagr1y());

        String drawdown1yString = doubleToSignedString(reksaData.getMaxdrawdown().getY() * 100, 2) + "%";
        Assert.assertEquals(drawdown1yString, productDetailPage.getDrawdown1Y());

        String expenseRatioString = doubleToString(reksaData.getExpenseratio().getPercentage() * 100, 2) + "%";
        Assert.assertEquals(expenseRatioString, productDetailPage.getExpenseRatio());

        System.out.println(reksaData.getAum().getValue());

        Assert.assertEquals(reksaData.getType(), productDetailPage.getJenisProduk());

        String riskProfile = reksaData.getRiskprofile();
        switch (riskProfile) {
            case "Low":
                riskProfile = "Rendah";
                break;
            case "Moderate":
                riskProfile = "Moderat";
                break;
            case "High":
                riskProfile = "Tinggi";
                break;
        }

        Assert.assertEquals(riskProfile, productDetailPage.getTingkatResiko());
    }

    @And("Sucessfully display portfolio according to API results")
    public void sucessfullyDisplayPortfolioAccordingToAPIResults() {
        productDetailPage.scrollToInvestmentManager();

        String minBuyString = "Rp" + doubleToString(reksaData.getMinbuy(), 0);
        Assert.assertEquals(minBuyString, productDetailPage.getMinBuy());

        long biayaPembelian = reksaData.getFee().getSubscription().getValue();
        String biayaPembelianStr;

        if (biayaPembelian == 0) biayaPembelianStr = "Gratis";
        else biayaPembelianStr = biayaPembelian + "";

        Assert.assertEquals(biayaPembelianStr, productDetailPage.getBiayaPembelian());

        long biayaPenjualan = reksaData.getFee().getRedemption().getValue();
        String biayaPenjualanStr;

        if (biayaPenjualan == 0) biayaPenjualanStr = "Gratis";
        else biayaPenjualanStr = biayaPenjualan + "";

        Assert.assertEquals(biayaPenjualanStr, productDetailPage.getBiayaPenjualan());

        Assert.assertEquals(reksaData.getCustodianBank().getName(), productDetailPage.getBankCustodian());

        Assert.assertEquals(reksaData.getBankRedeem().getName(), productDetailPage.getBankPenampung());
    }

    @And("Sucessfully display alokasi aset according to API results")
    public void sucessfullyDisplayAlokasiAccordingToAPIResults() {
        productDetailPage.scrollToAlokasiAset();

        String[] assetTexts = productDetailPage.getListAssetNames();

        Assert.assertEquals(reksaData.getAsset().size(), assetTexts.length);

        for (int i = 0; i < reksaData.getAsset().size(); i++) {
            Asset asset = reksaData.getAsset().get(i);
            String assetName = "", assetPercentage = "-";
            if (asset.getName() != null) assetName = asset.getName() + " ";

            if (asset.getPercentage() != null) assetPercentage = doubleToString(asset.getPercentage(), 2);

            String assetString = assetName + "(" + assetPercentage + " %)";
            Assert.assertEquals(assetString, assetTexts[i]);
        }
    }

    @And("Sucessfully display top holdings according to API results")
    public void sucessfullyDisplayTopHoldingsAccordingToAPIResults() throws ParseException {
        productDetailPage.scrollToTopHoldings();

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date latestDate = formatter.parse(reksaData.getHolding().get(0).getDate());
        formatter = new SimpleDateFormat("d MMM yy", locale);
        String latestDateFormatted = "As of " + formatter.format(latestDate);
        Assert.assertEquals(latestDateFormatted, productDetailPage.getTopHoldingsDate());

        String[] topHoldingsTexts = productDetailPage.getListTopHoldings();

        Assert.assertEquals(reksaData.getHolding().size(), topHoldingsTexts.length);

        for (int i = 0; i < reksaData.getHolding().size(); i++) {
            Holding holding = reksaData.getHolding().get(i);
            Assert.assertEquals(holding.getName(), topHoldingsTexts[i]);
        }
    }

    @And("Sucessfully display prospektus according to API results")
    public void sucessfullyDisplayProspectusAccordingToAPIResults() {
        Response getProductProspectus = productApi.getProductProspectus(reksaData.getSymbol());
        ProductProspectusResponse productProspectusResponseBody = getProductProspectus.as(ProductProspectusResponse.class);

        for (int i = 0; i < productProspectusResponseBody.getData().size(); i++) {
            demo.models.products.prospectus.Datum datum = productProspectusResponseBody.getData().get(i);
            System.out.println(datum.getFile());
            System.out.println(datum.getName());
            System.out.println();
        }
    }

    @And("Sucessfully display fund fact sheet according to API results")
    public void sucessfullyDisplayFactsheetsAccordingToAPIResults() {
        productDetailPage.openFundFactSheet();

        Response getProductFactsheets = productApi.getProductFactsheets(reksaData.getSymbol());
        ProductFactsheetsResponse productFactsheetsResponseBody = getProductFactsheets.as(ProductFactsheetsResponse.class);

        String[][] fundFacts = productDetailPage.getListFundFacts();

        Assert.assertEquals(productFactsheetsResponseBody.getData().size(), fundFacts.length);

        for (int i = 0; i < productFactsheetsResponseBody.getData().size(); i++) {
            demo.models.products.factsheets.Datum datum = productFactsheetsResponseBody.getData().get(i);

            Assert.assertEquals(datum.getFile(), fundFacts[i][0]);
            Assert.assertEquals(datum.getName(), fundFacts[i][1]);
        }
    }

    private String doubleToSignedString(double num, int decimalPlaces) {
        return (num < 0 ? "" : "+") + doubleToString(num, decimalPlaces);
    }

    private String doubleToString(double num, int decimalPlaces) {
        return String.format(Locale.US, "%,." + decimalPlaces + "f", num);
    }
}
