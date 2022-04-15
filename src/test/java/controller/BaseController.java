package controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseController {

    public WebDriver driver;
    Duration duration = Duration.ofSeconds(10);
    WebDriverWait wait;

    public BaseController(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, duration);
    }

    public void click(By by) {
        waitVisibility(by).click();
    }

    public void sendText(By by, String text) {
        waitVisibility(by).sendKeys(text);
    }

    public WebElement waitVisibility(By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

}
