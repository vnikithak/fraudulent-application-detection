import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.junit.jupiter.api.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

public class ShareIt_Uninstall {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "ShareIt_Uninstall";
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
    public void testShareIt_Uninstall() {
        driver.pressKeyCode(AndroidKeyCode.BACK);
        driver.pressKeyCode(AndroidKeyCode.BACK);
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='UNINSTALL']")));
        driver.findElement(By.xpath("//*[@text='UNINSTALL']")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='OK']")));
        driver.findElement(By.xpath("//*[@text='OK']")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='INSTALL']")));
        driver.pressKeyCode(AndroidKeyCode.BACK);
        driver.pressKeyCode(AndroidKeyCode.HOME);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
