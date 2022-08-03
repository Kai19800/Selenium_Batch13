package Alerts_And_Handles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Pagination2 {
    public static String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement username= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        username.sendKeys("Admin");
        WebElement password= driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement login=driver.findElement(By.id("btnLogin"));
        login.click();
        WebElement PIM= driver.findElement(By.id("menu_pim_viewPimModule"));
        PIM.click();
        WebElement AddEmployee= driver.findElement(By.id("menu_pim_addEmployee"));
        AddEmployee.click();
        WebElement FirstName= driver.findElement(By.id("firstName"));
        FirstName.sendKeys("Khalid");
        WebElement LastName= driver.findElement(By.id("lastName"));
        LastName.sendKeys("AbuHassan");

        WebElement EmployeeID= driver.findElement(By.id("personal_txtEmployeeId"));
        String EmpID= EmployeeID.getAttribute("value");

        WebElement saveButton= driver.findElement(By.id("btnSave"));
        saveButton.click();
        Thread.sleep(2000);
        WebElement EmployeeListButton= driver.findElement(By.id("menu_pim_viewEmployeeList"));
        EmployeeListButton.click();

        List<WebElement> resultTable=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
        WebElement nextButton = driver.findElement(By.linkText("Next"));
        boolean EmployeeNotFound= true;
        while (EmployeeNotFound) {
            for (int i = 0; i < resultTable.size(); i++) {
                String rowText=resultTable.get(i).getText();
                if (rowText.contains(EmpID)){
                    EmployeeNotFound=false;

                }


            }
        }


    }
}
