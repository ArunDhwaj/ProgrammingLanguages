package Main;

public class MakeACaptain 
{
//	private static MakeACaptain captain;
	
	private MakeACaptain() 
	{ 
		//Empty
	}
	
	//Bill Pugh solution
	private static class SingletonHelper
	{
		//Nested class is referenced after getCaptain() is called
		
		private static final MakeACaptain captain = new MakeACaptain();
	}
	
	public static MakeACaptain getCaptain()
	{
		return SingletonHelper.captain;
	}
	
}
