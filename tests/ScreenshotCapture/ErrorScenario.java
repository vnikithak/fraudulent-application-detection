import io.appium    .java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.junit.jupiter.api.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

public class ErrorScenario {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Error_Scenario2";
    protected AndroidDriver<AndroidElement> driver = null;

    DesiredCapabilities dc = new DesiredCapabilities();

    @BeforeEach
    public void setUp() throws MalformedURLException {
        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("testName", testName);
        dc.setCapability(MobileCapabilityType.UDID, "");
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
    }

    @Test
    public void testError_Scenario2() {
        driver.findElement(By.xpath("//*[@id='iconview_imageView' and ./parent::*[@contentDescription='Easily Screen shot capture']]")).click();
        driver.findElement(By.xpath("//*[@text='Skip']")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='start']")));
        driver.findElement(By.xpath("//*[@id='start']")).click();
        driver.findElement(By.xpath("//*[@id='screen_s']")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='switch1']")));
        driver.findElement(By.xpath("//*[@id='switch1']")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='START NOW']")));
        driver.findElement(By.xpath("//*[@text='START NOW']")).click();
        driver.findElement(By.xpath("//*[@id='switch1']")).click();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
