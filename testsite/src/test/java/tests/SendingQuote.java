package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendingQuote {

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/matheusmendes/Downloads/Users/matheusmendes/Downloads/chromedriver");
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		driver.findElement(By.id("sendquote")).click();

		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("phone")).click();
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("confirmpassword")).click();
		driver.findElement(By.id("Comments")).click();
		
		driver.findElement(By.id("sendemail")).click();

	}

}
