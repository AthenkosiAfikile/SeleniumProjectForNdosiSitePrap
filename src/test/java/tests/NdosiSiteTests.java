package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class NdosiSiteTests extends Base {

    @Test
    public void verifyHomeScreenIsDisplayedTest(){
        homeScreen.verifyHomeScreenIsDisplayed();
    }

    @Test(priority = 1)
    public void clickLoginTest(){
        homeScreen.clickLogin();
    }
    @AfterTest
    public void closeBrowser(){
        driver.close();
    }
}
