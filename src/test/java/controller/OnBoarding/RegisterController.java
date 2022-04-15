package controller.OnBoarding;

import controller.BaseController;
import org.openqa.selenium.WebDriver;
import pages.OnBoarding.RegisterPage;

import java.util.Random;
import java.util.stream.IntStream;

public class RegisterController extends BaseController {

    Random rand;
    RegisterPage registerPage = new RegisterPage();
    IntStream number = rand.ints(100,1000);
    String email = "test-automation" + number + "@gmail.com";
    String pass = "P@ssw0rd" + number;

    public RegisterController(WebDriver driver) {
        super(driver);
    }

    public RegisterController fillEmail() {
        sendText(registerPage.getEmailField(), email);
        return this;
    }

    public RegisterController fillPass() {
        sendText(registerPage.getPassField(), pass);
        return this;
    }

    public RegisterController fillConfirmPass() {
        sendText(registerPage.getConfirmPassField(), pass);
        return this;
    }

    public RegisterController clickRegister() {
        click(registerPage.getRegisterBtn());
        return this;
    }

}
