package inClassExercises.demo3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By userNameLocator = By.name("username");
    private By passwordLocator = By.name("password");
    private By loginButton = By.tagName("button");
    private By errorMessageLocator = By.cssSelector("p.oxd-alert-content-text");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String userName) {
        driver.findElement(userNameLocator).sendKeys(userName);
    }

    public void setPassword(String password) {
        driver.findElement(passwordLocator).sendKeys(password);
    }

    public HomePage clickLoginButtonWithValidCredentials() {
        driver.findElement(loginButton).click();
        return new HomePage(driver);
    }

    public String clickLoginButtonWithInvalidCredentials() {
        driver.findElement(loginButton).click();
        return driver.findElement(errorMessageLocator).getText();
    }

}
