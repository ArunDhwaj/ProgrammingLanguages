 
public class StaticKeyword 
{
 
	public static void main(String[] args) 
	{
		StaticVariable.setTestValue(5);
 
		//non-private static variables can be accessed with class name
		StaticVariable.testString = "\nAssigning testString a value";
		

		StaticVariable csd = new StaticVariable();
		System.out.println(csd.getTestString());
 
		//Class and instance static variables are same
		System.out.print("\nCheck if Class and Instance Static Variables are same:  ");
		System.out.println(StaticVariable.testString == csd.testString);
		System.out.println("Why? Because: StaticVariable.testString == csd.testString");
	}
}
