import acm.program.*;

@SuppressWarnings("unused")
public class StringProcessing {
	
	
	public void run () 
	{
		while (true) 
			{
			String digits = readLine("Enter a numeric string: ");
			if (digits.length() == 0) break; 
			println(addCommasToNumericString(digits));
			}
		
		removeAllOccurrences("This is a test", 't');
		removeAllOccurrences("Summer is here!", 'e');
		removeAllOccurrences("---0---", '-');
		
		
	}
	
	private void println(String addCommasToNumericString) 
	{
		// TODO Auto-generated method stub
		
	}

	private String readLine(String string) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	//add commas
	private String addCommasToNumericString(String digits) 
		{ 
			String result = "";
			int length = digits.length();
			int numDigits = 0;
			
			for (int i = length - 1; i >= 0; i--) 
			{ 
				result = digits.charAt(i) + result; 
				numDigits++;
				if (((numDigits % 3) == 0) && (i > 0)) 
					result = "," + result;
			}

	   return result;
		}
	
	//deleting characters
	private String removeAllOccurrences(String str, char ch) 
	{ 
		String result = "";
		for (int i = 0; i < str.length(); i++) 
		{
			if (str.charAt(i) != ch) { result += str.charAt(i);
		} 
	}
		return result;
	}
}
