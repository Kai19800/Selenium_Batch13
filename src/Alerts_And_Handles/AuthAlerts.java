package Alerts_And_Handles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthAlerts {
    public static String url="https://admin:admin@the-internet.herokuapp.com/basic_auth";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

    }
}
