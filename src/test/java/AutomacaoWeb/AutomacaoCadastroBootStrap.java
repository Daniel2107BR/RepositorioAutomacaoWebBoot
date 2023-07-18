package AutomacaoWeb;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomacaoCadastroBootStrap {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		// codigo para abrir o navegador
		driver = new ChromeDriver();
		// comando para passar o caminho do site
		driver.get("https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap");
		// comando para maximizar o site
		driver.manage().window().maximize();
		//codigo para pausa
				//Thread.sleep(3000);
				//comando para clicar
				driver.findElement (By.xpath("//*[@id=\"switch-version-select\"]/option[4]")).click();
				driver.findElement(By.xpath("//*[@id=\"gcrud-search-form\"]/div[1]/div[1]/a")).click();
				Thread.sleep(3000);
				driver.findElement(By.id("field-customerName")).sendKeys("Daniel");
				driver.findElement(By.id("field-contactLastName")).sendKeys("Rodrigues");
				driver.findElement(By.id("field-contactFirstName")).sendKeys("Daniel");
				driver.findElement(By.id("field-phone")).sendKeys("7599123456");
				driver.findElement(By.id("field-addressLine1")).sendKeys("Rua do Biscoito");
				driver.findElement(By.id("field-addressLine2")).sendKeys(",Número 21, Centro,");
				driver.findElement(By.id("field-city")).sendKeys("Cruz das Almas");
				driver.findElement(By.id("field-state")).sendKeys("Bahia");
				driver.findElement(By.id("field-postalCode")).sendKeys("44380-000");
				driver.findElement(By.id("field-country")).sendKeys("Brasil");
				driver.findElement(By.id("field-salesRepEmployeeNumber")).sendKeys("123456789");
				driver.findElement(By.id("field-creditLimit")).sendKeys("5000");
				driver.findElement(By.id("field-deleted")).sendKeys("nada");
			
			
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
