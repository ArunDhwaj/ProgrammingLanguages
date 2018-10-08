public class StaticVariable
{
	public static String testString;
	
	//Static variable example
	private static int testValue;
	
	//Static block-1 
	static
	{
		System.out.println("\n Static block-1");
		setTestString("block-1 string");
		setTestValue(1);
	}


	//Static block-2 
	static
	{
		System.out.println("\n Static block-2");
	}


	public int getTestValue()
	{
		return testValue;
	}

	public static void setTestValue(int testValue)
	{
		if(testValue > 0)
		{
			StaticVariable.testValue = testValue;
			System.out.println("StaticVariable: setTestValue: testValue: " + testValue);	
		}

	}
	
	
	//@return the testString
	
	public static String getTestString() 
	{
		return testString;
	}
 
	/**
	* @param testString the testString to set
	*/
	public static void setTestString(String testString) 
	{
		StaticVariable.testString = testString;
		System.out.println("setTestString method: " + testString);
	}
 
	//Static util method
	public static int subValue(int i, int... js) 
	{
		int sum = i;
		for (int x : js)
			sum -= x;
		return sum;
	}

} 
