package Main;
import Papers.*;

public class TemplateMethodPatternDemo 
{
	
	public static void main(String[] args) 
	{
		System.out.println("*** TemplateMethodPatternDemo.java: main: ***\n");
		
		BasicEngineering bs = new ComputerScience();
		
		System.out.println("Computer Sc Papers:");
		bs.Papers();
		System.out.println();
		
		bs = new Electronics();
		System.out.println("Electronics Papers:");
		bs.Papers();
		
	}

}
