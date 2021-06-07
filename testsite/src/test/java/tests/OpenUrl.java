package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.internal.JUnitSystem;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrl {
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/matheusmendes/Downloads/Users/matheusmendes/Downloads/chromedriver");
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get("http://sampleapp.tricentis.com/101/app.php");
		assertTrue("Vehicle Insurance Application", driver.getTitle().contentEquals("Enter Vehicle Data"));
		Thread.sleep(3000);
	}

}
