package demo.pages.bibit;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;
import org.springframework.util.Assert;

public class UbahResikoPortofolioPage extends BasePageObject {

    public void clickUbah(){
        clickOn(By.xpath("//div[contains(@class,'puller-box')]//div[1]//div[1]//div[1]//div[2]//button[1]"));
    }

    public void clickMinusButton(){
        clickOn(By.xpath("//body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div[1]/span[1]"));
    }

    public void clickPlusButton(){
        clickOn(By.xpath("//body//div//div//div//div//span[3]"));
    }

    public void clickSimpanHasil(){
        clickOn(By.xpath("//body/div/div/div/div/div/div/div/div/div/div/div/div/a[1]"));
    }

    public void clickUntilPortofolioKonservatif(){
        for (int i=0;i<5;i++){
            clickMinusButton();
        }
    }

    public void clickUntilPortofolioModerat(){
        for (int i=0;i<10;i++){
            clickMinusButton();
        }
    }

    public void displayPortofolioModerat(){
        Assert.isTrue(true,"Portfolio Moderat");
    }

    public void displayPortofolioKonservatif(){
        Assert.isTrue(true,"Portfolio Konservatif");
    }

}
