package POM_TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;

    /**
     * This method will navigate to a website using the given url
     *
     * @param url
     */
    public static void openWithSpecificURL(String url) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    /**
     * This method will quit the open browser
     */
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}