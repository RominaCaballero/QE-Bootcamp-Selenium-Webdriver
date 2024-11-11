package homeworkExercises.exerciseTwo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class HomePageTestTwo extends BaseTestTwo {
    @Test
    public void testSuccessfulLoginAndCorrectTransactions() {
        HomePageTwo homePageTwo = new HomePageTwo(driver);

        List<String> expectedDescriptions = homePageTwo.getTransactionsDescription();
        List<String> actualDescriptions = homePageTwo.getActualTransactionDescriptions();

        assertEquals(expectedDescriptions, actualDescriptions);

        var expectedNumberOfTransactions = homePageTwo.getNumberOfTransactions();

        Assert.assertEquals(expectedNumberOfTransactions, homePageTwo.getNumberOfTransactions());
    }
}
