package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login {
	
	// Elementos de la página web
	
	@FindBy(id="user-name") // id, name, partialLinkText, linkText, xpath, css
	WebElement txtUser;
	
	@FindBy(id="password")
	WebElement txtPassword;
	
	@FindBy(id="login-button")
	WebElement btnLogin;
	
	
	// Constructor
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	// Acciones sobre los elementos de la página web
	
	public void escribirUsuario(String username) {
		txtUser.sendKeys(username);
	}
		
	public void escribirContraseña(String password) {
		txtPassword.sendKeys(password);
	}
		
	public void clickOnLogin() {
		btnLogin.click();
	}
	
}
