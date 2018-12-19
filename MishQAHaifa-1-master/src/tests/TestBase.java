package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

/**
 * Created by Inka on 16-Dec-18.
 */
public class TestBase {
    public WebDriver driver = new ChromeDriver();
    public WebDriverWait wait;
    @BeforeMethod
    public void initWebDriver(){
        driver.get("https://mish.sheygam.com/#/wellcome");
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver,20);

    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }

}
