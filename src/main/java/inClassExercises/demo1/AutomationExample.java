package inClassExercises.demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AutomationExample {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        WebElement usernameInput = driver.findElement(By.name("username"));
        usernameInput.sendKeys("Admin");

        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("admin123");

        WebElement submitButton = driver.findElement(By.tagName("button"));
        submitButton.click();

        driver.quit();
        
        //driver.get("https://the-internet.herokuapp.com/");
        //WebElement mylink = driver.findElement(By.linkText("Context Menu"));
        //mylink.click();

    }
}
