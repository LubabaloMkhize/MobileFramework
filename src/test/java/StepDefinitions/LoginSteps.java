package StepDefinitions;

import Utils.Base;
import Utils.TakeScreenshots;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginSteps extends Base {
    @Given("the user is on the login screen")
    public void the_user_is_on_the_login_screen() {
        Assert.assertEquals(homeScreen.getHomeTitleText(), "Master Test Automation");
        TakeScreenshots.takesSnapShot(driver, "Home Screen");
        homeScreen.clickHamburgerMenu();
        homeScreen.clickLoginButton();
    }
    @When("the user enters username {string}")
    public void the_user_enters_username(String username) {
        Assert.assertEquals(homeScreen.getHomeTitleText(), "Login to Access Learning Materials");
        TakeScreenshots.takesSnapShot(driver, "Login Screen");
        loginScreen.enterUsername(username);
    }
    @And("the user enters password {string}")
    public void the_user_enters_password(String password) {
        loginScreen.enterPassword(password);
    }
    @And("the user taps the login button")
    public void the_user_taps_the_login_button() {
        loginScreen.clickLoginButton();
    }
    @Then("the user should be logged into the mobile application")
    public void the_user_should_be_logged_into_the_mobile_application() {
        String actualText = driver.findElement(By.xpath("//android.view.View[contains(@content-desc,'Welcome back')]")).getAttribute("content-desc");
        Assert.assertTrue(actualText.contains("Welcome back"));
        TakeScreenshots.takesSnapShot(driver, "Dashboard Screen");
    }
}
