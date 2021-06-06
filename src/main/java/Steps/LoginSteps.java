package Steps;

import PageObject.LoginPage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


public class LoginSteps extends LoginPage {
    LoginPage lp = new LoginPage();

    @Given ("I Am At The Page Http")
    public void givenIAmAtThePageHttp(){
        lp.loginAtHomePage();
        lp.clickMemberLogin();
    }

    @When ("I Enter My Email")
    public void givenIEnterMyEmail(){
        lp.setInputEmail();
    }

    @When("Click On Next Button")
    public void whenClickOnNextButton(){
        lp.clickSubmitEmailButton();
    }

    @When("I Enter My Password")
    public void whenIEnterMyPassword(){
        lp.setInputPassword();
    }

    @When("Click On Login Button")
    public void whenClickOnLoginButton(){
        lp.clickSubmitPasswordButton();
    }

    @Then("I Can Success Login")
    public void thenICanSuccessLogin(){
        lp.verifyWelcomeGreeting().equalsIgnoreCase("Hello Fernanda,");
    }
}
