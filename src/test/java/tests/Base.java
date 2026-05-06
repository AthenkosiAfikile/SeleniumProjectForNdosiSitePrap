package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.*;
import pages.LoginScreen;
import utilities.BrowserFactory;

public class Base {
    final WebDriver driver = BrowserFactory
            .startBrowser("chrome", "https://ndosisimplifiedautomation.vercel.app/");

    HomeScreen homeScreen = PageFactory.initElements(driver , HomeScreen.class);
    LoginScreen homeLoginScreen = PageFactory.initElements(driver , LoginScreen.class);
}
