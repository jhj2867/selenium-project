package step;

import config.testConfig;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import driverManager.DriverManager;

import static org.junit.Assert.assertTrue;

public class step_define {

    private final WebDriver driver = DriverManager.getDriver();

    @Given("Landing {string} page")
    public void landingPage(String mainpage) {
        driver.get(testConfig.get("base.url"));
        String title = driver.getTitle();
        assertTrue(title.contains(mainpage));
    }

}