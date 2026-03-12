package ScreenObjects;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginScreen {

    private AndroidDriver driver;

    @FindBy(xpath="//android.view.View[@content-desc=\"Login to Access Learning Materials\"]")
    private WebElement loginTitle_xpath;

    @FindBy(xpath="//android.widget.EditText)[1]")
    private WebElement username_xpath;

    @FindBy(xpath = "//android.widget.EditText)[2]")
    private WebElement password_xpath;

    @FindBy(xpath = "///android.widget.Button[@content-desc='Login']")
    private WebElement loginButton_xpath;




    public LoginScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getLoginTitleText() {
        return loginTitle_xpath;
    }

    public void Login(String username, String password){
        username_xpath.sendKeys(username);
        password_xpath.sendKeys(password);
        loginButton_xpath.click();
    }
}
