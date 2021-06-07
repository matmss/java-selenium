package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormFill {

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
		driver.findElement(By.id("entervehicledata")).click();
		
		driver.findElement(By.id("make")).click();
		driver.findElement(By.id("model")).click();
		driver.findElement(By.id("cylindercapacity")).sendkeys("1200");
		driver.findElement(By.id("engineperformance")).sendkeys("1500");
		driver.findElement(By.id("dateofmanufacture")).sendkeys("07/12/2021");
		driver.findElement(By.id("numberofseats")).click();
		driver.findElement(By.id("righthanddriveyes")).click();
		driver.findElement(By.id("numberofseatsmotorcycle")).click();
		driver.findElement(By.id("fuel")).click();
		driver.findElement(By.id("payload")).sendkeys("50000");
		driver.findElement(By.id("totalweight")).sendkeys("75000");
		driver.findElement(By.id("listprice")).sendkeys("80000");
		driver.findElement(By.id("licenseplatenumber")).sendkeys("4654678");
		driver.findElement(By.id("annualmileage")).sendkeys("1000");
		driver.findElement(By.id("nextenterinsurantdata")).click();
		
		driver.findElement(By.id("enterinsurantdata")).click();

		driver.findElement(By.id("firstname")).sendkeys("matheus");
		driver.findElement(By.id("lastname")).sendkeys("santos");
		driver.findElement(By.id("birthdate")).sendkeys("05/12/1992");
		driver.findElement(By.id("gendermale")).click();
		driver.findElement(By.id("streetaddress")).click();
		driver.findElement(By.id("country")).click();
		driver.findElement(By.id("zipcode")).sendkeys("80223000");
		driver.findElement(By.id("city")).sendkeys("Curitiba");
		driver.findElement(By.id("speeding")).click();
		driver.findElement(By.id("website")).click();
		driver.findElement(By.id("open")).click();
		driver.findElement(By.id("nextenterproductdata")).click();
		
		
		driver.findElement(By.id("enterproductdata")).click();
		
		driver.findElement(By.id("startdate")).click();
		driver.findElement(By.id("insurancesum")).click();
		driver.findElement(By.id("meritrating")).click();
		driver.findElement(By.id("damageinsurance")).click();
		driver.findElement(By.id("EuroProtection")).click();
		driver.findElement(By.id("courtesycar")).click();
		driver.findElement(By.id("nextselectpriceoption")).click();
		
		driver.findElement(By.id("selectpriceoption")).click();
		
		
		driver.findElement(By.id("selectplatinum")).click();
		driver.findElement(By.id("nextsendquote")).click();
		
		
		
	}

}
