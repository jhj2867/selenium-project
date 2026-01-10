package step;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import driverManager.DriverManager;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class hook {

    @Before
    public void beforeScenario() {
        DriverManager.getDriver();
    }

    @After
    public void afterScenario(Scenario scenario) {
        WebDriver driver = DriverManager.getDriver();
        byte[] screenshot =
                ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

        scenario.attach(
                screenshot,
                "image/png",
                scenario.getName()
        );
        DriverManager.quitDriver();
    }
}
