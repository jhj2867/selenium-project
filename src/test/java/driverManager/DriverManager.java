package driverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DriverManager {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {

            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();

            // GitHub Actions(CI)에서만 Headless
            if (isCI()) {
                options.addArguments("--headless=new");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-dev-shm-usage");
                options.addArguments("--window-size=1920,1080");
            }

            driver = new ChromeDriver(options);

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.manage().window().maximize();
        }
        return driver;
    }

    private static boolean isCI() {
        return "true".equalsIgnoreCase(System.getenv("CI"));
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
