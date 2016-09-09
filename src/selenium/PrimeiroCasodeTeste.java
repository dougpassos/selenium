package selenium;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PrimeiroCasodeTeste {
private WebDriver driver;
private String baseUrl;
String VerificaTexto = "";
public CharSequence dadosPesquisa = "Jarvis";

@Before
public void setUp() throws Exception {
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\browsers\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();
baseUrl = ("https://www.google.com.br/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

@Test
public void testPesquinaGoogle() {
driver.get(baseUrl);
driver.findElement(By.id("lst-ib")).sendKeys(dadosPesquisa);
driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
}

@After
public void fechaTudo(){
//driver.close();
}




}

