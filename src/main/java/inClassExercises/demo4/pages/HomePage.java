package inClassExercises.demo4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class HomePage {
    private WebDriver driver;
    private By productListLocator = By.cssSelector("li.purchasable");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart(String productName) {
        var products = driver.findElements(productListLocator);

        for(WebElement product : products) {
            var itemName = product.findElement(By.tagName("h2"));
            if(itemName.getText().equals(productName)) {
                product.findElement(By.linkText("Add to cart")).click();

//                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//                wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("View cart")) );

                FluentWait <WebDriver> wait = new FluentWait<>(driver);
                wait.withTimeout(Duration.ofSeconds(5));
                wait.pollingEvery(Duration.ofMillis(500));
                wait.ignoring(NoSuchElementException.class);

                wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("View cart")));
                break;
            }
        }
    }

    public void goToCart(String productName) {
        var products = driver.findElements(productListLocator);

        for(WebElement product : products) {
            var itemName = product.findElement(By.tagName("h2"));
            if(itemName.getText().equals(productName)) {
                product.findElement(By.linkText("View cart")).click();
                break;
            }
        }
    }
}
