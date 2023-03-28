package Step;

import Page.HomePage;

public class FormStep extends HomePage {
    public void enterLastName(){
        String LASTNAME = "Morales";
        this.last_name.sendKeys(LASTNAME);
    }

    public void ClickSubmitButton(){
        this.submit_button.click();
    }
}
