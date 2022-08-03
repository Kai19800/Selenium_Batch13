package DropDown_Menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Facebook {

    public static String url = "https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement create = driver.findElement(By.xpath("//a[text()='Create new account']"));
        create.click();
        Thread.sleep(2000);
        WebElement month = driver.findElement(By.id("month"));
        WebElement day = driver.findElement(By.id("day"));
        WebElement year = driver.findElement(By.id("year"));

        Select selectMonth = new Select(month);
        List<WebElement> monthOptions = selectMonth.getOptions();
        System.out.println(monthOptions.size());
        selectMonth.selectByVisibleText("May");


        Select selectdays = new Select(day);
        List<WebElement> dayOptions = selectdays.getOptions();
        System.out.println(dayOptions.size());
        selectdays.selectByIndex(7);

        Select selectYear = new Select(year);
        List<WebElement> yearOptions = selectYear.getOptions();
        System.out.println(yearOptions.size());
        selectYear.selectByIndex(42);

        Thread.sleep(2000);
        driver.quit();




    }
}
