package inClassExercises.demo4.interactions;

import inClassExercises.demo4.pages.AlertPage;
import org.junit.Test;

public class AlertsTest extends BaseTest{
    @Test
    public void shouldDisplayAlertWithOK(){
        driver.get("https://demo.automationtesting.in/Alerts.html");
        AlertPage alertPage = new AlertPage(driver);
        alertPage.triggerAlertWithOK();
    }

    @Test
    public void shouldDisplayAlertWithTextBoxAndEnterText(){
        driver.get("https://demo.automationtesting.in/Alerts.html");
        AlertPage alertPage = new AlertPage(driver);
        alertPage.triggerAlertWithTextBox("Mina");

    }


}
