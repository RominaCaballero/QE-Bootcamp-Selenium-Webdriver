package homeworkExercises.exerciseTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTwo {
    private WebDriver driver;

    private By userNameLocator = By.id("username");
    private By passwordLocator = By.id("password");
    private By loginButton = By.id("log-in");

    public LoginPageTwo(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String userName) {
        driver.findElement(userNameLocator).sendKeys(userName);
    }

    public void setPassword(String password) {
        driver.findElement(passwordLocator).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
}
