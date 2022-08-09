package ActionsClass;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_Executor_Demo1 {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.backgroundColor='yellow'", username);
        js.executeScript("arguments[0].style.backgroundColor='pink'", password);

        WebElement loginButton=driver.findElement(By.id("btnLogin"));
        js.executeScript("arguments[0].click()", loginButton);





    }
}
