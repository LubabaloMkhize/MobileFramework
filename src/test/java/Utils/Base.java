package Utils;


import ScreenObjects.HomeScreen;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class Base {

    public AndroidDriver driver;
    public HomeScreen homeScreen;


    public void initDriver() {
        String appPath = System.getProperty("appPath", System.getProperty("user.dir") + "/src/main/resources/app-release.apk");
        AppiumDriverFactory.getInstanceOfAppiumFactory(appPath);
        this.driver = (AndroidDriver) AppiumDriverFactory.getDriver();
        homeScreen = new HomeScreen(driver);

        driver.terminateApp("com.ndosi.ndosi_flutter_app");
        driver.activateApp("com.ndosi.ndosi_flutter_app");
    }


    public void addScreenshot(Scenario scenario) {
//        if (scenario.isFailed()) {
        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "image");
//        }

    }
}
