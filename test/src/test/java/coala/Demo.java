package coala;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


@Test
public class Demo {

	@Test
	public void abrirChrome() {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Coalagroup\\Desktop\\selenium webdriver java\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.sodimac.cl/sodimac-cl/");
		driver.manage().window().maximize();
					
		
	}
}
