package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Hover_Over {

    public static String url = "http://www.amazon.com";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement accountsAndLists = driver.findElement(By.id("nav-link-accountList"));
        // create actions class object
        Actions action = new Actions(driver);
        // perform necessary action from actions class
        action.moveToElement(accountsAndLists).perform();
    }
}