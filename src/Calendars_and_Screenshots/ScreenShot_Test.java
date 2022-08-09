package Calendars_and_Screenshots;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;

public class ScreenShot_Test {
    public static String url = "http://www.amazon.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        TakesScreenshot ts = (TakesScreenshot)driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(srcFile, new File("screenshots/SmartBear/amazon.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
