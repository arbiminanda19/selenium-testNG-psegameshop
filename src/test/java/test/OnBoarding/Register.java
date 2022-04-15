package test.OnBoarding;

import controller.Homepage.HomepageController;
import controller.OnBoarding.RegisterController;
import jdk.jfr.Description;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import test.BaseTest;

import java.util.Random;
import java.util.stream.IntStream;

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
    @Parameters({"email", "pass"})
    @Description("Success Register an Account")
    public void successRegisterAccount(String email, String pass) {
        registerController = new RegisterController(driver);
        IntStream number = rand.ints(100,1000);
        if (email == "") {
            email = "test-automation" + number + "@gmail.com";
            pass = "P@ssw0rd" + number;
        }
        registerController
                .fillEmail(email)
                .fillPass(pass)
                .fillConfirmPass(pass)
                .clickRegister();
    }

}
