package Advanced_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class Pagination {
    public static String url = "http://www.syntaxprojects.com/table-pagination-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        List<WebElement> MyTable = driver.findElements(By.xpath("//tbody[@id='myTable']/tr"));
        WebElement nextButton = driver.findElement(By.xpath("//a[@class='next_link']"));
        boolean StudentMissing = true;

        while (StudentMissing) {
            for (WebElement loop : MyTable) {
                String rows = loop.getText();
                if (rows.contains("Archy J")) {
                    StudentMissing = false;
                    System.out.println(rows);
                }
            }
            if (StudentMissing) {
                nextButton.click();
            }
        }
    }
}