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

public class GiftcardPage extends BasePageObject{

    public void clickGiftcardMenu(){
        clickOn(By.xpath("//span[contains(@class,'bit-miscellaneous')]"));
    }

    public void clickGiftType(String tipe){
        clickOn(By.xpath(String.format("//p[text()='%s']",tipe)));
    }

    public void clickBirthdayTheme(){
        clickOn(By.xpath("//div[contains(@class,'slick-slide slick-active slick-current')]//div//img"));
    }

    public void clickBtnPilihDesign(){
        clickOn(By.xpath("//a[contains(@class,'am-button bit-margin-top-20 am-button-primary')]"));
    }

    public void clickBtnNominalSuggest(String nominal){
        clickOn(By.xpath(String.format("//div[@class='buyInputSuggest']//span[contains(text(),'%s')]",nominal)));
    }

    public void inputGiftMessage(String message){
        typeOn(By.xpath("//div[@class='bit-giftcard-nominal']//textarea"),message);
    }

    public void clickBtnSelanjutnya() {
        clickOn(By.xpath("//a[contains(@class,'am-button giftcard-submit-btn am-button-primary')]"));
    }

    public void clickBtnLanjutkanPembayaran(){
        clickOn(By.xpath("//a[contains(@class,'am-button bit-margin-top-20 am-button-primary')]"));
    }

    public boolean isGopayVisible() {
        return find(By.xpath("//body/div[@id='root']/div[contains(@class,'App fullheight logged-in')]/div[contains(@class,'router')]/div[3]/div[1]/div[1]")).isDisplayed();
    }

}
