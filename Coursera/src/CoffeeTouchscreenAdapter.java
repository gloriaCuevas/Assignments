
public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface
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

		@Override
		public void FirstSelection() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void SecondSelection() {
			// TODO Auto-generated method stub
			
		}
}
