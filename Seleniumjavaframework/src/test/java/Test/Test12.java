package Test;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test12 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test12() throws Exception {
    driver.get("https://www.amazon.ca/?tag=admpdesktopca-20&ref=pd_sl_a317867036CA2021010621");
    driver.findElement(By.xpath("//a[@id='nav-link-accountList']/span")).click();
    driver.findElement(By.id("ap_email")).click();
    driver.findElement(By.id("ap_email")).click();
    driver.findElement(By.id("ap_email")).clear();
    driver.findElement(By.id("ap_email")).sendKeys("sudeepsharma06@gmail.com");
    driver.findElement(By.xpath("//input[@id='continue']")).click();
    driver.findElement(By.id("ap_password")).click();
    driver.findElement(By.id("ap_password")).clear();
    driver.findElement(By.id("ap_password")).sendKeys("Mountain@06");
    driver.findElement(By.id("signInSubmit")).click();
    driver.findElement(By.xpath("//a[@id='nav-link-accountList']/span")).click();
    driver.findElement(By.xpath("//a[@id='nav-link-accountList']/span/span")).click();
    driver.findElement(By.xpath("//a[@id='nav-link-accountList']/span")).click();
    driver.findElement(By.xpath("//a[@id='nav-item-signout']/span")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
