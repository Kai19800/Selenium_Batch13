package Alerts_And_Handles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Handles {

        public static String url="https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp&hl=en-GB";

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();

            String HomePageHandle = driver.getWindowHandle();
            System.out.println(HomePageHandle);
            WebElement help=driver.findElement(By.linkText("Help"));
            help.click();
            Thread.sleep(2000);
            Set<String> AllHandles= driver.getWindowHandles();
            System.out.println(AllHandles.size());

            Iterator<String> IT=AllHandles.iterator();
            HomePageHandle = IT.next();
            Thread.sleep(2000);
            String ChildHandle= IT.next();
            Thread.sleep(2000);
            driver.switchTo().window(HomePageHandle);
            Thread.sleep(2000);

            driver.switchTo().window(ChildHandle);
            driver.close();
            Thread.sleep(2000);
            driver.switchTo().window(HomePageHandle);
            help.click();




    }
}
