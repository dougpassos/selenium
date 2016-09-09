package selenium.comandos;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;




public class ComandosSeleniumTestes {
	private WebDriver driver;	
	public SetupTeste setup = new SetupTeste(driver);
	public HomePagePO homePage;
	
	@Before
	public void setUp() throws Exception {
		homePage = setup.IniciaChrome().MaximeBrowser();
	}
	
	@Test
	public void testDeComandosSelenium () throws InterruptedException {
		homePage.AcessaHomePage();
		/*homePage.Link_MyAccount().click();
		homePage.Link_AllProduct().click();
		homePage.Link_Checkout().click();
		homePage.Link_ImageLogo().click();
		homePage.Link_ProductCategorias().click();
		homePage.Link_Home().click();
		homePage.Campo_busca().sendKeys("iphone 3");
		homePage.Campo_busca().submit();*/
				
		//Thread.sleep(2000);
		homePage.link_ProductCategorias_Acessorios().click();
		homePage.link_ProductCategorias_Imacs().click();
		homePage.link_ProductCategorias_Ipads().click();
		homePage.link_ProductCategorias_Iphones().click();
		homePage.link_ProductCategorias_Ipods().click();
		homePage.link_ProductCategorias_Macbooks().click();
		
				
		Thread.sleep(3000);
		
		
	}
	@After
	public void fechatudos () {
		homePage.GetDriver().close();
	}
	

}
