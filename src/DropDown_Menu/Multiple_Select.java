package DropDown_Menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Multiple_Select {

        public static String url = "https://syntaxprojects.com/basic-select-dropdown-demo.php";
        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get(url);
            WebElement pickOne= driver.findElement(By.id("multi-select"));
            Select select=new Select(pickOne);
            boolean isMultiple=select.isMultiple();
            System.out.println(isMultiple);
            if (isMultiple) {
                List<WebElement> printAll = select.getOptions();
                for (WebElement loop : printAll) {
                    String getText = loop.getText();
                    select.selectByVisibleText(getText);

                }
                select.deselectByVisibleText("Texas");
            }

    }
}
