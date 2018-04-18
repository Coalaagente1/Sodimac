package coala;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



//login usando chrome
public class LoginPrimerIngreso {
	
	public static WebElement email;
	public static WebElement pass;
	public static WebElement Iconocuenta;
	public static WebElement botonLogear;
	
	
public static void chrome() {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Coalagroup\\Desktop\\selenium webdriver java\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	
		
	try {
		
		for(int i=0;i<4;i++) {
			
			driver.get("http://www.sodimac.cl/sodimac-cl/");
			driver.manage().window().maximize();
						
			
					//boton cuenta
			    	Iconocuenta = driver.findElement(By.id("account"));
			    	Iconocuenta.click();
					
					//textbox rut
					email = driver.findElement(By.id("inputEmail"));
					email.click();
					email.sendKeys("test@test.cl");
					
					
					//textbox pass
					pass = driver.findElement(By.id("loginPassword"));
					pass.click();
					pass.sendKeys("000111");
					
					
					botonLogear = driver.findElement(By.name("/atg/userprofiling/ProfileFormHandler.newProcessLoginP"));
					botonLogear.click();
					
					Thread.sleep(1000);
					
							
		}
		
		driver.close();
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.print(e);
	}
		
	}


	public static void main(String[] args) throws InterruptedException {
	//Firefox mozzila = new Firefox();
	//IE iexplorer = new IE();
	//  mozzila.ejecutarFirefox();
	//	chrome();
	//	iexplorer.ejecutarIE();
	}

	
}
