package demo.pages.bibit;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

public class AktifasiAtPofilePage extends BasePageObject {

    public void clickAktifasiPreferensiSyariah(){
        clickOn(By.xpath("//div[4]//p[2]//span[1]"));
    }

    public void clickAktifasiPinLogin(){
        clickOn(By.xpath("//div//div//div//div//div//div//div//div//div[5]//p[2]//span[1]"));
    }

    public void clickAktifasiSembunyikanNominal(){
        clickOn(By.xpath("//div[6]//p[2]//span[1]"));
    }

    public void clickHome(){
        clickOn(By.xpath("//body/div/div/div/div/div[1]/div[1]/div[2]/div[1]/div[1]"));
    }

    public void displayHiddenNominal(){
        isDisplayed(By.xpath("//body/div/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div[2]/div[1]/div[2]/div[1]"));
    }

}
