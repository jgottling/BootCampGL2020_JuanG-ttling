package hibernate.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
	
		daoMenu = new MenuDaoImpl();
		daoPlato = new PlatoDaoImpl();
		
		menu = new Menu("Menu del dia", "lo mejor");
		
		daoPlato.createPlato(plato1);
		daoPlato.createPlato(plato2);
		daoMenu.createMenu(menu);
		
		menu.addPlato(plato1);
		menu.addPlato(plato2);
		
		daoMenu.updateMenu(menu);
		daoPlato.updatePlato(plato1);
		daoPlato.updatePlato(plato2);

	}

	@Test
	@DisplayName("Trae un menu")
	void test() {
	
		assertEquals(1, daoMenu.getMenuById((long) 1).getId());
	}
	
	@Test
	@DisplayName("Trae un menu y sus platos")
	void test2() {
	
		assertEquals(1250, daoMenu.getMenuById((long) 1).getPrecio());
	}
	
	@Test
	@DisplayName("Crear menu con platos")
	void test3() {
	
		assertEquals(1, daoMenu.getMenus().size());
	}
	
	@Test
	@DisplayName("Crear y recuperar más de un menu")
	void test4() {
		Menu menu2 = new Menu("Menu de noche", "para dormir mejor"); 
		
		daoMenu.createMenu(menu2);
		
		System.out.println("Id de menu2 es: " + menu2.getId() );
		assertEquals(2, daoMenu.getMenus().size());
	}
	
	@Test
	@DisplayName("Borrar menu")
	void test5() {
		daoMenu.removeMenu(menu);
	
		assertEquals(1, daoMenu.getMenus().size());
	}
	

	@Test
	@DisplayName("Actualizar menu")
	void test6() {
		
		Menu menu3 = new Menu("Especial", "lo mas caro");
		
		daoMenu.createMenu(menu3);
		
		menu3.setNombre("SuperEspecial");
		
		daoMenu.updateMenu(menu3);
		
		assertEquals("SuperEspecial", daoMenu.getMenuById(3l).getNombre());
	}
}
