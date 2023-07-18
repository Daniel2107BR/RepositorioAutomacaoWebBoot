package AutomacaoWeb;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomacaoAdvantageOnline {
    WebDriver driver;
	@Before
	public void setUp() throws Exception {
		// codigo para mostrar o caminho do chrome
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		// codigo para abrir o navegador
		driver = new ChromeDriver();
		// comando para passar o caminho do site
		driver.get("https://advantageonlineshopping.com/#/");
		// comando para maximizar o site
		driver.manage().window().maximize();
		//codigo para pausa
		Thread.sleep(3000);
		//comando para clicar
		driver.findElement (By.id("menuUserSVGPath")).click();
		//comando para preencher texto
		driver.findElement(By.name("username")).sendKeys("teste");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("1234");
		Thread.sleep(3000);
		//comando para fechar o navegador
		driver.quit();

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
