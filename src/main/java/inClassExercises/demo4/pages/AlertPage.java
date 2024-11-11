package inClassExercises.demo4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {
    private WebDriver driver;

    public AlertPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlertWithOK() {
        driver.findElement(By.linkText("Alert with OK")).click();
        driver.findElement(By.cssSelector("#OKTab button")).click();

        driver.switchTo().alert().accept();
    }

    public void triggerAlertWithTextBox (String name) {
        driver.findElement(By.linkText("Alert with Textbox")).click();
        driver.findElement(By.cssSelector("#Textbox button")).click();

        driver.switchTo().alert().sendKeys(name);
        driver.switchTo().alert().accept();
    }
}
