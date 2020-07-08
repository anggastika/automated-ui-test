package demo.pages.bibit;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

//class TransaksiPage
public class TransaksiPage extends BasePageObject {

    public void clickTransaksiButton(){
        clickOn(By.xpath("//div[@class='am-tabs-tab-bar-wrap']//div[3]"));
    }

    public void  donthaveTransaksi(){
        isDisplayed(By.xpath("//div[@class='empty-state-box']//img"));
    }

    public void  donthaveHistory(){
        isDisplayed(By.xpath("//div[@class='empty-state-box']//img"));
    }

    public void inputPhoneThatHaveTransaksi(){
        typeOn(By.xpath("//input[@class='react-phone-number-input__input react-phone-number-input__phone "
                + "react-phone-number-input__input--style']"),"085156242296");
    }

    public void displayedTransaksi(){
        isDisplayed(By.className("top-card"));

    }

    public void clickHistoryTab(){
        clickOn(By.xpath("//div[@class='am-tabs-default-bar-tab']"));
    }

    public void displayedHistory(){
        isDisplayed(By.xpath("//body/div/div[@class='App fullheight styleHeaderNormal styleGreen styleCard logged-in']/div[@class='router']/div[@class='outerwrap orders-history has-tab']/div[@class='am-tab-bar']/div[@class='am-tabs am-tabs-horizontal am-tabs-bottom']/div[@class='am-tabs-content-wrap']/div[@class='am-tabs-pane-wrap am-tabs-pane-wrap-active']/div[@class='am-tab-bar-item']/div[@class='content-wrapper orders order-tab-order']/div[@class='content-box']/div[@class='am-tabs am-tabs-horizontal am-tabs-top']/div[@class='am-tabs-content-wrap am-tabs-content-wrap-animated']/div[@class='am-tabs-pane-wrap am-tabs-pane-wrap-active']/div[@class='puller-box']/div[@class='ordertab-history']/div[2]"));
    }
}
