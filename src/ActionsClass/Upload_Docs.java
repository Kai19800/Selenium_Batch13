package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_Docs {
    public static String url = "https://the-internet.herokuapp.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        WebElement FileUploadButton = driver.findElement(By.xpath("//a[text()='File Upload']"));
        FileUploadButton.click();

        WebElement chooseFileButton = driver.findElement(By.id("file-upload"));
        chooseFileButton.sendKeys("C:\\Users\\kdc27\\Downloads\\SMART_Goal.pdf");

        WebElement UploadButton= driver.findElement(By.id("file-submit"));
        UploadButton.click();

        WebElement text= driver.findElement(By.id("uploaded-files"));
        System.out.println(text.getText());

    }
}
