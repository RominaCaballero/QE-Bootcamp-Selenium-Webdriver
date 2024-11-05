package inClassExercises.demo3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername("Admin");
        loginPage.setPassword("admin123");
        HomePage homepage = loginPage.clickLoginButtonWithValidCredentials();
        System.out.println("User name is " + homepage.getUserName());

    }
}
