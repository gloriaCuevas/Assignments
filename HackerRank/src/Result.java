

import java.util.HashMap;



class Result {
	  public static void main(String[] args) {
  
    Result.maximumOccurringCharacter("lallssssmwpppp");
	  }
    public static char maximumOccurringCharacter(String text) 
    { 
    	int max = 0;
    	char ch = 0;
    	int count = 0;
    	HashMap<Character, Integer> map = new HashMap<>();
    	
    	
    	
    	for(int i = 0; i < text.length() ; i++)
    	{
    		  ch = text.charAt(i);
    	   if(map.containsKey(ch))
    		{
    			count = map.get(ch);
    			count++;
    			map.replace(ch, count);
    		
    		}else{
    			map.put(ch, 1);	
    		}
    	}
    	
    	if(map.get(ch)>max)
    	{
    		char maxChar = ch;
            max = map.get(ch);
    	
         System.out.println("The max character is : "+ maxChar);
  
    	}
		 return 0;
		
    	
}
}
    	

    




