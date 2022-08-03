package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        Thread.sleep(2000);
        driver.findElement(By.className("button")).click();
        String title = driver.getTitle();
        String ExpectedTitle = "Web Orders";
        if (title.equals(ExpectedTitle)) {
            System.out.println("Title is correct");
        } else {
            System.out.println("Title is not correct");
        }
        driver.findElement(By.linkText("Logout")).click();
        Thread.sleep(4000);



    }
}

