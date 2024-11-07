package demo4.waits;

import inClassExercises.demo4.pages.HomePage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomePageTest extends BaseTest {

    @Test
    public void addToCartSuccesfully() {
        driver.get("https://demos.bellatrix.solutions/");
        HomePage homePage = new HomePage(driver);
        homePage.addToCart("Saturn V");
        homePage.goToCart("Saturn V");
        assertEquals("https://demos.bellatrix.solutions/cart/", driver.getCurrentUrl());

    }
}
