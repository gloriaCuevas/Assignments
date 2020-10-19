
	import acm.program.*; 
	import java.io.*;
	
	
	public class WordCount extends ConsoleProgram {
		
	public void run() 
	{
		
		int words = 0;
		int chars = 0;
		int lines = 0;
		
		
		BufferedReader bF = openFileReader("File: ");
		try 
		{
			while (true) 
			{
				String fila = bF.readLine(); 
				if (fila == null) break; 
				lines++;
				words += wordConteo(fila); 
				chars += fila.length();
			}
				bF.close();
		} catch (IOException ex) 
		{
			println("An error has occurred");
		}
			println("Lines = " + lines);
			println("Words = " + words);
			println("Chars = " + chars);
		}
//ask for file name
	private BufferedReader openFileReader(String answer) 
	{ 
		BufferedReader bF= null;
		while (bF == null) 
		{
	         String file = readLine(answer);
	         try {
	        	 bF = new BufferedReader(new FileReader(file)); 
	         } 
	         catch (IOException B) 
	         {
	        	 println("Unable to open file."); 
	         }
		}
		return bF; 
	}
	
	 //word count
	private int wordConteo(String fila) 
	{ 
		boolean palabra = false;
		int words = 0;
		
		for (int i = 0; i < fila.length(); i++) 
		{
			char letra = fila.charAt(i);
			
			if (Character.isLetterOrDigit(letra)) 
			{
	            palabra = true;
			}
	         else 
	         {
	            if (palabra) words++;
	            palabra = false;
	         }
		}
			
	      if (palabra) words++;
	      return words;
		} 
	}
