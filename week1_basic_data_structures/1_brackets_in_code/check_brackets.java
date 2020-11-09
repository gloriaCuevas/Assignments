import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

class Bracket
{
    Bracket(char type, int position) 
    {
        this.type = type;
        this.position = position;
    }

    boolean Match(char c) 
    {
        if (this.type == '[' && c == ']')
            return true;
        if (this.type == '{' && c == '}')
            return true;
        if (this.type == '(' && c == ')')
            return true;
        return false;
    }

    char type;
    int position;
   
}

class check_brackets 
{
    public static void main(String[] args) throws IOException 
    {
        InputStreamReader input_stream = new InputStreamReader(System.in);//reads bytes and decodes them into characters
        BufferedReader reader = new BufferedReader(input_stream);
        String text = reader.readLine();
        
        int charPosition =0;
        Stack<Bracket> opening_brackets_stack = new Stack<Bracket>();
        for (int position = 0; position < text.length(); ++position) //loop to add input through
        {
            char next = text.charAt(position);//retrieving char at given position
            if (next == '(' || next == '[' || next == '{') //if condition
            {
                // Process opening bracket
            	opening_brackets_stack.push(new Bracket(next, position));	//pushing brackets
            }

            if (next == ')' || next == ']' || next == '}') 
            {
                // Process closing bracket
            	if (opening_brackets_stack.empty())
            	{
            			charPosition = position + 1;// if opening is empty break
            		break;
            	}
            	
            	
            	Bracket brackMatch = opening_brackets_stack.pop();
            	if (brackMatch.Match(next) == false)
            	{
            		
            		charPosition = position + 1;
            		break;
            	}
            }
        }
            
        // Printing answer
            
            	if(charPosition == 0  && opening_brackets_stack.empty())
        			System.out.println("Success");
        		else {
        			if(charPosition == 0) {
        				while(opening_brackets_stack.size()>1)//while size more than 1
        					opening_brackets_stack.pop();//pop head removes
        				charPosition = opening_brackets_stack.peek().position;
        			}
        			System.out.println(charPosition);
        		}
            	
            
    }
}
