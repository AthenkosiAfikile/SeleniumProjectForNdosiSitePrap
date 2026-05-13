package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import java.time.Duration;

public class HomeScreen {

    final WebDriver driver;
    private String ExpectedResults;
    private String ActualResults;
    @FindBy(xpath = "//h1[normalize-space()='Master Test Automation']")
    private WebElement homeTitleXpath;

    @FindBy(xpath = "//span[normalize-space()='Login']")
    private WebElement loginButtonXpath;

    @FindBy(xpath = "//span[normalize-space()='Access Learning Materials']")
    private WebElement loginPageTitleXpath;

    public HomeScreen(WebDriver driver){
        this.driver = driver;
    }

    public void verifyHomeScreenIsDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(homeTitleXpath));
        homeTitleXpath.isDisplayed();

        ExpectedResults = "Master Test Automation";
        ActualResults = homeTitleXpath.getText();

        System.out.println("Expected Results: "+ ExpectedResults);
        System.out.println("Actual Results: "+ ActualResults);

        Assert.assertEquals(ActualResults,
                ExpectedResults, "The home page is not opened or title is not the visible as expected");
    }

    public void clickLogin(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(loginButtonXpath));

        if(loginButtonXpath.isDisplayed()){
            loginButtonXpath.click();
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(
                    ExpectedConditions.visibilityOf(loginPageTitleXpath)).isDisplayed();

            ExpectedResults = "Access Learning Materials";
            ActualResults = loginPageTitleXpath.getText();

            System.out.println("Expected Results: "+ ExpectedResults);
            System.out.println("Actual Results: "+ ActualResults);

            Assert.assertEquals(ActualResults,
                    ExpectedResults, "The login page is not opened or title is not the visible as expected");
        } else {
            Assert.fail("Login button is not visible or clickable");
        }

    }
}
