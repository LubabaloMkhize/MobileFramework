package ScreenObjects;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(loginTitle_xpath));
        return loginTitle_xpath;
    }

    public void enterUsername(String username){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(username_xpath));
        username_xpath.click();
        username_xpath.sendKeys(username);
    }

    public void enterPassword(String password){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(password_xpath));
        password_xpath.click();
        password_xpath.sendKeys(password);

    }

    public void clickLoginButton(){
        loginButton_xpath.click();
    }
}
