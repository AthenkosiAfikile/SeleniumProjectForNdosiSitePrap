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

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//h1[normalize-space()='Master Test Automation']")
    WebElement homeTitleXpath;

    public HomeScreen(WebDriver driver){
        this.driver = driver;
    }

    public void verifyHomeScreenIsDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(homeTitleXpath));
        homeTitleXpath.isDisplayed();

        String ExpectedResults = "Master Test Automation";
        String ActualResults = homeTitleXpath.getText();

        System.out.println("Expected Results: "+ ExpectedResults);
        System.out.println("Expected Results: "+ ActualResults);

        Assert.assertEquals(ActualResults,
                ExpectedResults, "The home page is not opened or title is not the visible as expected");
    }
}
