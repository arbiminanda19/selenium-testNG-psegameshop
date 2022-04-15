package pages.OnBoarding;

import org.openqa.selenium.By;

public class RegisterPage {

    protected By emailField = By.id("reg_email");
    protected By passField = By.id("reg_password");
    protected By confirmPassField = By.id("reg_confirm_password");
    protected By registerBtn = By.xpath("//button[contains(text(),'Register')]");

    public By getEmailField() {
        return emailField;
    }

    public By getPassField() {
        return passField;
    }

    public By getConfirmPassField() {
        return confirmPassField;
    }

    public By getRegisterBtn() {
        return registerBtn;
    }

}
