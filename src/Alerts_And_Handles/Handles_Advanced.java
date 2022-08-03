package Alerts_And_Handles;

import DropDown_Menu.Facebook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Handles_Advanced {
    public static String url = "https://syntaxprojects.com/window-popup-modal-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        String HpHandle = driver.getWindowHandle();

        WebElement follow = driver.findElement(By.linkText("Follow On Instagram"));
        WebElement likeUs = driver.findElement(By.linkText("Like us On Facebook"));
        WebElement followIandF = driver.findElement(By.linkText("Follow Instagram & Facebook"));

        follow.click();
        likeUs.click();
        followIandF.click();

        Set<String> AllHandles = driver.getWindowHandles();
        System.out.println(AllHandles.size());

        Iterator<String> IT = AllHandles.iterator();
        while (IT.hasNext()) {
            String Handle = IT.next();
            if (!HpHandle.equals(Handle)) {
                driver.switchTo().window(Handle);
                driver.manage().window().maximize();
                String title = driver.getTitle();
                System.out.println(title);
            }
        }
        driver.switchTo().window(HpHandle);
        Thread.sleep(2000);
        follow.click();

    }
}
