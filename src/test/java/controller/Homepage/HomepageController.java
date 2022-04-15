package controller.Homepage;

import controller.BaseController;
import org.openqa.selenium.WebDriver;
import pages.Homepage.HomePage;

public class HomepageController extends BaseController {

    HomePage homePage = new HomePage();

    public HomepageController(WebDriver driver) {
        super(driver);
    }

    public HomepageController toUserPage() {
        click(homePage.getUserBtn());
        return this;
    }

}
