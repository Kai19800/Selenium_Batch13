package DropDown_Menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDowns {
    public static String url = "https://syntaxprojects.com/basic-select-dropdown-demo.php";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement daysDropDown = driver.findElement(By.id("select-demo"));
        Select select = new Select(daysDropDown);
        select.selectByIndex(3);
        Thread.sleep(2000);
        select.selectByVisibleText("Friday");
        select.selectByValue("Sunday");
        List<WebElement> listAll= select.getOptions();
        System.out.println(listAll.size());

        for (int i=1; i<=7; i++){

            String option= listAll.get(i).getText();
            System.out.println(option);
            select.selectByIndex(i);
            Thread.sleep(1000);

        }




    }
}
