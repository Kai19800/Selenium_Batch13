package Advanced_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dynamic_Controls_HW {
    public static String url = "https://the-internet.herokuapp.com/dynamic_controls";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();
        Thread.sleep(2000);
        WebElement remove = driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));
        remove.click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        WebElement text = driver.findElement(By.xpath("//p[@id='message']"));

        if (text.isDisplayed()) {
            System.out.println("Text is present");
        }
        WebElement enabledButton = driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
        enabledButton.click();
        WebDriverWait waitAgain = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains (text(),'enabled!')]")));
        WebElement textagain = driver.findElement(By.xpath("//p[contains (text(),'enabled!')]"));
        if (textagain.isDisplayed()) {
            System.out.println("Text is enabled");

            WebElement Box = driver.findElement(By.xpath("//input[@style='width: 30%;']"));
            Box.sendKeys("Hello World");
            WebElement clickDisable = driver.findElement(By.xpath("//button[contains(text(),'Disable')]"));
            clickDisable.click();

            WebDriverWait wait4disabled = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains (text(),'disabled!')]")));
            WebElement waitf = driver.findElement(By.xpath("//p[contains (text(),'disabled!')]"));
            if (waitf.isDisplayed()) {
                System.out.println("Text is disabled");
            }


        }
    }
}


