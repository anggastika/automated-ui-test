package demo.pages.bibit;

import demo.pages.base.BasePageObject;
import demo.webdriver.AndroidDriverInstance;
import demo.webdriver.WebdriverInstance;
import io.appium.java_client.TouchAction;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//class LoginPage
public class LoginPage extends BasePageObject {
    public void inputPhoneNumber(String Phone) {
        AndroidElement inputPhoneNumber = AndroidDriverInstance.androidDriver
                .findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/input[1]"));
        inputPhoneNumber.sendKeys(Phone);
    }

    public void inputOTP() {

        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);

        AndroidElement otp = (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.id("devOtp")));

        String devotp = otp.getAttribute("textContent");

        AndroidElement inputOTP = AndroidDriverInstance.androidDriver.findElement(By.xpath("//input[@data-id='0']"));

        inputOTP.sendKeys(devotp);
    }

    public void clickButtonLogin() {
        clickOn(By.id("login-btn-login"));
    }

    public void clickButtonLanjutkan() {
        AndroidElement buttonLanjutkan = AndroidDriverInstance.androidDriver
                .findElement(MobileBy.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div/div/div[1]/div[1]/div/div/div[2]/div/div[6]/a"));
        buttonLanjutkan.click();
    }

    public void inputPhoneThatHavePortofolio(){
        typeOn(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/input[1]"),"085156242296");
    }

    public void clickSmsButton(){
        clickOn(By.xpath("//div[contains(text(),'SMS')]"));
    }

    public void inputPhone(String phone) {
        typeOn(By.xpath("//input[@placeholder='contoh: 085817767044']"), phone);
    }

    public String errMsg() {
        return getText(By.xpath("//p[@class='errorspan']"));
    }

    public void inputWrongOtp(String otp){
        typeOn(By.xpath("//input[@data-id='0']"),otp);
    }

    public String otpErrMsg() {
        return getText(By.xpath("//div[@class='errorspan']"));
    }
}
