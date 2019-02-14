package Main;

public class RnDDemo 
{
	public static void main(String[] args) 
	{
		Father f1 = new Son();
//		Son f1 = new Son();
		
//		Son f1 = (Son) new Father();
		
//		Father f1 = (Father) new Son();
		
        System.out.println(f1.name);
        System.out.println(f1.getName());
        
        f1.setName("Arun Dhwaj");
        
        System.out.println(f1.name);
        System.out.println(f1.getName());
        f1.shine();
        
	}
}
