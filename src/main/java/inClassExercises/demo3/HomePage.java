package inClassExercises.demo3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePage {
    private WebDriver driver;
    private By useDropDownLocator = By.cssSelector("p.oxd-userdropdown-name");
    private By menuItemsLocator = By.cssSelector("a.oxd-main-menu-item");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getUserName() {
        return driver.findElement(useDropDownLocator).getText();
    }

    public List<String> getMenuItems(){
        var menuWebElements = driver.findElements(menuItemsLocator);
        List<String> menuItems = new ArrayList<>();
        for(WebElement menuItem : menuWebElements){
            menuItems.add(menuItem.getText());
        }

        return menuItems;
    }

}
