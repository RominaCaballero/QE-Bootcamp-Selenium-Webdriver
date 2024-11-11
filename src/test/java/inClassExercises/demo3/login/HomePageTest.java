package inClassExercises.demo3.login;

import inClassExercises.demo3.HomePage;
import inClassExercises.demo3.LoginPage;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HomePageTest extends BaseTest {

    @Test
    public void menuIsComplete() {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername("Admin");
        loginPage.setPassword("admin123");
        HomePage homePage = loginPage.clickLoginButtonWithValidCredentials();

        var menuItems = homePage.getMenuItems();
        List<String> expectedMenuItems = Arrays.asList(
                "Admin", "PIM", "Leave", "Time",
                "Recruitment", "My Info", "Performance",
                "Dashboard", "Directory", "Maintenance", "Claim", "Buzz");

        assertEquals(12, menuItems.size());
        assertEquals(menuItems, expectedMenuItems);
    }
}
