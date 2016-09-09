package selenium.comandos;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupTeste {
	private WebDriver driver;
	public HomePagePO homePage;
	
	public SetupTeste (WebDriver driver) {
		this.driver = driver;
	}
		
	public SetupTeste IniciaChrome(){
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\browsers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//MaximeBrowser();
		return this;
	}
	
	public HomePagePO MaximeBrowser (){
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return new HomePagePO (driver);
				
	}

}
