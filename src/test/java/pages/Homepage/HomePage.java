package pages.Homepage;

import org.openqa.selenium.By;

public class HomePage {

    protected By userBtn = By.xpath("//a[@href='https://www.psegameshop.com/my-account/']");

    public By getUserBtn() {
        return userBtn;
    }
}
