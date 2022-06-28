package Tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.Chekout;
import Pages.Home;
import Pages.Login;


public class SauceDemoTest {
	String url = "https://www.saucedemo.com/";
	String driverPath = "..\\SauceDemoFinal\\Drivers\\chromedriver.exe";
	WebDriver driver;
	
	@BeforeSuite
	public void abrirPagina() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void iniciarSesion() {
		Login ingreso = new Login(driver);
		
		ingreso.escribirUsuario("standard_user");
		ingreso.escribirContraseña("secret_sauce");
		ingreso.clickOnLogin();
	}
	
	
	@Test
	public void realizarCompra() {
		Home inicio = new Home (driver);
		
		inicio.ingresarAlProducto();
		inicio.agregarAlCarrito();
		inicio.ingresarAlCarrito();
		inicio.presionarVerificar();

		Chekout compra = new Chekout(driver);
		
		compra.escribirNombre("Alan");
		compra.escribirApellido("Diaz");
		compra.escribirCodigoPostal("1825");
		compra.seleccionarContinuar();
		compra.seleccionarFinalizar();
	}
	
	@AfterSuite
	public void cerrarNavegadador() {
		driver.close();
		
	}
	
	
}