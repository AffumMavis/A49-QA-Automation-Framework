import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class BaseTest {

    @BeforeSuite
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    @BeforeMethod
    @parameters({"BaseURL"});
    public void lauchBrowser(String BaseURL){
    chromeOptions options = new chromeOptions();
    options.addArgumets("---remote-allow-origins");
    options.addArguments("---start maximize");

    driver = new chromeDriver(options);
    driver.manage().timeouts()implictlywait(Duration.ofSeconds(10));
    url = BaseURL;

}