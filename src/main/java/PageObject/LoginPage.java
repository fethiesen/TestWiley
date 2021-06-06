package PageObject;

import Core.Configuration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    Configuration config;

    @FindBy(xpath = "//button[@type='button' and @class='button-default button-default--transparent-primary navbar-form-recovery__submit js-login-member-button']")
    private WebElement loginMemberButton;

    @FindBy (xpath = "//input[@type='text' and @id='login-form__login']")
    private WebElement inputEmail;

    @FindBy(xpath = "//button[@type='button' and @class='button-default js-login-form-submit']")
    private WebElement submitEmailButton;

    @FindBy (xpath = "//input[@type='text' and @id='login-form__password']")
    private WebElement inputPassword;

    @FindBy(xpath = "//button[@type='submit' and @class='button-default js-login-form-submit']")
    private WebElement submitPasswordButton;

    @FindBy(xpath = "//h3[@class='member-result__text-greeting']")
    private WebElement welcomeGreeting;

    public void loginAtHomePage () {
        config = new Configuration();
    }

    public void clickMemberLogin () {
        loginMemberButton.click();
    }

    public void setInputEmail () {
        inputEmail.sendKeys("fernanda.thiesen@gmail.com");
    }

    public void clickSubmitEmailButton() {
        submitEmailButton.click();
    }

    public void setInputPassword() {
        inputPassword.sendKeys("WLS2020qa");
    }

    public void clickSubmitPasswordButton () {
        submitPasswordButton.click();
    }

    public String verifyWelcomeGreeting () {
        return welcomeGreeting.getText();
    }
}
