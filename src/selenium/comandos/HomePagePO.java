package selenium.comandos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class HomePagePO {
	
	private WebDriver driver;
	public Actions acao;
			
	public HomePagePO (WebDriver driver){
		this.driver = driver;
		acao = new Actions(this.driver);
	}
	
	public WebDriver GetDriver(){
		return driver;
	}
	
	public void AcessaHomePage(){
		driver.get("http://store.demoqa.com/");		
	}
	
	//Links
	
	public WebElement Link_Home(){
		return LocalizaElemento("menu-item-15");
	}
	
	public WebElement Link_ImageLogo(){
		return LocalizaElemento("logo");
	}
	
	public WebElement Link_ProductCategorias(){
		return LocalizaElemento("menu-item-33");
	}
	
	//Menus de Categorias.
	
	public void Move_Link_ProductCategorias(){
		
		acao.moveToElement(this.Link_ProductCategorias()).build().perform();		
		
	}	
	
	public WebElement link_ProductCategorias_Acessorios(){
		Move_Link_ProductCategorias();		
		return LocalizaElemento("menu-item-34");
				
	}
	
	public WebElement link_ProductCategorias_Imacs(){
		Move_Link_ProductCategorias();		
		return LocalizaElemento("menu-item-35");
				
	}
	
	public WebElement link_ProductCategorias_Ipads(){
		Move_Link_ProductCategorias();		
		return LocalizaElemento("menu-item-36");
				
	}
	
	public WebElement link_ProductCategorias_Iphones(){
		Move_Link_ProductCategorias();		
		return LocalizaElemento("menu-item-37");
				
	}
	
	public WebElement link_ProductCategorias_Ipods(){
		Move_Link_ProductCategorias();		
		return LocalizaElemento("menu-item-38");
				
	}
	
	public WebElement link_ProductCategorias_Macbooks(){
		Move_Link_ProductCategorias();		
		return LocalizaElemento("menu-item-39");
				
	}
	
	//links.
	
	public WebElement Link_AllProduct(){
		return LocalizaElemento("menu-item-72");
	}
	
	public WebElement Link_Checkout(){
		return LocalizaElemento("header_cart");
	}
		
	public WebElement Link_MyAccount(){
		return LocalizaElemento("account");				
	}
	
	public WebElement Campo_busca(){
		return LocalizaElementoClass("search");				
	}
	
	//Auxiliares.
	
	public WebElement LocalizaElemento (String elemento){
		return driver.findElement(By.id(elemento));
	}
	
	public WebElement LocalizaElementoClass (String classe){
		return driver.findElement(By.className(classe));
	}
	
	

}
