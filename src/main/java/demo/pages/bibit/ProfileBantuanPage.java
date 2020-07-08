package demo.pages.bibit;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

public class ProfileBantuanPage extends BasePageObject {

    public void clickBantuanButton(){
        By locator = By.xpath("//div[10]//div[1]//div[4]//div[2]//div[1]");
        scrollIntoView(locator);
        clickOn(locator);
    }

    public void clickSupportButton(){clickOn(By.xpath("//body/div[@id='root']/div[@class='App fullheight logged-in']/div[@class='router']/div[@class='outerwrap bantuan']/div[@class='am-tab-bar']/div[@class='am-tabs am-tabs-horizontal am-tabs-bottom']/div[@class='am-tabs-content-wrap']/div[@class='am-tabs-pane-wrap am-tabs-pane-wrap-active']/div[@class='am-tab-bar-item']/div[@class='content-wrapper']/div[@class='content-box']/div[@class='bit-bantuan-wrapper']/div[@class='bit-bantuan-box']/div[1]"));}

    public void clickWAButton(){clickOn(By.xpath("//body/div[@id='root']/div[@class='App fullheight logged-in']/div[@class='router']/div[@class='outerwrap bantuan']/div[@class='am-tab-bar']/div[@class='am-tabs am-tabs-horizontal am-tabs-bottom']/div[@class='am-tabs-content-wrap']/div[@class='am-tabs-pane-wrap am-tabs-pane-wrap-active']/div[@class='am-tab-bar-item']/div[@class='content-wrapper']/div[@class='content-box']/div[@class='bit-bantuan-wrapper']/div[@class='bit-bantuan-box']/a[1]/div[1]"));}

    public void clickEmailButton(){clickOn(By.xpath("//body/div[@id='root']/div[@class='App fullheight logged-in']/div[@class='router']/div[@class='outerwrap bantuan']/div[@class='am-tab-bar']/div[@class='am-tabs am-tabs-horizontal am-tabs-bottom']/div[@class='am-tabs-content-wrap']/div[@class='am-tabs-pane-wrap am-tabs-pane-wrap-active']/div[@class='am-tab-bar-item']/div[@class='content-wrapper']/div[@class='content-box']/div[@class='bit-bantuan-wrapper']/div[@class='bit-bantuan-box']/a[2]/div[1]"));}

    public void displaySupportPage(){isDisplayed(By.name("message"));}

    public void displayWA(){isDisplayed(By.id("main_block"));}
}
