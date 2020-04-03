package runnerTest.webPages;

import org.openqa.selenium.By;

public class LoginPage extends ElementUtil {

    private By errorMessage = By.xpath("//span[contains(text(), ‘Log Into Facebook’)]");
    private By emailTextField = By.id("email");
    private By passwordField = By.id("pass");
    private  By loginButton = By.id("loginbutton");


    public void enterEmail(String enterEmail){

        sendValue(emailTextField, enterEmail);
    }

    public void enterPassword( String enterPassword){
        sendValue(passwordField, enterPassword);
    }

    public void clickOnLogin(){
        clickOn(loginButton);
    }

    public String getTextElement(){
        return getTextFromElement(errorMessage);
    }
}
