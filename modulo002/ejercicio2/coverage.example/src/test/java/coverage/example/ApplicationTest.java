package coverage.example;

import org.junit.jupiter.api.Test;

class ApplicationTest {
	@Test
	void testMain() {
		Application.main(null);
		
	}
	
	@Test
	void testApp() {
		new Application();
		
	}
}
