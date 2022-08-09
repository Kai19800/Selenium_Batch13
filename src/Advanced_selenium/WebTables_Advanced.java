package Advanced_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTables_Advanced {
    public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        Thread.sleep(2000);
        driver.findElement(By.className("button")).click();

        List<WebElement> AllRows = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
        // for (WebElement loop:AllRows){
        //   String AllTableRows= loop.getText();
        // System.out.println(AllTableRows);

        for (int i = 1; i < AllRows.size(); i++) {
            String AllTableRows = AllRows.get(i).getText();
            System.out.println(AllTableRows);

            if (AllTableRows.contains("FamilyAlbum")) {
                List<WebElement> AllCheckboxes = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[1]"));
                AllCheckboxes.get(i - 1).click();
            }
        }
    }
}
