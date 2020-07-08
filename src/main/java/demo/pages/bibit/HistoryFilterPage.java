package demo.pages.bibit;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

public class HistoryFilterPage extends BasePageObject {

    public void clickFilter(){
        clickOn(By.className("historyFilter"));
    }

    public void clickPembelianTransaction(){
        clickOn(By.id("buy"));
    }

    public void clickPenjualanTransaction(){
        clickOn(By.id("sell"));
    }

    public void clickSemuaTransaction(){
        clickOn(By.xpath("//body/div/div/div/div/div/div/div[1]/div[1]/div[1]/div[1]"));
    }

    public void clickSuccessfulStatus(){clickOn(By.id("accept"));}

    public void clickExpiredStatus(){clickOn(By.id("reject"));}

    public void clickAllStatus(){clickOn(By.xpath("//body/div/div/div/div/div/div/div/div/div[2]/div[3]"));}

    public void clickOneYearPeriod(){clickOn(By.id("1y"));}

    public void clickSixMonthsPeriod(){clickOn(By.id("6m"));}

    public void clickThreeMonthsPeriod(){clickOn(By.id("3m"));}

    public void clickOneMonthsPeriod(){clickOn(By.id("1m"));}

    public void displayAllBuyingTransaction(){
        isDisplayed(By.className("hisNewProd"));
    }

    public void displayAllSellingTransaction(){
        isDisplayed(By.className("hisNewProd"));
    }

    public void clickTerapkanButton(){
        clickOn(By.className("terapkan"));
    }


}
