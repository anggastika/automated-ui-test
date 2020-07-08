package demo.pages.bibit;

import demo.pages.base.BasePageObject;
import demo.webdriver.AndroidDriverInstance;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.util.concurrent.TimeUnit;

//class RegisterPage
public class RegisterPage extends BasePageObject {

    public void clickButtonRegister(){

        AndroidElement ButtonRegister = find(By.xpath("//div[@class='buttonlogin ']/a[1]"));
        ButtonRegister.click();
    }

    public void fillAllQuestions() throws InterruptedException {

        //Question 1 DD-MM-YYYY
        find(By.className("am-list-line")).click();
        Thread.sleep(1000);
        find(By.className("am-picker-popup-header")).click();

        Thread.sleep(1000);
        find(By.xpath("//div[@class='am-picker-popup-header']/"
                + "div[@class='am-picker-popup-item am-picker-popup-header-right']")).click();
        Thread.sleep(1000);
        find(By.className("profiling-question-btn")).click();

        //Question 2

        find(By.xpath("//div[@class='question-option-box']/div[@data-option='0']")).click();
        Thread.sleep(1000);
        find(By.className("profiling-question-btn")).click();

        //Question 3

        find(By.xpath("//div[@class='profiling-question-box']/input")).sendKeys("10000000");
        Thread.sleep(1000);
        find(By.className("profiling-question-btn")).click();

        //Question 4

        find(By.xpath("//div[@class='profiling-question-box']/input")).sendKeys("500000000");
        Thread.sleep(1000);
        find(By.className("profiling-question-btn")).click();

        //Question 5

        find(By.xpath("//div[@class='question-option-box']/div[@data-option='1']")).click();
        Thread.sleep(1000);
        find(By.className("profiling-question-btn")).click();

        //Question 6
        find(By.xpath("//div[@class='question-option-box']/div[@data-option='2']")).click();
        Thread.sleep(1000);
        find(By.className("profiling-question-btn")).click();


        //Finish answering all the questions
        waitABit(10);

        find(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[3]/a")).click();
    }

    public void inputUnregisteredPhoneNumber(String Phone){

        AndroidElement inputPhone= find(By.xpath("//input[@class='react-phone-number-input__input react-phone-number-input__phone "
                + "react-phone-number-input__input--style']"));
        inputPhone.sendKeys(Phone);
        find(By.xpath("//div[@class='jsp-middle-btn ']/a")).click();
    }

    public void inputIncorrectPhoneNumber(String Phone){
        AndroidElement inputPhone= find(By.xpath("//input[@class='react-phone-number-input__input react-phone-number-input__phone "
                + "react-phone-number-input__input--style']"));
        inputPhone.sendKeys(Phone);
        find(By.xpath("//div[@class='jsp-middle-btn ']/a")).click();
    }

    public void inputRegisteredPhoneNumber(String Phone){
        AndroidElement inputPhone= find(By.xpath("//input[@class='react-phone-number-input__input react-phone-number-input__phone "
                + "react-phone-number-input__input--style']"));
        inputPhone.sendKeys(Phone);
        find(By.xpath("//div[@class='jsp-middle-btn ']/a")).click();
    }

    public void displayErrorMessage(){
        find(By.className("errorspan")).isDisplayed();
    }

    public void insertOTPforFiveTimes(){

        for (int attempt =0;attempt<5;attempt++) {
            AndroidElement backButton = find(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div/div/div[1]/div[1]/div/div/div[1]/div/div[1]/div"));
            backButton.click();

            find(By.xpath("//div[@class='jsp-middle-btn ']/a")).click();
            if (find(By.className("errorspan")).isDisplayed()){
                break;
            }
        }
    }

    public void selectEducation(String education) {
        clickDropdown("Pendidikan");
        selectData(education, 1);
        clickPilihButton();
    }

    public void selectAnnualSalary(String salary) {
        clickDropdown("Pendapatan Pertahun");
        selectData(salary, 1);
        clickPilihButton();
    }

    public void selectSalarySource(String source) {
        clickDropdown("Sumber Penghasilan");
        selectData(source, 1);
        clickPilihButton();
    }

    public void selectBankName(String bankName) {
        clickDropdown("Nama Bank");
        typeOn(By.xpath("//input[@type='search']"), bankName);
        clickOn(By.xpath(String
                .format("//div[@class='bank-picker']//div[@class='am-list-content' and text()='%s']",
                        bankName)));
    }

    public void inputBankAccountNumber(String accNum) {
        By locator = By.xpath("//div[text()='Nomor Rekening']/ancestor::div[@class='am-list']//input");
        scrollIntoView(locator);
        typeOn(locator, accNum);
    }

    public void inputBankAccountName(String accName) {
        By locator = By
                .xpath("//div[text()='Nama Pemilik Rekening']/ancestor::div[@class='am-list']//input");
        scrollIntoView(locator);
        typeOn(locator, accName);
    }

    public void clickDropdown(String name) {
        By locator = By.xpath(String
                .format("//div[text()='%s']/ancestor::div[@class='am-list']//div[@class='am-list-content']",
                        name));
        scrollIntoView(locator);
        clickOn(locator);
    }

    public void writeSignIn() {
        By locator = By.xpath("//div[@class='tanda-tangan']");
        scrollIntoView(locator);
        clickOn(locator);
        //canvas
        WebElement element = find(By.xpath("//canvas"));
        Actions actionBuilder = new Actions(getDriver());
        Action drawOnCanvas = actionBuilder
                .clickAndHold(element)
                .moveByOffset(50, 50)
                .moveByOffset(60, 70)
                .moveByOffset(-140, -140)
                .release(element)
                .build();
        drawOnCanvas.perform();
//      new Actions(getDriver()).dragAndDropBy(element, 0, -25).perform();
        clickOn(By.xpath("//span[text()='Save']"));
    }

    public void clickPilihButton() {
        clickOn(By.xpath("//div[text()='Pilih']"));
    }

    public void uploadKTP(){
        clickOn(By.xpath("//div[text()='Foto Selfie dengan KTP']"));
        waitABit(1);
        clickOn(By.xpath("//span[text()='Upload Selfie dengan KTP']"));
        String ktpDir = System.getProperty("user.dir") + File.separator + "ktp" + File.separator + "ktp-sample.jpg";
        System.out.println("");
    }

}
