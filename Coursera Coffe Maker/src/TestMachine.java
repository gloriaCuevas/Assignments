

public class TestMachine {

	public static void main(String args[]) {
		
		OldCoffeeMachine testMachine = new OldCoffeeMachine();
		
		CoffeeTouchScreenAdapter testAdapter = new CoffeeTouchScreenAdapter(testMachine);
		
		testAdapter.chooseFirstSelection();
		testAdapter.chooseSecondSelection();
		
	}
	
}
