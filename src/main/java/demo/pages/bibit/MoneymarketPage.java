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

//class MoneymarketPage
public class MoneymarketPage extends BasePageObject{

    public void clickPasarUang() {
        By locator = By.xpath("//div[contains(@class,'bit-reksa-row')]//div[1]//a[1]//img[1]");
        scrollIntoView(locator);
        clickOn(locator);
    }

    public void clickCompany() {
        clickOn(By.xpath("//div[contains(text(),'Avrist Ada Kas Mutiara')]"));
    }

    public void clickBeli1() {
        clickOn(By.xpath("//button[contains(@class,'primary-btn')]"));
    }

    public void inputMinBuy() {
        typeOn(By.xpath("//input[contains(@placeholder,'Minimal Pembelian Rp1,000,000')]"),"1000000");
    }

    public void clickBeli2() {
        clickOn(By.xpath("//a[contains(@class,'am-button am-button-primary')]"));
    }





}
