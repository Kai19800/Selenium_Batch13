package Advanced_selenium;

import okhttp3.internal.http2.Header;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class WebTables {
    public static String url = "https://www.syntaxprojects.com/table-search-filter-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        //let's store the table data in a List
        List<WebElement> RowData = driver.findElements(By.xpath("//*[@id='task-table']/tbody/tr"));
        System.out.println(RowData.size());

        //   for (WebElement loop:RowData){
        //  String getText = loop.getText();
        //  System.out.println(loop.getText());

        //or we can create an iterator
        Iterator<WebElement> it = RowData.iterator();
        while (it.hasNext()) {
            // WebElement row= it.next();
            //String rowtext=row.getText();
            System.out.println(it.next().getText());
        }
        System.out.println("---------------------------------");

        List<WebElement> columns = driver.findElements(By.xpath("//*[@id='task-table']/thead/tr/th"));
       // for (WebElement loop: columns){
         //   String HeaderText= loop.getText();
          //  System.out.println(HeaderText);

        Iterator<WebElement> its= columns.iterator();
        while (it.hasNext()){
            WebElement Header= it.next();
            System.out.println(Header.getText());
        }
        //print third word in third row
        WebElement ThirdRow=driver.findElement(By.xpath("//*[@id='task-table']/tbody/tr[3]/td[3]"));
        System.out.println(ThirdRow.getText());
        List<WebElement> ThirdColumns= driver.findElements(By.xpath("//*[@id='task-table']/tbody/tr/td[3]"));
        for (WebElement loop:ThirdColumns){
            String ColumnsData=loop.getText();
            System.out.println(ColumnsData);
            WebElement dd= driver.findElement(By.xpath("//*[@id='task-table']/tbody/tr/td[4]"));
            System.out.println(dd.getText());
        }

        }


}