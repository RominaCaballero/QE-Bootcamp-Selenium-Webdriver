package HomeworkExercises.ExerciseOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FirstExercise {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.applitools.com/");

        WebElement loginInput = driver.findElement(By.id("username"));
        loginInput.sendKeys("User");

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("pass123");

        WebElement loginButton = driver.findElement(By.id("log-in"));
        loginButton.click();

        WebElement totalBalance = driver.findElement(By.cssSelector("div.balance-value >span"));
        System.out.println("The total balance is: " + totalBalance.getText());

        WebElement creditBalance = driver.findElement(By.cssSelector("div.balance:nth-of-type(2) > div.balance-value"));
        System.out.println("The credit balance is: " + creditBalance.getText());

        List<WebElement> items = driver.findElements(By.cssSelector("tbody tr"));

        System.out.println("The recent transactions are as listed:");

        for (WebElement item : items ) {
            WebElement status = item.findElement(By.cssSelector("td.nowrap > span + span"));
            WebElement description = item.findElement(By.cssSelector("td.cell-with-media > span"));
            WebElement amount = item.findElement(By.cssSelector("td.bolder > span"));

            System.out.println("Description: " + description.getText() + ". Status: " + status.getText() + ". Amount: " + amount.getText());
        }

        driver.close();

    }
}
