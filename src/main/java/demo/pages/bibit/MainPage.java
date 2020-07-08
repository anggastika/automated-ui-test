package demo.pages.bibit;

import demo.pages.base.BasePageObject;
import demo.webdriver.AndroidDriverInstance;
import demo.webdriver.WebdriverInstance;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

//class MainPage
public class MainPage extends BasePageObject {

    AppiumDriver<MobileElement> driver;
    String path;

    public boolean isOnSplashScreen() {

        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[1]")))
                .isDisplayed();
    }

    public void clickLoupIcon() {
        AndroidElement loupIcon = AndroidDriverInstance.androidDriver
                .findElement(MobileBy.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[1]/div/div[3]"));
        loupIcon.click();
    }

    public void clickSearchBar() {
        AndroidElement searchBar = AndroidDriverInstance.androidDriver
                .findElement(MobileBy.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[2]/div[1]/a/div"));
        searchBar.click();
    }

    public String searchResult() {
//        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
//        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[1]/div/div[1]")))
//                .isDisplayed();
        return getText(By.xpath("//body//div[@class='content-box']//div//div[1]//div[1]//div[2]//p[1]"));
    }

    public boolean isOnMainPage() {

        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[1]/div/div[1]")))
                .isDisplayed();
    }

    public void inputSearchValue(String testvalue) {
        AndroidElement inputSearchValue = AndroidDriverInstance.androidDriver
                .findElement(By.xpath("//input[@placeholder='Cari Reksadana...']"));
        inputSearchValue.sendKeys(testvalue);
    }

    public boolean isShowBibitLogo() {

        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[1]/div/div[1]/img")))
                .isDisplayed();
    }

    public boolean isWarningReg() {

        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 10);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='errorModalTtl']")))
                .isDisplayed();
    }

    public String warningPopup() {
      return getText(By.xpath("//div[@class='errorModalTtl']"));
    }

    public String VaPermata() {
        return getText(By.xpath("//div[@class='general-title']"));
    }

    public String termMandiri() {
        return getText(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/div[3]/div/div/div[1]/div/div[2]"));
    }

    public String termCimbNiaga() {
        return getText(By.xpath(""));
    }

    public String termBni() {
        return getText(By.xpath("//div[contains(text(),'Transfer ke')]"));
    }

    public String termBri() {
        return getText(By.xpath(""));
    }

    public void clickButtonInvestasiSekarang() {
        By locator = By.xpath("//button[contains(text(),'Investasi Sekarang')]");
        scrollIntoView(locator);
        clickOn(locator);
    }

    public void inputMinBuy() {
        typeOn(By.xpath("//input[@placeholder='Minimal Pembelian Rp100,000']"),"100000");
    }

    public void clickButtonBeli() {
        clickOn(By.xpath("//a[@class='am-button am-button-primary']"));
    }

    public void clickSetuju(){
        clickOn(By.xpath("//p[@class='wrap-320']"));
    }

    public void clickBayarSkrg(){
        clickOn(By.xpath("//a[@class='am-button voucher-payment-list-btn am-button-primary']"));
    }

//    Metode Pembayaran

    public void clickTrfManual(){
        clickOn(By.xpath("//body//label[4]"));
    }

    public void clickVaPermata(){
        clickOn(By.xpath("//body//label[3]"));
    }

    public void clickOtherVa() {
        clickOn(By.xpath("//body//label[4]"));
    }

    public void clickGoPay() {clickOn(By.xpath("//body//label[1]"));}

    public void clickLinkAja() {clickOn(By.xpath("//body//label[2]"));}

    public void clickVaBRI() {
        clickOn(By.xpath("//body//label[2]"));
    }

    public void clickVaBNI(){
        clickOn((By.xpath("//body//label[3]")));
    }

    public void clickVaCimbNiaga() {
        clickOn(By.xpath("//body//label[5]"));
    }

    public void clickMandiriBp() {
        clickOn(By.xpath("//body//label[1]"));
    }

    public void clickButtonBayarViaVa() {
        clickOn(By.xpath("//a[@class='am-button bit-btn-pay am-button-primary']"));
    }

// == End Metode Pembayaran ==



    public void clickBayarLast(){
        clickOn(By.xpath("//a[@class='am-button bit-btn-pay am-button-primary']"));
    }

    public void clickBayarLinkAja(){
        clickOn(By.xpath("//a[@class='am-button am-button-primary']"));
    }

    public void clickBankPilihan1(){
        clickOn(By.xpath("//span[@class='am-checkbox am-checkbox-checked']//input[@class='am-checkbox-input']"));
    }

    public void clickBayarBank(){
        clickOn(By.xpath("//a[@class='am-button bit-btn-pay am-button-primary']"));
    }

    public void closerPopup() {
       AndroidElement popUp = find(By.xpath("//div[@class='rateUsWrap']"));
        if (popUp.isDisplayed()){
            clickOn(By.xpath("//div[@class='rateUs']//div[@class='RateUsClose']"));
        }
    }

    public void reloadCon() {
        AndroidElement popupBadCon = find(By.xpath("//div[@class='am-modal-body']"));
        AndroidElement errorMsgCon = find(By.xpath("//button[@class='btn-refetch']"));


        if (popupBadCon.isDisplayed()){
            clickOn(By.xpath("//button[@class='am-modal-close']"));
            while (errorMsgCon.isDisplayed()) {
                clickOn(By.xpath("//button[@class='btn-refetch']"));
                waitABit(30);
            }
        }
        waitABit(10);
        listOfTrans();
//        else {
//            find(By.xpath("//div[@class='top-card']")).isDisplayed();
//        }
//        waitUntilVisible(By.xpath("//div[@class='top-card']"),10);
    }

    public void listOfTrans(){
        waitUntilVisible(By.xpath("//div[@class='top-card']"),10);
    }

    public void clickPortofolio() {
        clickOn(By.xpath("//b[contains(text(),'Dana Pensiun')]"));
    }

    public boolean isMandiriLogoVisible(){
        return find(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/div[3]/div/div/div[2]/div/div[2]/div[1]/div[1]/div/div[1]/img")).isDisplayed();
    }

    public boolean isGopayBoxVisible() {
        return find(By.xpath("//body/div[@id='root']/div[@class='App fullheight logged-in']/div[@class='router']/div[3]/div[1]/div[1]")).isDisplayed();
    }

    public void clickGiftcardMenu() {
        By locator= By.xpath("//span[contains(@class,'bit-miscellaneous')]");
        scrollIntoView(locator);
        clickOn(locator);
    }


    public void clickTopUpOnPortofolio(String portofolioName){
        By locator = By.xpath(String.format("//b[text()='%s']/ancestor::div[@class='home-porto-card-wrapper']//span[text()='Top Up']", portofolioName));
        waitABit(3);
        scrollIntoView(locator);
        waitABit(2);
        clickOn(locator);
    }

    public void clickInvestasiSekarang(String portofolioName){
        By locator = By.xpath(String.format("//h3[text()='%s']/ancestor::div[@class='index-recomend-card active']//button[text()='Investasi Sekarang']", portofolioName));
        waitABit(3);
        scrollIntoView(locator);
        waitABit(2);
        clickOn(locator);
    }

    public void clickLanjutkanRegistrasi(){
        clickOn(By.xpath("//span[text()='Lanjutkan Registrasi']"));
    }

    public void selectPaymentMethod(String payment) {
        clickOn(By.xpath(String.format("//h3[contains(text(),'%s')]", payment)));
    }

    public String linkAjaPage(){
        return getText(By.xpath("//div[@class='box row-bottom']//h2[contains(text(),'Bibit - Investasi Reksadana')] "));
    }


}
