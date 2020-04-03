package runnerTest.webPages;

import org.openqa.selenium.By;

public class MessengerPage  extends ElementUtil{

    private By emailField = By.id("email");
    private By passwordField = By.id("pass");
    private By signUpButton = By.id("loginbutton");
    private By errorMessage = By.xpath("//div[contains(text(), 'Incorrect Email')]");
    private By messengerLink = By.linkText("Messenger");

    public void enterMail(String email){
        sendValue(emailField, email);
    }

    public void enterPassword(String password){
        sendValue(passwordField, password);
    }

    public void clickOnSignInButton(){
        clickOn(signUpButton);
    }

    public void clickOnMessengerLink(){
        clickOn(messengerLink);
    }

    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }
}
