package Calendars_and_Screenshots;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calendar_HW1 {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) throws InterruptedException {

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
        WebElement leaveButton = driver.findElement(By.id("menu_leave_viewLeaveModule"));
        leaveButton.click();

        //How to identify the calendar button?
        WebElement FromCalendarButton = driver.findElement(By.className("ui-datepicker-trigger"));
        FromCalendarButton.click();
        //How to identify the month drop down menu?
        WebElement monthDropdown = driver.findElement(By.className("ui-datepicker-month"));
        monthDropdown.click();
        //How to select the month?
        Select select = new Select(monthDropdown);
        select.selectByVisibleText("May");

        //How to select the day?
        List<WebElement> SelectAday = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement loopDays : SelectAday) {
            String DaysSelector = loopDays.getText();
            if (DaysSelector.equals("8")) {
                loopDays.click();
                break;
            }

        }

        WebElement ToCalendarButton = driver.findElement(By.xpath("//*[@id=\"frmFilterLeave\"]/fieldset/ol/li[2]/img"));
        ToCalendarButton.click();
        WebElement monthDropDown2 = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));
        monthDropDown2.click();

        Select select2 = new Select(monthDropDown2);
        select2.selectByVisibleText("Sep");

        List<WebElement> SelectAReturnday = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td"));
        for (
                WebElement loopDay : SelectAReturnday) {
            String ReturnDaysSelector = loopDay.getText();
            if (ReturnDaysSelector.equals("19")) {
                loopDay.click();
                break;


            }
        }
        WebElement cancelledCheckbox = driver.findElement(By.xpath("//input[@id='leaveList_chkSearchFilter_0']"));
        cancelledCheckbox.click();
        WebElement RejectedCheckbox = driver.findElement(By.xpath("//input[@id='leaveList_chkSearchFilter_-1']"));
        RejectedCheckbox.click();
        WebElement PendingApprovalButton = driver.findElement(By.id("leaveList_chkSearchFilter_1"));
        PendingApprovalButton.click();
        WebElement SubUnitButton = driver.findElement(By.id("leaveList_cmbSubunit"));
        SubUnitButton.click();

        Select selectx = new Select(SubUnitButton);
        selectx.selectByVisibleText("IT Support");

        WebElement searchButton = driver.findElement(By.id("btnSearch"));
        searchButton.click();
        Thread.sleep(3000);
        driver.quit();

    }
}