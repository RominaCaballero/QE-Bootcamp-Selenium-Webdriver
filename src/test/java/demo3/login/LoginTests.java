package demo3.login;

import inClassExercises.demo3.HomePage;
import inClassExercises.demo3.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

import static org.junit.Assert.*;

public class LoginTests {

    WebDriver driver;

    @BeforeEach
    public void setUp(){
        driver = new ChromeDriver();
    }

    @AfterEach
    public void clean() {
        driver.quit();
    }

    @Test
    public void testSuccesfulLogin() {
        //WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername("Admin");
        loginPage.setPassword("admin123");
        HomePage homepage = loginPage.clickLoginButtonWithValidCredentials();

        assertEquals("FirstNametest lastNametest" , homepage.getUserName());
        assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", driver.getCurrentUrl());

    }

    @Test
    public void shouldNotLoginWithInvalidCredentials() {
        //WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername("Admin");
        loginPage.setPassword("admin");
        //String errorMessage = loginPage.clickLoginButtonWithInvalidCredentials();

        assertEquals("Invalid credentials", loginPage.clickLoginButtonWithInvalidCredentials());
        assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", driver.getCurrentUrl());

        //driver.quit();

    }
}
