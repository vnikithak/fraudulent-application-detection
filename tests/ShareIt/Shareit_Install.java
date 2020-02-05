import io.appium.java_client.remote.AndroidMobileCapabilityType; 
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
public class ShareIt_Install
{     private String reportDirectory = "reports"; 
     private String reportFormat = "xml"; 
    private String testName = "ShareIt_Install";
 protected AndroidDriver<AndroidElement> driver = null;      
    DesiredCapabilities dc = new DesiredCapabilities();      
    @BeforeEach 
    public void setUp() throws MalformedURLException
    { 
        dc.setCapability("reportDirectory", reportDirectory); 
        dc.setCapability("reportFormat", reportFormat); 
        dc.setCapability("testName", testName); 
        dc.setCapability(MobileCapabilityType.UDID, ""); 
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc); 
        driver.setLogLevel(Level.INFO); 
    }  
    @Test 
    public void testShareIt_Install()
    { 
        driver.findElement(By.xpath("//*[@text='Play Store']")).click(); 
        driver.findElement(By.xpath("//*[@id='search_box_idle_text']")).click(); 
        driver.getKeyboard().sendKeys("ShareIt"); 
        driver.executeScript("seetest:client.deviceAction(\"Enter\")");
        new WebDriverWait (driver ,10).until(ExpectedConditions.presenceOfElementLocated( By.xpath("//*[@text='INSTALL']")));
        driver.findElement(By.xpath("(//*[@id='button_container']/*[@class= 'android.widget.Button'])[2]")).click();      
        new WebDriverWait(driver, 700).until(ExpectedConditions.presenceOfElementLocated( By.xpath("(//*[@id='button_container']/*[@class='android.widget.Button'])[2]")));
        driver.findElement(By.xpath("//*[@text and @class='android.widget.TextView' and ./parent::*[@id='extra_labels_bottom_trailing']]")).click(); 
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated( By.xpath("(//*[@id='button_container']/*[@text and @class='android.widget.Button'])[2]"))); 
        driver.findElement(By.xpath("(//*[@id='button_container']/*[@text and @class='android.widget.Button'])[2]")).click(); 
    }  
    @AfterEach 
    public void tearDown()
    { 
      driver.quit(); 
    }
 }
