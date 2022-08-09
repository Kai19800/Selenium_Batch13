package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_Executor_Demo2 {
  public static String url="https://www.amazon.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        JavascriptExecutor js=(JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0, 3000)"); //scroll down
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -3000)"); //scroll up
        Thread.sleep(2000);
        WebElement bottomOfPage= driver.findElement(By.className("navFooterBackToTopText"));
        js.executeScript("arguments[0].scrollIntoView(true)", bottomOfPage); //scroll to a specific location

    }
    }
