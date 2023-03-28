package Test;

import Step.FormStep;
import org.testng.annotations.*;

public class FormTest {

    @Test
    public void_SubmitForm(){
        FormStep actions = new FormStep();
        actions.enterLastName();
        actions.ClickSubmitButton();
    }
}
