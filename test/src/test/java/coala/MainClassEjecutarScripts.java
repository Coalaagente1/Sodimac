package coala;
import org.testng.annotations.Test;

@Test
public class MainClassEjecutarScripts {
	
		
	@Test
	public void ejecutar() throws InterruptedException {
		
		MenuCorporativoSeleccion menu = new MenuCorporativoSeleccion();
		menu.chrome();
		menu.navegacionMenuPaises();
	}
	
	
	
}
