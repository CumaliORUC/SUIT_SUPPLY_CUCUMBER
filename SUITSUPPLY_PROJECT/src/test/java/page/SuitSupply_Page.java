package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class SuitSupply_Page {
    public SuitSupply_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="(//p[@class='hero-display-subtitle-design cm-link'])[2]")
    public WebElement custom_Made_Element;

    @FindBy (xpath = "(//*[(text()=' Start now ' )])[2]")
    public WebElement custom_Made_Coat_StartNow;

    @FindBy (css = "button.btn-close.cookies__close-btn.js-accept-cookies")
    public WebElement cookies_Close_Button;

    @FindBy (xpath = "(//span[@class='cookies__close-icon susu-icon susu-icon-close'])[2]")
    public WebElement switch_Location_close_Button;

    @FindBy (xpath = "//ss-button")
    public WebElement newForYou_Message_Close;

}
