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

public class Shareit_Start {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Shareit_Start";
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
    public void testShareit_Start()
   {
        driver.findElement(By.xpath("//*[@text='START']")).click();
        driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
        driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
        driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
        driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
        driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
        driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
        driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
        driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
        driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
        driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
        driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
        driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
        driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
        driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
        driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
        driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
        driver.getKeyboard().sendKeys("Monika");
        driver.hideKeyboard()
        driver.findElement(By.xpath("//*[@text='ENTER SHAREit']")).click();
     }
    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
