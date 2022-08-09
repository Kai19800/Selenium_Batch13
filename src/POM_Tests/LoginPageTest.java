package POM_Tests;

import POM_Pages.LoginPage;
import POM_Pages.LoginPageWithPageFactory;
import POM_TestBase.BaseClass;

public class LoginPageTest {
    public static void main(String[] args) {

        BaseClass.openWithSpecificURL("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php");
        LoginPage loginPage=new LoginPage();
        loginPage.username.sendKeys("Admin");
        loginPage.password.sendKeys("Hum@nhrm123");
        loginPage.login.click();

        BaseClass.tearDown();
    }
}
