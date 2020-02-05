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

public class Chain_reaction_setting_turnoff_vibrate {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Chain_Reaction_Settings_Turnoff_Vibrate";
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
    public void testChain_Reaction_Settings_Turnoff_Vibrate() {
        driver.findElement(By.xpath("//*[@id='spnPlayers']")).click();
        driver.findElement(By.xpath("//*[@text='4 Player Game']")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='PLAYER SETTINGS']")));
        driver.findElement(By.xpath("//*[@text='PLAYER SETTINGS']")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Customisation For Player 1']")));
        driver.findElement(By.xpath("//*[@text='Customisation For Player 1']")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text=concat('Red component of Player 1', \"'\", 's Orb Colour')]")));
        driver.findElement(By.xpath("//*[@text=concat('Red component of Player 1', \"'\", 's Orb Colour')]")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='CANCEL']")));
        driver.findElement(By.xpath("//*[@text='CANCEL']")).click();
        driver.findElement(By.xpath("//*[@text='Green']")).click();
        driver.findElement(By.xpath("//*[@text='OK']")).click();
        driver.findElement(By.xpath("//*[@id='checkbox']")).click();
        driver.pressKeyCode(AndroidKeyCode.BACK);
        driver.pressKeyCode(AndroidKeyCode.BACK);
        driver.pressKeyCode(AndroidKeyCode.BACK);
        driver.pressKeyCode(AndroidKeyCode.BACK);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
