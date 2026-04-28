package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

    static WebDriver driver;

    public static WebDriver startBrowser(String BrowserChoice, String siteURL){
        if(BrowserChoice.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();

        } else if(BrowserChoice.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        } else if(BrowserChoice.equalsIgnoreCase("safari")){
            driver = new SafariDriver();
        } else {
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.get(siteURL);
        return driver;
    }
//    @Test
//    public void testBrowser() throws InterruptedException {
//        startBrowser("chome", "https://ndosisimplifiedautomation.vercel.app/");
//        Thread.sleep(3000);
//        driver.close();
//    }
}
