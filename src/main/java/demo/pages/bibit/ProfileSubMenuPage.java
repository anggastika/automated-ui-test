package demo.pages.bibit;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

public class ProfileSubMenuPage extends BasePageObject {

    public void clickFAQ(){
        By locator = By.xpath("//div[10]//div[1]//div[1]//div[2]//div[1]");
        scrollIntoView(locator);
        clickOn(locator);
    }

    public void clickStore(){
        By locator = By.xpath("//div[12]//div[1]//div[1]//div[2]//div[1]");
        scrollIntoView(locator);
        clickOn(locator);
    }

    public void clickRatebibit(){
        By locator = By.xpath("//div[12]//div[1]//div[2]//div[2]//div[1]");
        scrollIntoView(locator);
        clickOn(locator);
    }

    public void clickBibitKeren(){clickOn(By.xpath("//body//div[@id='root']//div//div//div//div//div[2]//a[1]//span[1]"));}

    public void clickBerikanSaran(){clickOn(By.xpath("//div[3]//div[4]//div[1]//a[1]"));}

    public void clickKurangOke(){clickOn(By.xpath("//body//div[@id='root']//div//div//div[1]//div[4]//div[1]//a[1]"));}

    public void clickKomunitas(){
        By locator = By.xpath("//div[10]//div[1]//div[3]//div[2]//div[1]");
        scrollIntoView(locator);
        clickOn(locator);
    }
}
