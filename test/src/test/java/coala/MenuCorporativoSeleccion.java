package coala;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Test
public class MenuCorporativoSeleccion {
public WebDriver driver;

	@Test
	public  void chrome() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Coalagroup\\Desktop\\selenium webdriver java\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.sodimac.com/?corporativo=1");
		driver.manage().window().maximize();		
	}

	@Test
	public void navegacionMenuPaises() throws InterruptedException {
		
		Actions moverRaton;
		WebElement elementoLista1;
		WebElement elementoLista2;
		WebElement elementoLista3;
		WebElement elementoLista4;
		WebElement elementoLista5;
		WebElement elementoLista6;
		
	
		moverRaton = new Actions(driver);
		elementoLista1 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/ul/li[1]/a"));
		elementoLista2 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/ul/li[2]/a"));
		elementoLista3 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/ul/li[3]/a"));
		elementoLista4 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/ul/li[4]/a"));
		elementoLista5 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/ul/li[5]/a"));
		elementoLista6 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/ul/li[6]/a"));
		
			
		
		moverRaton.moveToElement(elementoLista1).perform();
	//	moverRaton.moveToElement(elementoLista1).click().perform();
		Thread.sleep(1000);
		moverRaton.moveToElement(elementoLista2).perform();
		Thread.sleep(1000);
		moverRaton.moveToElement(elementoLista3).perform();
		Thread.sleep(1000);
		moverRaton.moveToElement(elementoLista4).perform();
		Thread.sleep(1000);
		moverRaton.moveToElement(elementoLista5).perform();
		Thread.sleep(1000);
		moverRaton.moveToElement(elementoLista6).perform();
		Thread.sleep(1000);
	}
	
}


