import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.SwipeElementDirection;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.junit.jupiter.api.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

public class Chain_Reaction_Undo {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Chain_Reaction_Undo";
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
    public void testChain_Reaction_Undo() {
        driver.pressKeyCode(AndroidKeyCode.BACK);
        driver.findElement(By.xpath("//*[@text='PLAY']")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='UNDO']")));
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='UNDO']")));
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='UNDO']")));
        driver.swipe(110, 467, 92, 1182, 542);
        driver.swipe(92, 1175, 85, 392, 618);
        driver.findElement(By.xpath("//*[@text='UNDO']")).click();
        driver.swipe(85, 396, 221, 1364, 766);
        driver.swipe(613, 819, 630, 1458, 440);
        driver.swipe(408, 625, 397, 1136, 430);
        driver.findElement(By.xpath("//*[@class='android.view.View' and ./parent::*[@id='content']]")).click();
        driver.findElement(By.xpath("//*[@class='android.view.View' and ./parent::*[@id='content']]")).click();
        driver.findElement(By.xpath("//*[@text='UNDO']")).click();
        driver.pressKeyCode(AndroidKeyCode.BACK);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
