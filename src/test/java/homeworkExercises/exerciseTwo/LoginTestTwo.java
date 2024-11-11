package homeworkExercises.exerciseTwo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LoginTestTwo extends BaseTestTwo {
    @Test
    public void testSuccessfulLoginAndCorrectListOfTransactions() {

        driver.manage().window().maximize();

        driver.get("https://demo.applitools.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        LoginPageTwo loginPage = new LoginPageTwo(driver);
        loginPage.setUsername("admin");
        loginPage.setPassword("admin123");
        loginPage.clickLogin();

        HomePageTwo homePageTwo = new HomePageTwo(driver);

        Assert.assertEquals("https://demo.applitools.com/app.html", driver.getCurrentUrl());
        Assert.assertEquals("Jack Gomez", homePageTwo.getNameLocator());

        List<String> expectedDescriptions = homePageTwo.getTransactionsDescription();
        List<String> actualDescriptions = homePageTwo.getActualTransactionDescriptions();

        assertEquals(expectedDescriptions, actualDescriptions);

        var expectedNumberOfTransactions = homePageTwo.getNumberOfTransactions();

        Assert.assertEquals(expectedNumberOfTransactions, homePageTwo.getNumberOfTransactions());
    }
}
