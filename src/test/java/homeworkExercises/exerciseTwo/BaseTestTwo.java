package homeworkExercises.exerciseTwo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTestTwo {

    WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.manage().window().maximize();

        driver.get("https://demo.applitools.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        LoginPageTwo loginPage = new LoginPageTwo(driver);
        loginPage.setUsername("admin");
        loginPage.setPassword("admin123");
        loginPage.clickLogin();

    }

    @AfterEach
    public void clean() {
       driver.quit();
    }

}
