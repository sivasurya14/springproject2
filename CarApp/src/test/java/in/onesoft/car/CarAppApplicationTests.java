package in.onesoft.car;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CarAppApplicationTests {
	@Autowired
	CarController cc;

	@Test
	void contextLoads() {
	}

	@Test
	public void message() {
	assertEquals("Welcome to Rest Api", cc.showMEssage());
	}
	
	@Test
	public void testSaveData () {
		assertEquals("saved data ", cc.saveData(null));
	}

}

