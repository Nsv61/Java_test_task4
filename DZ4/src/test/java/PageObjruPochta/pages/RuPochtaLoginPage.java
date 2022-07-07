package PageObjruPochta.pages;

import com.codeborne.selenide.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

public class RuPochtaLoginPage {
    private WebDriver driver;
    private By userfield = new By.ByCssSelector("#username");
    private By passfield = new By.ByCssSelector("#userpassword");
    public RuPochtaLoginPage (WebDriver driver){
        this.driver = driver;
    }
    public void enterlogin (String login){
        $(userfield).shouldBe(Condition.visible).sendKeys(login);
    }
    public void enterPass (String password){
       $(passfield).shouldBe(Condition.visible).sendKeys(password + Keys.ENTER);
    }
}
