package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Utilities {

    public WebDriver driver;

    protected WebElement webElement;

    public Utilities(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, Page: this);
    }

    public static class UtilsDriver{
        public static String BASE_URL = "https://formy-project.herokuapp.com/form";
        public static String CHROME_DRIVER_LOCATION = "chromedriver";
    }
}
