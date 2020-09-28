import stanford.karel.*;

public class VotingBox extends SuperKarel {

	public void run() 
	{
		while (frontIsClear()) 
		{
			move();
	         if (noBeepersPresent()) 
	        {
	        	 
	             deleteBeeper();
	        }
	         
	         move(); 
		}
		
	}
	
	   private void deleteBeeper() 
	   {
	      turnRight();
	      verify();
	      verify();
	      turnLeft();
	  }

	
	   private void verify() 
	   {
	      move();
	      while (beepersPresent()) 
	      {
	         pickBeeper();
	      }
	      turnAround();
	      move();
	}	
	
		
}
