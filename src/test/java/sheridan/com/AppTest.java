package sheridan.com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
   @Test
   public void testGoogleSearch(){
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();

    driver.get("https://www.google.com");
    assertEquals("Google", driver.getTitle());
    driver.get("https://www.google.com/news");
    assertEquals("Google News", driver.getTitle());
    driver.get("https://www.google.com/store");
    assertEquals("Google Store for Google Made Devices & Accessories", driver.getTitle());
    driver.quit();
   }

   @Test 
   public void testLoadTime(){
      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();

      long startTime = System.currentTimeMillis();
      driver.get("https://www.google.com");
      long endTime = System.currentTimeMillis();

      long loadTime = endTime - startTime;
      System.out.println("Time to load was " + loadTime + "milliseconds");
      assertTrue(loadTime < 1000);
      driver.quit();
   }
}
