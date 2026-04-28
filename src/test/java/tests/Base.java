package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HomeScreen;
import utilities.BrowserFactory;

public class Base {
    final WebDriver driver = BrowserFactory
            .startBrowser("chrome", "https://ndosisimplifiedautomation.vercel.app/");

    HomeScreen homeScreen = PageFactory.initElements(driver , HomeScreen.class);
}
