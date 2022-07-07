package PageObjruPochta.pages;
import com.codeborne.selenide.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Selenide.$;

public class RuPochtaLKPage {

    private WebDriver driver;
    public RuPochtaLKPage(WebDriver driver){
        this.driver = driver;
    }
    public void mousemove () {
        /*WebElement hoverable =*/
                $(By.xpath("(//span[@class='Font-sc-le1wax-0 gwiFve'])[1]")).shouldBe(Condition.visible).hover();
       /* new Actions(driver)
                .moveToElement(hoverable)
                .perform();*/
    }
    public void myPackClick (){
        $(By.xpath("(//a[@class='Linkstyles__LinkStyled-sc-1xo7cu-0 gbhgTg'])[1]")).shouldBe(Condition.visible).click();
    }
}
