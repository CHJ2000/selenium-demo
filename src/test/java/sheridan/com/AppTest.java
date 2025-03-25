package sheridan.com;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    driver.quit();
   }
}
