package Test;

import Step.FormStep;
import Utilities.Utilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FormTest {

    public ChromeDriver driver = new ChromeDriver();

    @BeforeSuite
    public void setting(){
        //ChromeDriver location set up in Utilities class
        System.setProperty("webdriver.chrome.driver", Utilities.UtilsDriver.CHROME_DRIVER_LOCATION);
        driver.get(Utilities.UtilsDriver.BASE_URL);
    }

    @Test
    public void SubmitForm(){
        FormStep actions = new FormStep(driver);

        actions.enterLastName();
        actions.click_Highest_Level_of_education();
        actions.ClickSubmitButton();
    }

    @AfterSuite
    public void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
