package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.navigate().to("http://www.google.com");
        driver.navigate().back();
        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().refresh();
        driver.close();


    }
}
