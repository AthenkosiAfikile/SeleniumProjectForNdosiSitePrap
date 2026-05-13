package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginScreen {
    WebDriver driver;

    @FindBy(xpath = "//span[normalize-space()='Access Learning Materials']")
    private WebElement loginPageTitleXpath;

    public LoginScreen(WebDriver driver){
        this.driver = driver;
    }

    public void verifyLoginTitle() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOf(loginPageTitleXpath));

        String expectedTitle = "Access Learning Materials";
        String actualTitle = loginPageTitleXpath.getText();

        System.out.println("Expected Results: " + expectedTitle);
        System.out.println("Actual Results: " + actualTitle);

        Assert.assertEquals(actualTitle, expectedTitle, "The login page title is not as expected");
    }

}
