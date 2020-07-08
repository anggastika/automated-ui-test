package demo.pages.bibit;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

public class TopReksaDanaPilihanPage extends BasePageObject {

    public void clickTopReksaDana() {
        By Locator = By.xpath("//div[@class='bit-reksa-row']//div[1]//a[1]//img[1]");
        scrollIntoView(Locator);
        clickOn(Locator);
    }

    public String getName(int index) {
        return getText(By.xpath(reksaDanaCardXpathAtIndex(index) + "//div[contains(@class, 'porto-card-name')]//div[1]"));
    }

    public String getType(int index) {
        return getText(By.xpath(reksaDanaCardXpathAtIndex(index) + "//div[contains(@class, 'porto-card-name')]//div[2]"));
    }

    public String getOneYearReturn(int index) {
        return getText(By.xpath(reksaDanaCardXpathAtIndex(index) + "//div[contains(@class, 'porto-card-btm-child')][1]//div[2]"));
    }

    public String getExpenseRatio(int index) {
        return getText(By.xpath(reksaDanaCardXpathAtIndex(index) + "//div[contains(@class, 'porto-card-btm-child')][2]//div[2]"));
    }

    public String getTotalAum(int index) {
        return getText(By.xpath(reksaDanaCardXpathAtIndex(index) + "//div[contains(@class, 'porto-card-btm-child')][3]//div[2]"));
    }

    private String reksaDanaCardXpathAtIndex(int index) {
        String xpath = "//div[contains(@class, 'bestofcontent')]//div[" + (index + 1) + "]//div[contains(@class, 'am-card')]";
        By locator = By.xpath(xpath);
        scrollIntoView(locator);
        return xpath;
    }

    public void clickReksaDanaCard(int index) {
        clickOn(By.xpath(reksaDanaCardXpathAtIndex(index)));
    }
}
