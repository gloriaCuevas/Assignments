
public abstract class CoffeeTouchscreenAdapter implements CoffeeMachineInterface
{
	  
		OldCoffeeMachine laVieja;

		public CoffeeTouchscreenAdapter(OldCoffeeMachine newMachine) 
		{
			laVieja = newMachine;
		}
		
		public void chooseFirstSelection() 
		{
			laVieja.selectA();
		}
		
		public void chooseSecondSelection() 
		{
			laVieja.selectB();
	}
}
