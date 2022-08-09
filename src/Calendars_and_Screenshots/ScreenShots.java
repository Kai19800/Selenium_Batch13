package Calendars_and_Screenshots;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShots {

    public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement loginButton = driver.findElement(By.className("button"));
        loginButton.click();

        //downcasting to driver in order to interact with web page
        TakesScreenshot ts = (TakesScreenshot)driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE); // the screenshot is taken

            // copy the file and paste in the new location as png file
            // commons.io jar file is needed for this
        try {
            FileUtils.copyFile(srcFile, new File("screenshots/SmartBear/adminPage111111.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}

