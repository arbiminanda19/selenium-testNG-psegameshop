package controller.OnBoarding;

import controller.BaseController;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.OnBoarding.RegisterPage;

public class RegisterController extends BaseController {

    RegisterPage registerPage = new RegisterPage();

    public RegisterController(WebDriver driver) {
        super(driver);
    }

    public RegisterController fillEmail(String email) {
        clearText(registerPage.getEmailField());
        sendText(registerPage.getEmailField(), email);
        return this;
    }

    public RegisterController fillPass(String pass) {
        clearText(registerPage.getEmailField());
        sendText(registerPage.getPassField(), pass);
        return this;
    }

    public RegisterController fillConfirmPass(String pass) {
        clearText(registerPage.getConfirmPassField());
        sendText(registerPage.getConfirmPassField(), pass);
        return this;
    }

    public RegisterController clickRegister(String expected) {
        click(registerPage.getRegisterBtn());
        if (expected == "FAILED"){
            Assert.assertEquals(getText(registerPage.getWeakPass()), "Very weak - Please enter a stronger password.");
        }
        return this;
    }

}
