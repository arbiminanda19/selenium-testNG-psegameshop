package test.OnBoarding;

import controller.Homepage.HomepageController;
import controller.OnBoarding.RegisterController;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import test.BaseTest;

import java.util.Random;

public class Register extends BaseTest {

    private HomepageController homepageController;
    private RegisterController registerController;
    Random rand;

    @Test(priority = 0)
    @Description("Navigate to User Page")
    public void navigateToUserPage() {
        homepageController = new HomepageController(driver);
        homepageController.toUserPage();
    }

    @Test(priority = 1)
    @Description("Success Register an Account")
    public void successRegisterAccount() {
        registerController = new RegisterController(driver);
        registerController
                .fillEmail()
                .fillPass()
                .fillConfirmPass()
                .clickRegister();
    }

}
