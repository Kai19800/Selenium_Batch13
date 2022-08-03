package DropDown_Menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class eBay {
    public static String url = "https://www.ebay.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(3000);


        WebElement dropdown = driver.findElement(By.id("gh-cat"));
        Select select = new Select(dropdown);
        List<WebElement> listAll = select.getOptions();
        System.out.println(listAll.size());

        for (WebElement loop : listAll) {
            String linktext = loop.getText();
            System.out.println(linktext);
        }
        select.selectByIndex(11);
        WebElement search= driver.findElement(By.xpath("//input[@class='btn btn-prim gh-spr']"));
        search.click();

        WebElement header=driver.findElement(By.xpath("//img[@alt='eBay Logo']"));
        boolean isITdisplayed= header.isDisplayed();
        System.out.println(header.isDisplayed());


    }
}