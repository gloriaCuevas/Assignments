

public class ExpandableArray 
{
	
	private Object[] selfExpand;

	public ExpandableArray() 
	{
		selfExpand = new Object[0]; 
	}
	public void setExpander(int index, Object value)
	{
		if (index >= selfExpand.length) 
		{
			Object[] newArray = new Object[index + 1];
		
		for (int i = 0; i < selfExpand.length; i++) 
		{
	         newArray[i] = selfExpand[i];
		}
		 selfExpand = newArray;
	   }
	   selfExpand[index] = value;
	}
	
	public Object getElement(int index) 
	{
		if (index >= selfExpand.length) 
			return null; 
		
		return selfExpand[index];
	}
	
}
	
	   
	