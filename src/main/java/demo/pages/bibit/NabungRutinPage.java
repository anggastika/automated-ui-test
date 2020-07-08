package demo.pages.bibit;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

public class NabungRutinPage extends BasePageObject {

    public void clickNabungRutin(){
        By locator = By.xpath("//div[@id='root']//div[15]//a[1]");
        scrollIntoView(locator);
        clickOn(locator);}

    public void clickTambahPembelianRutin(){clickOn(By.className("bit-add-rec-btn"));}

    public void clickPilihPortofolio(){
        clickOn(By.className("select-recurring-portfolio"));

        clickOn(By.xpath("//div[@class='am-modal-wrap am-modal-wrap-popup']//label[2]"));
    }

    public void clickPilihProduct(){
        clickOn(By.className("select-recurring-portfolio"));

        clickOn(By.xpath("//body/div/div/div[contains(@class,'am-modal-wrap')]/div[@class='am-modal cust-modal-close']/div[@class='am-modal-content']/div[@class='am-modal-body']/div[@class='get-started discover-starting-page']/div[1]/div[1]/div[2]"));

        clickOn(By.xpath("//body/div/div/div[contains(@class,'am-modal-wrap')]/div[@class='am-modal bc-modal-body cust-modal-close']/div[@class='am-modal-content']/div[@class='am-modal-body']/div/div[@class='content']/div[1]/div[2]/div[1]/div[1]/div[1]"));
    }

    public void insertNilaiInvest(String Invest){
        By locator = By.id("recurringValue");
        clickOn(locator);
        typeOn(locator,Invest);
    }

    public void gopayAsPayment(){
        clickOn(By.xpath("//body/div/div[@class='App fullheight logged-in']/div[@class='router']/div[@class='outerwrap recurring-create']/div[@class='am-tab-bar']/div[@class='am-tabs am-tabs-horizontal am-tabs-bottom']/div[@class='am-tabs-content-wrap']/div[@class='am-tabs-pane-wrap am-tabs-pane-wrap-active']/div[@class='am-tab-bar-item']/div[@class='content-wrapper']/div[@class='content-box']/div/div[@class='bit-recurring']/div[@class='recurring-payment-method']/label[1]"));
    }

    public void clickTerapkan(){
        clickOn(By.xpath("//a[@class='am-button bit-recurring-btn am-button-primary']"));
    }

    public void clickConfirm(){
        clickOn(By.xpath("//div[@class='am-modal-body']//div//a[@class='am-button bit-recurring-btn am-button-primary']"));
    }

    public void displayError(){
        isDisplayed(By.xpath("//img[@class='errorImg']"));
    }

    public void displaySuccessMessage(){
        isDisplayed(By.xpath("//div[@class='recurringSuccess']//img"));
    }

    public void clickPortofolioNotSchedule(){
        clickOn(By.className("select-recurring-portfolio"));
        clickOn(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]"));
    }
}
