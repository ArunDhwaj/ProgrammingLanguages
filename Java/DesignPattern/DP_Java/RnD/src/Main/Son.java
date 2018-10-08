package Main;

public class Son extends Father 
{
//	 private String name = "John Junior";
	public String name = "John Junior";

     public void shine() 
     {
           System.out.println(name + "'s shining");
     }

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	} 
     
}
