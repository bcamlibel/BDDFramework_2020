package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import runnerTest.webPages.LoginPage;
import utils.BasePage;

public class LoginSD  {

    private LoginPage loginPage =new LoginPage();

    @Given("^ I am on home page$")

    public void iAmOnHomePage(){
        Assert.assertEquals(BasePage.get().getCurrentUrl(), "https://www.facebook.com/");

    }

    @When("^I enter (.+) into (username|password) text fields on home screen$")

    public void enterDataUserAndPassField(String anyText, String textField) {
        switch (textField) {
            case "username":
                loginPage.enterEmail(anyText);
                break;

            case "password":
                loginPage.enterPassword(anyText);
                break;
        }
    }

    @And("^I click on (login button | create button) on home screen$")
    public void clickOnButton(String button){
        switch (button){
            case "login" :
                loginPage.clickOnLogin();
                break;

            case "create account" :
                //implement create account
                break;

        }
    }


    @Then("^I verify that I am in valid login page$")
    public void verifyingInvalidLogin(){
        Assert.assertEquals(loginPage.getTextElement(), "Login into ");
    }
}
