package homeworkExercises.exerciseTwo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LoginTestTwo extends BaseTestTwo {
    @Test
    public void testSuccessfulLogin() {
        HomePageTwo homePageTwo = new HomePageTwo(driver);

        Assert.assertEquals("https://demo.applitools.com/app.html", driver.getCurrentUrl());
        Assert.assertEquals("Jack Gomez", homePageTwo.getNameLocator());

    }
}
