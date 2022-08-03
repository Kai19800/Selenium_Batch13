package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");
        driver.manage().window().maximize();
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("The number of links is "+ allLinks.size());
        for (WebElement link : allLinks){
            String linktext=link.getText();
            String FullLinks = link.getAttribute("href");
            if (!linktext.isEmpty()){
                System.out.println(linktext+"   "+ FullLinks);

            }

        }
    }
}
