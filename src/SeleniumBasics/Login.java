package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.Facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("kdc.2727@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("FuckFacebook99%");
        //driver.findElement(By.name("login")).click();
        // driver.findElement(By.linkText("Forgot password?")).click();
        driver.findElement(By.partialLinkText("Forgot")).click();

    }
}
