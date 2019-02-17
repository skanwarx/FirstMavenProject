package FirstMavenProject;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class GoogleTest {
    public String baseUrl = "http:www.google.com";
    String driverPath = "c:\\Jenkins\\workspace\\FirstMavenProject\\src\\main\\resources\\chromedriver.exe";
    public WebDriver driver ; 
     
  @Test
  public void verifyHomepageTitle() {
       
      System.out.println("launching chrome browser"); 
      System.setProperty("webdriver.chrome.driver", driverPath);
      driver = new ChromeDriver();
      driver.get(baseUrl);
      //String expectedTitle = "Welcome: Google";
      //String actualTitle = driver.getTitle();
      //Assert.assertEquals(actualTitle, expectedTitle);
      Assert.assertTrue(driver.findElement(By.name("q")).isDisplayed(),"Home Page is not displayed");
      driver.close();
  }
}
