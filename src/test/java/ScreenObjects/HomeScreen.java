package ScreenObjects;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomeScreen {
    private AndroidDriver driver;


    @FindBy(xpath = "//android.widget.Button")
    private WebElement hamburgerMenu_xpath;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Master Test Automation\"]")
    private WebElement homeTitle_xpath;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Home\"]")
    private WebElement homeButton_xpath;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Courses\"]")
    private WebElement coursesButton_xpath;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Instructor\"]")
    private WebElement instructorButton_xpath;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Stories\"]")
    private WebElement storiesButton_xpath;

    @FindBy(xpath="//android.view.View[@content-desc=\"Contact\"]")
    private WebElement contactButton_xpath;

    @FindBy(xpath="//android.widget.Button[@content-desc=\"Login / Sign Up\"]")
    private WebElement loginButton_xpath;


    public HomeScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void clickHamburgerMenu() {
        hamburgerMenu_xpath.click();
    }
    public String getHomeTitleText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(homeTitle_xpath));
        return homeTitle_xpath.getAttribute("content-desc");
    }
    public void clickHomeButton() {
        homeButton_xpath.click();
    }
    public void clickCoursesButton() {
        coursesButton_xpath.click();
    }
    public void clickInstructorButton() {
        instructorButton_xpath.click();
    }
    public void clickStoriesButton() {
        storiesButton_xpath.click();
    }
    public void clickContactButton() {
        contactButton_xpath.click();
    }

    public void clickLoginButton(){
        loginButton_xpath.click();
    }



}


