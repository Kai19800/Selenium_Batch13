package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaSoft_HW {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Khalid");
        driver.findElement(By.id("customer.lastName")).sendKeys("Hassan");
        driver.findElement(By.id("customer.address.street")).sendKeys("1201 S Eads St.");
        driver.findElement(By.id("customer.address.city")).sendKeys("Arlington");
        driver.findElement(By.id("customer.address.state")).sendKeys("VA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("22202");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("9546692969");
        driver.findElement(By.id("customer.ssn")).sendKeys("123-34-4567");
        driver.findElement(By.id("customer.username")).sendKeys("Kai1980");
        driver.findElement(By.id("customer.password")).sendKeys("Zxcv12345");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Zxcv12345");
        driver.findElement(By.className("button")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys("Kai1980");
        driver.findElement(By.name("password")).sendKeys("Zxcv12345");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("ng-binding")).click();
        driver.findElement(By.xpath("//a[text()='Bill Payment to Nata']")).click();




    }
}
