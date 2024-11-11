package homeworkExercises.exerciseTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomePageTwo {
    private WebDriver driver;
    private By TransactionsLocator = By.cssSelector("tbody tr");
    private By TransactionsDescriptionLocator = By.cssSelector("td.cell-with-media > span");
    private By NameLocator = By.cssSelector("div.logged-user-name");

    public HomePageTwo(WebDriver driver) {
        this.driver = driver;
    }

    public int getNumberOfTransactions() {
        return driver.findElements(TransactionsLocator).size();
    }

    public String getNameLocator() {
        return driver.findElement(NameLocator).getText();
    }

    public List<String> getTransactionsDescription() {
        List<String> expectedDescriptions = Arrays.asList("Starbucks coffee", "Stripe Payment Processing",
                "MailChimp Services", "Shopify product", "Ebay Marketplace", "Templates Inc");
        return expectedDescriptions;
    }

    public List<String> getActualTransactionDescriptions() {
        List<WebElement> transactions = driver.findElements(TransactionsDescriptionLocator);
        List<String> descriptions = new ArrayList<>();
        for (WebElement transaction : transactions) {
            descriptions.add(transaction.getText());
        }
        return descriptions;
    }
}
