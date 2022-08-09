package Calendars_and_Screenshots;

import javafx.scene.control.Tab;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class aaHW {
    public static String url = "https://aa.com/homepage.do";

    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement destinationBox = driver.findElement(By.id("reservationFlightSearchForm.destinationAirport"));
        destinationBox.sendKeys("DXB");

        WebElement Calendar = driver.findElement(By.className("ui-datepicker-trigger"));
        Calendar.click();

        WebElement PickDepartMonth = driver.findElement(By.className("ui-datepicker-month"));
        String selectMonthText = PickDepartMonth.getText();

        while (!selectMonthText.equals("November")) {
            WebElement nextButton = driver.findElement(By.xpath("//a[@data-handler='next']"));
            nextButton.click();
            selectMonthText = PickDepartMonth.getText();
        }
        List<WebElement> PickDepartDay = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement loopDepartDay : PickDepartDay) {
            if (loopDepartDay.getText().equals("10")) {
                loopDepartDay.click();
                break;
            }

        }

    }
}