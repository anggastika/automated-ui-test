package demo.pages.bibit;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

public class TipsUntukKamuPage extends BasePageObject {

    public void clickOneOfTipsInMainPage(){
        By locator = By.xpath("//div[contains(@class,'puller-box')]//div[1]//div[1]//button[1]//div[1]//img[1]");
        scrollIntoView(locator);
        clickOn(locator);
    }

    public void seeTheDisplayedTips(){
        isDisplayed(By.className("entry-title"));
    }

    public void clickSeeAllTipsUntukKamu(){
        By locator = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[17]/div[1]/div[1]/a[1]");
        scrollIntoView(locator);
        clickOn(locator);
    }

    public void seeDisplayedAllTipsUntukKamu(){
        isDisplayed(By.className("bit-article-row"));
    }

    public void clickEducationCategory(){
        clickOn(By.xpath("//div[@class='bit-article-cat-box']//div[1]//div[1]"));
    }

    public void seeDisplayedTipsEducationCategory(){
        isDisplayed(By.className("bit-article-desc"));
    }

    public void clickTipsEducationCategory(){
        clickOn(By.xpath("//div[@class='am-tabs-content-wrap am-tabs-content-wrap-animated']//div[@class='am-tabs-pane-wrap am-tabs-pane-wrap-active']//div[@class='bit-article-row']"));

    }

}
