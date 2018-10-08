import java.util.*;  
class ArrayListTest
{  
	public static void main(String args[])
	{  
  		ArrayList<String> list = new ArrayList<String>(); //Creating arraylist
  
		list.add("InstantOPD");
		list.add("F2F");
		list.add("MSO");
		list.add("Aayush");
		list.add("VET");
		list.add("Disease Info");
		list.add("How it Works");

  		//Traversing list through Iterator  
		Iterator itr = list.iterator();
		int ctr = 0;  
  		
		while(itr.hasNext())
		{
   			System.out.println( ctr + " : " + itr.next() ); 
			ctr++; 
  		}	  
 	}  
}  

