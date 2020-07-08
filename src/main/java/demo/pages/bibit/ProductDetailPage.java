package demo.pages.bibit;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductDetailPage extends BasePageObject {
    String xpathNavReksaHead = "//div[contains(@class, 'slick-track')]//div[contains(@class, 'slick-slide')][1]//div[contains(@class, 'reksa-value-head')]";
    String xpathAumReksaHead = "//div[contains(@class, 'slick-track')]//div[contains(@class, 'slick-slide')][2]//div[contains(@class, 'reksa-value-head')]";
    String xpathSummaryBox = "//div[contains(@class, 'reksadana-summary-box')]";
    String xpathInvestmentManager = "//div[contains(@class, 'komposisi-portfolio')][1]";
    String xpathAlokasiAset = "//div[contains(@class, 'reksa-alokasi')]";
    String xpathTopHoldings = "//div[contains(@class, 'komposisi-portfolio')][2]";
    String xpathFundFactButton = "//div[contains(@class, 'file-box-wrap')]//*[contains(@class, 'file-box')][2]";
    String xpathFundFactModalContent = "//div[contains(@class, 'am-modal')]//div[contains(@class, 'content-box')]";

    public String getName() {
        waitABit(2);
        return getText(By.xpath("//div[contains(@class, 'reksa-title-elipsis')]"));
    }

    public String getNavValue() {
        return getText(By.xpath(xpathNavReksaHead + "//span[contains(@class, 'reksa-value-head-nav')]"));
    }

    public String getNavDate() {
        return getText(By.xpath(xpathNavReksaHead + "//span[contains(@class, 'navDate')]"));
    }

    public String getNavYearlyChange() {
        return getText(By.xpath(xpathNavReksaHead + "//div[2]//span[1]"));
    }

    public String getNavYearlyReturn() {
        return getText(By.xpath(xpathNavReksaHead + "//div[2]//span[2]"));
    }

    public void scrollToAum() {
        By locator = By.xpath("//div[contains(@class, 'slick-track')]/div[2]");
        scrollIntoView(locator);
    }

    public String getAumValue() {
        return getText(By.xpath(xpathAumReksaHead + "//span[contains(@class, 'reksa-value-head-nav')]"));
    }

    public String getAumDate() {
        return getText(By.xpath(xpathAumReksaHead + "//span[contains(@class, 'navDate')]"));
    }

    public String getAumYearlyChange() {
        return getText(By.xpath(xpathAumReksaHead + "//div[2]//span[1]"));
    }

    public String getAumYearlyReturn() {
        return getText(By.xpath(xpathAumReksaHead + "//div[2]//span[2]"));
    }

    public void scrollToSummary() {
        By locator = By.xpath(xpathSummaryBox);
        scrollIntoView(locator);
    }

    public String getCagr1y() {
        return getText(By.xpath(getSummarryAtPosition(1)));
    }

    public String getDrawdown1Y() {
        return getText(By.xpath(getSummarryAtPosition(2)));
    }

    public String getExpenseRatio() {
        return getText(By.xpath(getSummarryAtPosition(3)));
    }

    public String getTotalAum() {
        return getText(By.xpath(getSummarryAtPosition(4)));
    }

    public String getJenisProduk() {
        return getText(By.xpath(getSummarryAtPosition(5)));
    }

    public String getTingkatResiko() {
        return getText(By.xpath(getSummarryAtPosition(6)));
    }

    private String getSummarryAtPosition(int pos) {
        return xpathSummaryBox + "//div[contains(@class, 'rsb-cols')][" + pos + "]//div[2]";
    }

    public void scrollToInvestmentManager() {
        By locator = By.xpath(xpathInvestmentManager);
        scrollIntoView(locator);
    }

    public String getMinBuy() {
        return getText(By.xpath(getManagerDataAtPosition(1)));
    }

    public String getBiayaPembelian() {
        return getText(By.xpath(getManagerDataAtPosition(2)));
    }

    public String getBiayaPenjualan() {
        return getText(By.xpath(getManagerDataAtPosition(3)));
    }

    public String getBankCustodian() {
        return getText(By.xpath(getManagerDataAtPosition(4)));
    }

    public String getBankPenampung() {
        return getText(By.xpath(getManagerDataAtPosition(5)));
    }

    private String getManagerDataAtPosition(int pos) {
        return xpathInvestmentManager + "//div[contains(@class, 'list-row')][" + pos + "]//div[2]";
    }

    public void scrollToAlokasiAset() {
        By locator = By.xpath(xpathAlokasiAset);
        scrollIntoView(locator);
    }

    public String[] getListAssetNames() {
        List<WebElement> assetList = findAll(By.xpath(xpathAlokasiAset + "//div[contains(@class, 'bar-legend-container')]/div/span"));
        String[] assetArr = new String[assetList.size()];

        for (int i = 0; i < assetList.size(); i++) {
            assetArr[i] = assetList.get(i).getText();
        }

        return assetArr;
    }

    public void scrollToTopHoldings() {
        By locator = By.xpath(xpathTopHoldings);
        scrollIntoView(locator);
    }

    public String getTopHoldingsDate() {
        return getText(By.xpath(xpathTopHoldings + "//div[contains(@class, 'composition-head')]/div[2]/span"));
    }

    public String[] getListTopHoldings() {
        List<WebElement> topHoldingsList = findAll(By.xpath(xpathTopHoldings + "//div[contains(@class, 'komposisi-portofolio')]/span[2]"));
        String[] topHoldingsArr = new String[topHoldingsList.size()];

        for (int i = 0; i < topHoldingsList.size(); i++) {
            topHoldingsArr[i] = topHoldingsList.get(i).getText();
        }

        return topHoldingsArr;
    }

    public void openFundFactSheet() {
        scrollIntoView(By.xpath(xpathFundFactButton));
        clickOn(By.xpath(xpathFundFactButton));
        waitABit(3);
    }

    public String[][] getListFundFacts() {
        List<WebElement> fundFactsList = findAll(By.xpath(xpathFundFactModalContent + "/a"));

        String[][] fundFactsArr = new String[fundFactsList.size()][2];

        for (int i = fundFactsList.size() - 1; i >= 0; i--) {
            WebElement fundFact = fundFactsList.get(i);
            String file = fundFact.getAttribute("href");
            String name = fundFact.findElement(By.xpath(".//div[contains(@class, 'sheets-card-left')]")).getText();
            fundFactsArr[i][0] = file;
            fundFactsArr[i][1] = name;
        }

        return fundFactsArr;
    }
}
