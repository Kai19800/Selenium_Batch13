package Alerts_And_Handles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task {
    public static String url = "https://www.syntaxprojects.com/dynamic-elements-loading.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement start = driver.findElement(By.id("startButton"));
        start.click();

        WebDriverWait wait=new WebDriverWait(driver, 6);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Welcome Syntax')]")));

        WebElement text = driver.findElement(By.xpath("//*[contains(text(),'Welcome Syntax')]"));
        System.out.println(text.getText());
    }
}