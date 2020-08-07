package hibernate.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import hibernate.example.daos.MenuDaoImpl;
import hibernate.example.daos.PlatoDaoImpl;
import hibernate.example.models.Menu;
import hibernate.example.models.Plato;

public class MenuTests {

	static Plato plato1;
	static Plato plato2;
	static Menu menu;
	static MenuDaoImpl daoMenu;
	static PlatoDaoImpl daoPlato;
	
	@BeforeAll
	static void setup() {
		plato1 = new Plato("Milanesa Clasica", "una delicada milanesa con crocantes papas fritas finamente seleccionadas", 500.00);
		plato2 = new Plato("Lomo a la piedra", " un curioso plato donde se utilizan piedras calentadas al rojo vivo para cocinar el lomo junto a especias orientales y sudamericanas logrando un elixir entre la textura y el sabor",750.00);
		
		menu = new Menu("Menu del dia", "lo mejor");
		menu.addPlato(plato1);
		menu.addPlato(plato2);
		
		daoMenu = new MenuDaoImpl();
		daoPlato = new PlatoDaoImpl();
		
		daoPlato.createPlato(plato1);
		daoPlato.createPlato(plato2);
		daoMenu.createMenu(menu);

	}
	
	@Test
	@DisplayName("Crear menu con platos")
	void test1() {
	
		assertEquals(1, daoMenu.getMenus().size());
	}
	
	@Test
	@DisplayName("Crear y recuperar más de un menu")
	void test2() {
		Menu menu2 = new Menu("Menu de noche", "para dormir mejor"); 
		
		daoMenu.createMenu(menu2);
	
		assertEquals(2, daoMenu.getMenus().size());
	}
	
	@Test
	@DisplayName("Borrar menu")
	void test3() {
		daoMenu.removeMenu(menu);
	
		assertEquals(1, daoMenu.getMenus().size());
	}
	
	
	@Test
	@DisplayName("Buscar menu por nombre")
	void test4() {
	
		assertNotNull(daoMenu.getMenuByName("Menu de noche"));
	}
	
	@Test
	@DisplayName("Actualizar menu")
	void test5() {
		
		Menu menu3 = new Menu("Especial", "lo mas caro");
		
		daoMenu.createMenu(menu3);
		
		menu3.setNombre("SuperEspecial");
		
		daoMenu.updateMenu(menu3);
		
		assertNotNull(daoMenu.getMenuByName("SuperEspecial"));
	}
}
