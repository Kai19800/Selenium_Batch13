package ActionsClass;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class JS_Executor_Demo3 {
    public static String url = "https://www.google.com/ncr";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.open('https://www.amazon.com')");

        WebElement search= driver.findElement(By.name("q"));
        search.sendKeys("Amazon", Keys.ENTER);

        String MainPageHandle= driver.getWindowHandle();
        driver.switchTo().window(MainPageHandle);
        Set<String> AllHandles= driver.getWindowHandles();
        Iterator<String> IT=AllHandles.iterator();
        MainPageHandle = IT.next();
        Thread.sleep(2000);
        String ChildHandle= IT.next();
        Thread.sleep(2000);
        driver.switchTo().window(MainPageHandle);
        Thread.sleep(2000);
        driver.switchTo().window(ChildHandle);

    }
}
