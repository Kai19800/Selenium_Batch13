package Alerts_And_Handles;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

    public static String url="http://www.uitestpractice.com/Students/Switchto";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        WebElement simpleAlertButton=driver.findElement(By.id("alert"));
        simpleAlertButton.click();
        Thread.sleep(2000);
        Alert simpleAlert=driver.switchTo().alert();
        simpleAlert.accept();

        WebElement confirmAlert= driver.findElement(By.id("confirm"));
        confirmAlert.click();
        Thread.sleep(2000);
        Alert confirmHandle=driver.switchTo().alert();
        String confirmAlertText=confirmHandle.getText();
        System.out.println(confirmAlertText);
        confirmHandle.dismiss();

        WebElement PromptButton=driver.findElement(By.id("prompt"));
        PromptButton.click();
        Alert SwitchToPrompt=driver.switchTo().alert();
        SwitchToPrompt.sendKeys("Hello");
        SwitchToPrompt.accept();


    }
}
