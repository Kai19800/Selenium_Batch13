package ActionsClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Right_Double_Click {
    public static String url = "https://demo.guru99.com/test/simple_context_menu.html";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));

        Actions action = new Actions(driver);
        action.contextClick(rightClickButton).perform();

        WebElement edit = driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-edit']"));
        edit.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();
        //or we can use
        //action.click(edit);

        WebElement doubleClickButton= driver.findElement(By.xpath("//button[contains(text(),'See Alert')]"));
        action.doubleClick(doubleClickButton).perform();

        System.out.println(alert.getText());
        alert.accept();

    }
}