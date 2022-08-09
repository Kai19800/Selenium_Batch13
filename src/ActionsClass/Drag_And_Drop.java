package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {
    public static String url = "https://jqueryui.com/droppable/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        driver.switchTo().frame(0);

        WebElement Drag= driver.findElement(By.id("draggable"));
        WebElement AndDrop= driver.findElement(By.id("droppable"));
        Actions action=new Actions(driver);
        //action.dragAndDrop(Drag, AndDrop).perform();
        action.clickAndHold(Drag).moveToElement(AndDrop).release().build().perform();

        Thread.sleep(2000);
        driver.navigate().refresh();

    }
}