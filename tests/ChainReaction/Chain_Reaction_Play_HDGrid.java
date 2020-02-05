import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.SwipeElementDirection;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.junit.jupiter.api.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

public class Chain_Reaction_Play_HDGrid {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Chain_Reaction_Playwith_HD_Grid";
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
    public void testChain_Reaction_Playwith_HD_Grid() {
        driver.findElement(By.xpath("//*[@text='PLAY WITH HD GRID']")).click();
        driver.swipe(141, 348, 906, 341, 1708);
        driver.findElement(By.xpath("//*[@class='android.view.View' and ./parent::*[@id='content']]")).click();
        driver.swipe(103, 338, 90, 1158, 2799);
        driver.swipe(93, 1158, 983, 1125, 835);
        driver.swipe(983, 1119, 974, 367, 1161);
        driver.pressKeyCode(AndroidKeyCode.BACK);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
