package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	private By customerName = By.xpath("//input[@name='name']");
	private By gender = By.name("rad1");
	
	public By getCustomerName() {
		return customerName;
	}

	public By getGender() {
		return gender;
	}

}
