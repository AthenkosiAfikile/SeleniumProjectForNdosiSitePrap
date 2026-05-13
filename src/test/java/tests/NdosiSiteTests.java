package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class NdosiSiteTests extends Base {

    @Test
    public void verifyHomeScreenIsDisplayedTest() throws InterruptedException {
        homeScreen.verifyHomeScreenIsDisplayed();
        Thread.sleep(3000);
    }

    @Test(priority = 1)
    public void clickLoginTest(){
        homeScreen.clickLogin();
    }

    @Test(priority = 2)
    public void verifyLoginTitleTest() throws InterruptedException {
        homeLoginScreen.verifyLoginTitle();
        Thread.sleep(3000);
    }

    @AfterTest
    public void closeBrowser(){
        driver.close();
    }
}
