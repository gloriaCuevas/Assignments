
import acm.program.*;


@SuppressWarnings("serial")
public class Fibonacci extends ConsoleProgram

{

	public void run () 
	{
		int Term = 0;
		int fib1 = 1;
		
		println("This program lists the Fibonacci sequence."); 
		
		while (Term <= MAX_TERM_VALUE) 
		{
			println(Term);
			int fib2 = Term + fib1;
			Term = fib1;
			fib1 = fib2;
		} 		
	}
	
	private static final int MAX_TERM_VALUE = 10000;


}
