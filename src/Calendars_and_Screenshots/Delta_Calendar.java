package Calendars_and_Screenshots;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Delta_Calendar {
    public static String url = "https://www.delta.com/";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();


        WebElement calendar = driver.findElement(By.id("calDepartLabelCont"));
        calendar.click();
        WebElement nextButton = driver.findElement(By.linkText("Next"));
        WebElement month = driver.findElement(By.className("dl-datepicker-month-0"));
        String selectMonthText = month.getText();

        while (!selectMonthText.equals("November")) {
            nextButton.click();
            selectMonthText = month.getText();

        }
        List<WebElement> selectDay = driver.findElements(By.xpath("//tbody[@class = 'dl-datepicker-tbody-0']/tr/td"));
        for (WebElement loop : selectDay) {
            if (loop.getText().equals("30")) {
                loop.click();
                break;
            }
        }
            WebElement returnMonth = driver.findElement(By.className("dl-datepicker-month-1"));
            String rMonthtext = returnMonth.getText();

            while(!rMonthtext.equals("December")) {
                nextButton.click();
                rMonthtext = returnMonth.getText();
            }

            List<WebElement> returnDates = driver.findElements(By.xpath("//tbody[@class = 'dl-datepicker-tbody-1']/tr/td"));
            for(WebElement returnDate: returnDates) {
                if(returnDate.getText().equals("20")) {
                    returnDate.click();
                    break;
                }
            }
        WebElement doneButton = driver.findElement(By.className("donebutton"));
        doneButton.click();

        }
    }

