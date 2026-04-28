package tests;

import org.testng.annotations.Test;

public class NdosiSiteTests extends Base {

    @Test
    public void verifyHomeScreenIsDisplayedTest(){
        homeScreen.verifyHomeScreenIsDisplayed();
    }
}
