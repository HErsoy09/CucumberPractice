package medunna.pages;

import medunna.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = ".d-flex.align-items-center.dropdown-toggle.nav-link")
    public WebElement loginDropdown;

    @FindBy (xpath = "//a[@href='/login']")
    public WebElement signInSelection;

    @FindBy (xpath = "//a[@href='/account/register']")
    public WebElement registerButton;

    @FindBy (name = "username")
    public WebElement userNameTextBox;

    @FindBy (name = "password")
    public WebElement passwordTextBox;

    @FindBy (xpath = "//*[@type='submit']")
    public WebElement submitButton;

    @FindBy (xpath = "//a[@href='/logout']")
    public WebElement logoutSelection;

}