package inClassExercises.demo3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By useDropDownLocator = By.cssSelector("p.oxd-userdropdown-name");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getUserName() {
        return driver.findElement(useDropDownLocator).getText();
    }


}
