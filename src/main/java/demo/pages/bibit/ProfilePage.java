package demo.pages.bibit;

import demo.pages.base.BasePageObject;
import demo.webdriver.AndroidDriverInstance;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

//class ProfilePage
public class ProfilePage extends BasePageObject {

    public void clickButtonProfil(){
        clickOn(By.xpath("//div[@class='am-tabs-tab-bar-wrap']//div[5]"));
    }

    public void clickDataPribadi(){
        clickOn(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]" +
                "/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]"));
    }

    public void insertPin(){
        for (int attempt =1;attempt<7;attempt++) {
            clickOn(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/span[1]" +
                    "/div[1]/div[2]/div[1]/div[2]/div[2]/div[9]"));
        }
    }

    public void clickUbahDataPersonal(){
        By locator = By.xpath("//a[@class='am-button primary-btn fixed btnWMargin']");
        scrollIntoView(locator);
        clickOn(locator);
    }

    public void inputNewAlamat(){

        AndroidElement locator = AndroidDriverInstance.androidDriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]" +
                        "/div[2]/div[1]/div[10]/div[2]/div[1]/div[1]"));
        locator.click();
        waitABit(5);

       // String text1 = locator.getText();
       // int maxChars1 = text1.length();
       // for(int i =0;i < maxChars1;i++) {
       //     locator.sendKeys(Keys.BACK_SPACE);
     //   }

        typeOn(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]" +
                "/div[2]/div[1]/div[10]/div[2]/div[1]/div[1]"),"Praja raya");
    }

    public void clickSimpanPerubahan(){
        clickOn(By.xpath("//a[@class='am-button primary-btn fixed btnWMargin']"));
    }

    public void clickKodePromo(){
        By locator = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/div[2]/div[2]/div[1]");
        scrollIntoView(locator);
        clickOn(locator);
    }

    public void inputKodePromo(){
        typeOn(By.className("bit-voucher-input"),"TEST4NN4");
    }

    public void clickVerifikasiKodePromo(){
        clickOn(By.xpath("//a[@class='am-button bit-voucher-purple-btn am-button-primary']"));
    }

    public void displayInvalidKodePromo(){
        isDisplayed(By.className("invalid-input-txt"));
    }

    public void displayKodePromoUsed(){
        isDisplayed(By.className("invalid-input-txt"));
    }

    public void inputInvalidKodePromo(){
        typeOn(By.className("bit-voucher-input"),"123456");
    }

    public void clickVoucherSaya(){
        By locator = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/div[3]/div[2]/div[1]");
        scrollIntoView(locator);
        clickOn(locator);
    }

    public void displayVoucher(){
        isDisplayed(By.className("bit-voucher-box"));
    }

    public void clickKamusInvestasi(){
        By locator = By.xpath("//div[contains(text(),'Kamus Investasi')]");
        scrollIntoView(locator);
        clickOn(locator);
    }

    public void inputInSearchBar(String KeyWord){
        By locator = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/textarea[1]");
        typeOn(locator,KeyWord);
    }

    public void displayResultSearch(){
        isDisplayed(By.className("am-card-header"));
    }

    public void inputKodePromoAlreadyUsed(){
        typeOn(By.className("bit-voucher-input"),"TESTI9IF");
    }

    public void clickLogOut(){
        By locator = By.xpath("//div[contains(text(),'Log Out')]");
        scrollIntoView(locator);
        clickOn(locator);
    }

    public void displayMain(){
        isDisplayed(By.className("arrowGrad"));
    }

}
