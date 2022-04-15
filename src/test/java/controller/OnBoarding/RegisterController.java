package controller.OnBoarding;

import controller.BaseController;
import org.openqa.selenium.WebDriver;
import pages.OnBoarding.RegisterPage;

public class RegisterController extends BaseController {

    RegisterPage registerPage = new RegisterPage();

    public RegisterController(WebDriver driver) {
        super(driver);
    }

    public RegisterController fillEmail(String email) {
        sendText(registerPage.getEmailField(), email);
        return this;
    }

    public RegisterController fillPass(String pass) {
        sendText(registerPage.getPassField(), pass);
        return this;
    }

    public RegisterController fillConfirmPass(String pass) {
        sendText(registerPage.getConfirmPassField(), pass);
        return this;
    }

    public RegisterController clickRegister() {
        click(registerPage.getRegisterBtn());
        return this;
    }

}
