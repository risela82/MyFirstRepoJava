package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy(id = "last-name")
    public WebElement last_name;
    @FindBy(xpath = "//a[contains(text(),'Submit')]")
    public WebElement submit_button;

}
