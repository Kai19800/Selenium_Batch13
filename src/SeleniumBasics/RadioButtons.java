package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement radio = driver.findElement(By.cssSelector("input[value = '5 - 15']"));
        boolean question1 = radio.isEnabled();
        System.out.println(question1);
        boolean question2= radio.isDisplayed();
        System.out.println(question2);
        boolean question3 = radio.isSelected();
        System.out.println("Before clicking " + question3);
        radio.click();

        question3 = radio.isSelected();
        System.out.println("After clicking " + question3);



    }
}
