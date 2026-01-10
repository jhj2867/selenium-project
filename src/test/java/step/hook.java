package step;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import driverManager.DriverManager;

public class hook {

    @Before
    public void beforeScenario() {
        DriverManager.getDriver();
    }

    @After
    public void afterScenario() {
        DriverManager.quitDriver();
    }
}
