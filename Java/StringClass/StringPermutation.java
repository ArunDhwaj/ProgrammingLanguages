import java.util.ArrayList;  
import java.util.List;  
import java.util.Scanner;
  
public class StringPermutation 
{
	static Integer x = 1;
    
	public static List<String> getPermutation(String input) 
    	{  
		System.out.println(x + ": StringPermutation: getPermutation\n");
		x++;
		
        	List<String> collection = null;  
  
        	if (input.length() == 1) 
		{  
            		collection = new ArrayList<String>();  
            		collection.add(input);  
            		return collection;  
        	} 
		else 
		{  
            		collection = getPermutation(input.substring(1));
  
            		Character first = input.charAt(0);  
            		List<String> result = new ArrayList<String>();  
            	
			for (String str : collection) 
			{  
				//Insert the First character, from position 0-to-(n-1)
                		for (int i = 0; i < str.length(); i++) 
				{  
                    			String item = str.substring(0, i) + first + str.substring(i);  
                    			result.add(item);  
                		}  
                
				//Insert the First character, in the last of the string
				String item = str.concat(first.toString());  
                		result.add(item);  
            		}             	
			return result;  
        	}   
    	
	}  
  
    	/** 
     	* @param args 
     	*/  
    	public static void main(String[] args) 
	{ 
		Integer cond = 1;
		Scanner sc = new Scanner(System.in);
		
		while(cond != -1)
		{
			//Resetting the Static int x
			x = 1;
        		System.out.println("Enter the string for permutation: ");
			String str = sc.next(); // Get what the user types.
        	
        		System.out.println(StringPermutation.getPermutation(str));  
        		System.out.println("Enter -1, for stop this program \n");
			
			cond = sc.nextInt();
    		}
		
		if(cond == -1)
		{
        		System.out.println("Closing the scanner and stopping the program \n");
			sc.close();	
		}  
	}
}
