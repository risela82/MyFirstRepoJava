package Step;

import Page.HomePage;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormStep extends HomePage {

    public FormStep(ChromeDriver driver){ super(driver);}
    public void enterLastName(){
        String LASTNAME = "Morales";
        this.last_name.sendKeys(LASTNAME);
    }

    public void ClickSubmitButton() {
        this.submit_button.click();
    }

    public void click_Highest_Level_of_education(){
        this.college.click();
    }

}
