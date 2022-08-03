package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SyntaxProjects {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
        Thread.sleep(2000);
        WebElement practice= driver.findElement(By.xpath("//a[text()='Check Box Demo']/preceding-sibling::a"));
        practice.click();
        WebElement enter= driver.findElement(By.xpath("//input[starts-with(@placeholder,'Please enter')]"));
        enter.sendKeys("Selenium Rocks");
        Thread.sleep(2000);
        WebElement show = driver.findElement(By.cssSelector("button[onclick *='show']"));
        show.click();
        Thread.sleep(2000);
        driver.quit();
    }
}
