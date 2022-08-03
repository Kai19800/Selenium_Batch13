package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement username = driver.findElement(By.cssSelector("input[name='txtUsername']"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.cssSelector("input[name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.cssSelector("input[name='Submit']"));
        loginButton.click();
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement logo = driver.findElement(By.cssSelector("img[alt='OrangeHRM']"));
        boolean question = logo.isDisplayed();
        if (question=true){
            System.out.println("Logo is displayed");
        }




    }
}
