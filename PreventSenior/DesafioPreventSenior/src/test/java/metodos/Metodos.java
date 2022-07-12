package metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import elementos.Elementos;

public class Metodos {

	WebDriver driver;
	Elementos el = new Elementos();
	

	public void preencher(By elemento, String texto) {
		
		driver.findElement(By.xpath("\"//input[@name='name']\"")).sendKeys(texto);
		

	}

}
