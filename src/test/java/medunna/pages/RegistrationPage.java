package medunna.pages;

import medunna.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    public RegisterPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "ssn")
    public WebElement ssnTextBox;

    @FindBy (id = "firstName")
    public WebElement firstNameTextBox;

    @FindBy (id = "lastName")
    public WebElement lastNameTextBox;

    @FindBy (id = "username")
    public WebElement userNameTextBox;

    @FindBy (id = "email")
    public WebElement emailTextBox;

    @FindBy (id = "firstPassword")
    public WebElement passwordTextBox;

    @FindBy (id = "secondPassword")
    public WebElement passConfTextBox;

    @FindBy (id = "register-submit")
    public WebElement registerSubmitButton;

    // Password Strength

    @FindBy (xpath = "//li[@style='background-color: rgb(255, 0, 0);']")
    public WebElement passwordStrength1;

    @FindBy (xpath = "//li[@style='background-color: rgb(255, 153, 0);']")
    public WebElement passwordStrength2;

    @FindBy (xpath = "//li[@style='background-color: rgb(153, 153, 0);']")
    public WebElement passwordStrength3;

    @FindBy (xpath = "//li[@style='background-color: rgb(153, 255, 0);']")
    public WebElement passwordStrength4;

    @FindBy (xpath = "//li[@style='background-color: rgb(0, 255, 0);']")
    public WebElement passwordStrength5;

}