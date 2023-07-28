package in.onesoft.bikes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTest {

	@Test
	void getMessage() {
		ShopController st = new ShopController();
		String expected = "Welcome";
		String actual = st.getMessage();
		assertEquals(expected, actual);
	}
}
