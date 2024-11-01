package inClassExercises.demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SecondAutomation {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        System.out.println(driver.getTitle());

        WebElement userNameInput = driver.findElement(By.id("user-name"));
        userNameInput.sendKeys("standard_user");

        WebElement passwordInput = driver.findElement(By.cssSelector("input.form_input[placeholder=\"Password\"]"));
        passwordInput.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.cssSelector("input.submit-button"));
        loginButton.click();

        System.out.println(driver.getCurrentUrl());

        List<WebElement> items = driver.findElements(By.cssSelector("div.inventory_list div.inventory_item"));
        System.out.println(items.size());

        for (WebElement item : items) {
            WebElement itemName = item.findElement(By.cssSelector("div.inventory_item_name"));
            WebElement itemPrice = item.findElement(By.cssSelector("div.inventory_item_price"));

            //System.out.println(itemName.getText() + ": " + itemPrice.getText());

            if (itemName.getText().contains("Backpack")) {
                System.out.println(itemName.getText() + ": " + itemPrice.getText());
                WebElement addToCartButton = item.findElement(By.cssSelector("button.btn_primary"));
                addToCartButton.click();
            }

        }

        //driver.quit();

    }
}
