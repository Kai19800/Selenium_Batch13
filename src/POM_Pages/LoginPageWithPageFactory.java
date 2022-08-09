package POM_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static POM_TestBase.BaseClass.driver;

public class LoginPageWithPageFactory {
    @FindBy(id = "txtUsername")
    public WebElement username;

    @FindBy(id="txtPassword")
    public  WebElement password;

    @FindBy(id = "btnLogin")
    public WebElement login;

    //public List<WebElement> multipleElements;

    public LoginPageWithPageFactory() {
        PageFactory.initElements(driver, this);

    }


}
