package PageObjruPochta.pages;

import com.codeborne.selenide.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class RuPochtaMainPage {
    private WebDriver driver;
    public RuPochtaMainPage(WebDriver driver){
        this.driver = driver;
    }

    public void openPage(){
        open("https://pochta.ru");
    }
    public void login(){
        $(By.xpath("(//a[@href='/api/auth/login'])[1]")).shouldBe(Condition.visible).click();
        /*driver.findElement(By.xpath("(//a[@href='/api/auth/login'])[1]")).click();*/
    }
}
