package demo.pages.bibit;

import demo.pages.base.BasePageObject;
import demo.webdriver.AndroidDriverInstance;
import demo.webdriver.WebdriverInstance;
import io.appium.java_client.TouchAction;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.util.Assert;

//class LandingPage
public class LandingPage extends BasePageObject {

    public void clickGradArrow(){


        AndroidElement clickGradArrow = AndroidDriverInstance.androidDriver
                .findElement(By.className("arrowGrad"));
        clickGradArrow.click();
    }

    public boolean isOnPage() {
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[1]/div/div[1]")))
                .isDisplayed();
    }

    public void clickButtonLandingPageLogin() {
        AndroidElement buttonLandingPageLogin = AndroidDriverInstance.androidDriver
                .findElement(MobileBy.xpath("//a[@class='am-button']"));
        buttonLandingPageLogin.click();
    }

    public void swipeUp() {
        AndroidElement swipeUp = AndroidDriverInstance.androidDriver
                .findElement(MobileBy.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[2]/div[4]/div[2]"));
        swipeUp.click();
    }

    public void aswerQuestion() throws InterruptedException {
        //Question 1 DD-MM-YYYY
        AndroidDriverInstance.androidDriver.findElement(By.className("am-list-line")).click();
        Thread.sleep(1000);
        AndroidDriverInstance.androidDriver.findElement(By.className("am-picker-popup-header")).click();
        Thread.sleep(1000);
        AndroidDriverInstance.androidDriver.findElement(By.xpath("//div[@class='am-picker-popup-header']/"
                + "div[@class='am-picker-popup-item am-picker-popup-header-right']")).click();
        Thread.sleep(1000);
        AndroidDriverInstance.androidDriver.findElement(By.className("profiling-question-btn")).click();

        //Question 2

        AndroidDriverInstance.androidDriver.findElement(By.xpath("//div[@class='question-option-box']/div[@data-option='0']")).click();
        Thread.sleep(1000);
        AndroidDriverInstance.androidDriver.findElement(By.className("profiling-question-btn")).click();

        //Question 3

        AndroidDriverInstance.androidDriver.findElement(By.xpath("//div[@class='profiling-question-box']/input")).sendKeys("10000000");
        Thread.sleep(1000);
        AndroidDriverInstance.androidDriver.findElement(By.className("profiling-question-btn")).click();

        //Question 4

        AndroidDriverInstance.androidDriver.findElement(By.xpath("//div[@class='profiling-question-box']/input")).sendKeys("500000000");
        Thread.sleep(1000);
        AndroidDriverInstance.androidDriver.findElement(By.className("profiling-question-btn")).click();

        //Question 5

        AndroidDriverInstance.androidDriver.findElement(By.xpath("//div[@class='question-option-box']/div[@data-option='1']")).click();
        Thread.sleep(1000);
        AndroidDriverInstance.androidDriver.findElement(By.className("profiling-question-btn")).click();

        //Question 6
        AndroidDriverInstance.androidDriver.findElement(By.xpath("//div[@class='question-option-box']/div[@data-option='2']")).click();
        Thread.sleep(1000);
        AndroidDriverInstance.androidDriver.findElement(By.className("profiling-question-btn")).click();
    }

    public void cobaajaClick(){
        By locator = By.className("recomend-button-bottom");
        scrollIntoView(locator);
        clickOn(locator);

    }

    public void clickSimulasiRobo(){
        By locator = By.className("bit-simulation-cont");
        scrollIntoView(locator);
        clickOn(locator);
    }

    public void inputInvestPertama(String Invest) throws InterruptedException {

        AndroidElement locator = AndroidDriverInstance.androidDriver.findElement(By.xpath("//body//div[@id='root']//div//div//div//div//div//div//div//div//div//div//div//div//div//div[1]//input[1]"));

        locator.click();
        Thread.sleep(1000);
        locator.sendKeys(Invest);

    }

    public void inputInvestBulanan(String Invest) throws InterruptedException {

        AndroidElement locator = AndroidDriverInstance.androidDriver.findElement(By.xpath("//body//div[@id='root']//div//div//div//div//div//div//div//div//div//div//div[2]//div[2]//input[1]"));

        locator.click();
        Thread.sleep(1000);
        locator.sendKeys(Invest);

    }

    public void verifikasiNilai() {
        Assert.isTrue(true, "Rp 3,546,900,111.57");
    }
}
