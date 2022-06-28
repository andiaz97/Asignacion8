package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Chekout {
	
	@FindBy(id="first-name")
	WebElement txtFirstName;
	
	@FindBy(id="last-name")
	WebElement txtLastName;
	
	@FindBy(id="postal-code")
	WebElement txtPostalCode;
	
	@FindBy(id="continue")
	WebElement btnContinue;
	
	@FindBy (id="finish")
	WebElement btnFinish;
	
	
	public Chekout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void escribirNombre (String name) {
		txtFirstName.sendKeys(name);
	}
	
	public void escribirApellido (String lastname) {
		txtLastName.sendKeys(lastname);
	}
	
	public void escribirCodigoPostal (String postalcode) {
		txtPostalCode.sendKeys(postalcode);
	}
	
	public void seleccionarContinuar () {
		btnContinue.click();
	}
	
	public void seleccionarFinalizar () {
		btnFinish.click();
	}
	
}
