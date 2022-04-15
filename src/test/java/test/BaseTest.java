package test;

import config.env_target;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest extends env_target {

    public WebDriver driver;
    public WebDriver getDriver() {
        return this.driver;
    }

    protected static String projectPath = System.getProperty("user.dir");

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", projectPath+ "/src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown() {
        getDriver().quit();
    }
}
