package Calendars_and_Screenshots;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calendars {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();

        WebElement leave = driver.findElement(By.id("menu_leave_viewLeaveModule"));
        leave.click();

        WebElement calendar = driver.findElement(By.id("calFromDate"));
        calendar.click();
        WebElement month = driver.findElement(By.className("ui-datepicker-month"));
        Select select = new Select(month);
        select.selectByVisibleText("Aug");

        List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement loop : days) {
            String dateText = loop.getText();
            if (dateText.equals("15"))
               loop.click();


        }

    }
}