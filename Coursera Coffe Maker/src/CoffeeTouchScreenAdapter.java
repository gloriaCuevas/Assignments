package CoffeeMachines;

public class CoffeeTouchScreenAdapter implements CoffeeMachineInterface{
	OldCoffeeMachine theMachine;

	public CoffeeTouchScreenAdapter(OldCoffeeMachine newMachine) {
		theMachine = newMachine;
	}
	
	public void chooseFirstSelection() {
		theMachine.selectA();
	}
	
	public void chooseSecondSelection() {
		theMachine.selectB();
	}
	
	// Methods used for Testing
	public String chooseFirstSelectionT() {
		return theMachine.selectA();
	}
	
	public String chooseSecondSelectionT() {
		return theMachine.selectB();
	}
	
}
