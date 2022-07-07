package PageObjruPochta;

import PageObjruPochta.pages.RuPochtaLKPage;
import PageObjruPochta.pages.RuPochtaLoginPage;
import PageObjruPochta.pages.RuPochtaMainPage;
import com.codeborne.selenide.Condition;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Selenide.$;
import static java.util.concurrent.TimeUnit.SECONDS;


public class postTest {
    protected static WebDriver driver;
    private RuPochtaMainPage ruPochtaMainPage;
    private RuPochtaLoginPage ruPochtaLoginPage;
    private RuPochtaLKPage ruPochtaLKPage;
    @Before
    public void startUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        ruPochtaMainPage = new RuPochtaMainPage(driver);
        ruPochtaLoginPage = new RuPochtaLoginPage(driver);
        ruPochtaLKPage = new RuPochtaLKPage(driver);


    }
    @Test
    public void titleTest(){
        ruPochtaMainPage.openPage();
/*        Assert.assertEquals("Почта России", driver.getTitle());*/

        ruPochtaMainPage.login();
        ruPochtaLoginPage.enterlogin("tojoxi2718@mahazai.com");
        ruPochtaLoginPage.enterPass("1QAZ2wsx");
        ruPochtaLKPage.mousemove();
        ruPochtaLKPage.myPackClick();
        String bodyText = $(By.tagName("body")).shouldBe(Condition.visible).getText();
        Assert.assertTrue("No Text", bodyText.contains("Сохраняйте отправления, чтобы узнавать по электронной почте, где они находятся"));
    }
    @After
    public void end(){
        if (driver != null)
                driver.quit();
    }
}
