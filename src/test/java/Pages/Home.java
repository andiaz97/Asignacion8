package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	@FindBy(id= "item_4_title_link")
	WebElement btnProducto;
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement btnAddToCart;
	
	@FindBy(xpath="//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")
	WebElement btnShoppingCart;
	
	@FindBy (id="checkout")
	WebElement btnCheckout;

	
	public Home(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}

	public void ingresarAlProducto() {
		btnProducto.click();
		}
	
	public void agregarAlCarrito() {
		btnAddToCart.click();
		}
	
	public void ingresarAlCarrito() {
		btnShoppingCart.click();
		}
	
	public void presionarVerificar() {
		btnCheckout.click();
	}
}