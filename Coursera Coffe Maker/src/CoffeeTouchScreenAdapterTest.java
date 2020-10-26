package CoffeeMachines;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CoffeeTouchScreenAdapterTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCoffeeTouchScreenAdapter() {
		OldCoffeeMachine oldMachine = new OldCoffeeMachine();
		CoffeeTouchScreenAdapter test = new CoffeeTouchScreenAdapter(oldMachine);
		assertNotNull(test);
	}

	@Test
	public void testChooseFirstSelectionT() {
		OldCoffeeMachine oldMachine = new OldCoffeeMachine();
		CoffeeTouchScreenAdapter test = new CoffeeTouchScreenAdapter(oldMachine);
		
		assertEquals("A - Selected", test.chooseFirstSelectionT());
	}

	@Test
	public void testChooseSecondSelectionT() {
		OldCoffeeMachine oldMachine = new OldCoffeeMachine();
		CoffeeTouchScreenAdapter test = new CoffeeTouchScreenAdapter(oldMachine);
		
		assertEquals("B - Selected", test.chooseSecondSelectionT());
	}

}
