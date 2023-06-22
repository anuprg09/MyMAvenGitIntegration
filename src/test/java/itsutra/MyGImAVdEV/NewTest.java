package itsutra.MyGImAVdEV;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
  WebDriver _driver;
	@Test
  public void f() throws InterruptedException {
		_driver.get("https://www.google.com");
		Thread.sleep(5000);
		_driver.get("https://www.wikipedia.com");
		Thread.sleep(5000);

  }
  @BeforeTest
  public void beforeTest() {
	  _driver = new ChromeDriver();
	  
  }

  @AfterTest
  public void afterTest() {
	  _driver.close();
	  
  }

}
