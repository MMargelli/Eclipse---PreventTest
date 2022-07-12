package teste;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import elementos.Elementos;
import metodos.Metodos;

public class Teste {

	WebDriver driver;
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@Before
	public void setUp() throws Exception {

	}

	public void abrirNavegador(String url) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver.get("https://https://demo.guru99.com/V1/html/addcustomerpage.php");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		metodos.preencher(el.getCustomerName(), "Malai Caneo");
		
		

	}

}
