package demo.pages.bibit;

import demo.pages.base.BasePageObject;
import demo.webdriver.AndroidDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

//class PortofolioPage
public class PortofolioPage extends BasePageObject {

    public void clickPortofolioButton(){
        clickOn(By.xpath("//div[@class='am-tabs-tab-bar-wrap']//div[2]"));
    }

//    public void inputPhoneThatHavePortofolio(){
//        typeOn(By.xpath("//input[@placeholder='contoh: 085817767044']"),"085156242296");
//    }

    public void dontHavePortofolio(){
        isDisplayed(By.xpath("//div[contains(@class,'empty-state-box')]//img"));
    }

    public void displayedPortofolio(){
        isDisplayed(By.xpath("//div[@class='porto-card-container port-categories']"));
    }

    public void  checkNilaiPortofolio(){
        boolean check;
        String checkNilai = getText(By.xpath("//div[@class='porto-top-value porto-price']"));

        if (checkNilai != "0"){
            check =true;
        }else {
            check=false;
        }

    }

    public void clickTopup() {
        clickOn(By.xpath("//div[contains(text(),'Top Up')]"));
    }

    public void clickJual() {
        clickOn(By.xpath("//div[contains(text(),'Jual')]"));
    }

    public void clickMengerti() {
        clickOn(By.xpath("//a[@class='am-button am-button-warning']"));
    }

    public void inputJmlPenjualan() {
        typeOn(By.xpath("//input[@placeholder='Maks. penjualan kamu Rp684,381']"),"10000");
    }

    public void clickJual2() {
        clickOn(By.xpath("//a[@class='am-button am-button-warning']"));
    }

    public void clickApprove() {
        clickOn(By.xpath("//p[contains(text(),'Saya menyetujui penjualan reksa dana yang tertera')]"));
    }

    public void clickJual3() {
        clickOn(By.xpath("//a[@class='am-button new-robosell-btn am-button-warning']"));
    }

    public void insertPin(){
        for (int attempt =1;attempt<7;attempt++) {
            clickOn(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/span[1]" +
                    "/div[1]/div[2]/div[1]/div[2]/div[2]/div[9]"));
        }
    }

    public List<String> getPortofolioName() {
        List<WebElement> elements = findAll(
                By.xpath("//div[@class='port-categories-type']"));
        return elements.stream().map(el -> {
            JavascriptExecutor js = (JavascriptExecutor) AndroidDriverInstance.androidDriver;
            js.executeScript("arguments[0].scrollIntoView();", el);
            return el.getText();
        }).collect(Collectors.toList());
    }

    public void clickTambahPortofolio() {
        By locator = By.xpath("//div[@class='bit-add-porto-btn']");
        scrollIntoView(locator);
        clickOn(locator);
    }

    public void selectInvestmentPurpose(String purpose) {
        clickOn(By.xpath(String.format("//p[text()='%s']", purpose)));
    }

    public void clickBtnTerapkan(){
        clickOn(By.xpath("//a[@class='am-button am-button-primary']"));
    }

    public void inputRencana(String name) {
        typeOn(By.xpath("//input[@placeholder='Misal: Rumah Idaman']"),name);
    }

    public void inputJumlahUang(Integer amount) {
        typeOn(By.xpath("//input[@placeholder='Rp']"),amount.toString());
    }

    public void clickOk() {
        clickOn(By.xpath("//div[@class='am-picker-popup-item am-picker-popup-header-right']"));
    }

    public void clickBtnLanjut(){
        clickOn(By.xpath("//a[@class='am-button save am-button-primary']"));
    }

    public String jumlahTerkumpul(){
        return getText(By.xpath("//div[@class='bit-porto-goal']//div[2]//div[3]//p[1]"));
    }

    public String targetTanggal(){
        return getText(By.xpath("//div[contains(@class, 'bit-porto-target')]//div[contains(@class, 'bit-goal-step')][2]//div[contains(@class, 'bit-target-desc')]//p"));
    }

    public String displayedPMT(){
        String displayedPMT = getText(By.xpath("//div[contains(@class, 'bit-porto-target')]//div[contains(@class, 'bit-goal-step')][3]//div[contains(@class, 'bit-target-desc')]//p"));
        return displayedPMT.replaceAll("[^\\d.]", "");
    }

    public void clickBtnSimpan(){
        By locator = By.xpath("//a[@class='am-button btn-full-nomargin']");
        scrollIntoView(locator);
        clickOn(locator);
    }

    public String errorMinBuy(){
        return getText(By.xpath("//div[@class='errorMessage']"));
    }

    public void selectMonthYear(Integer month, Integer year) {
        clickOn(By.xpath("//div[@class='am-list-content']"));
        waitABit(2);
        selectData(year.toString(), 1);
        selectData(month.toString(), 2);
        waitABit(2);
        clickOn(By.xpath("//div[text()='OK']"));
    }

}
