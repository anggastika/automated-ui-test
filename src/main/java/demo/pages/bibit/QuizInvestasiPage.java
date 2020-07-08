package demo.pages.bibit;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

public class QuizInvestasiPage extends BasePageObject {

    public void clickQuizApaSihReksaDana(){
        By locator = By.xpath("//div[contains(@class,'quizSlider')]//div[1]//a[1]//div[1]//img[1]");
        scrollIntoView(locator);
        clickOn(locator);
    }

    public void clickMulaiKuis(){clickOn(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]"));}

    public void  AllRightAnswerKenalReksaDana(){

        clickOn(By.xpath("//div[contains(@class,'am-navbar-title')]"));
        clickOn(By.xpath("//div[contains(@class,'am-navbar-title')]"));

        clickOn(By.xpath("//div[contains(@class,'am-navbar-title')]"));
        clickOn(By.xpath("//div[contains(@class,'am-navbar-title')]"));

        clickOn(By.xpath("//div[contains(@class,'am-navbar-title')]"));
        clickOn(By.xpath("//div[contains(@class,'am-navbar-title')]"));

        clickOn(By.xpath("//div[contains(@class,'am-navbar-title')]"));
        clickOn(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]"));


    }

}
