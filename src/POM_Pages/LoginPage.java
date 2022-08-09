package POM_Pages;

import POM_Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends CommonMethods {
    public WebElement username = driver.findElement(By.id("txtUsername"));
    public WebElement password = driver.findElement(By.id("txtPassword"));
    public WebElement login = driver.findElement(By.id("btnLogin"));

}
