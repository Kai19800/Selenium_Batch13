package DropDown_Menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Practice {

    public static String url = "https://syntaxprojects.com/basic-checkbox-demo.php";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        List<WebElement> checkbox = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        System.out.println(checkbox.size());

        for (WebElement loop : checkbox) {
            String checkboxValue = loop.getAttribute("value");
            if (checkboxValue.equals("Option-2") || checkboxValue.equals("Option-4")) {
                loop.click();

            }


        }


    }
}
