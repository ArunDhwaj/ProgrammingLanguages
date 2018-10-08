import java.lang.*;
import java.util.*;
import java.util.Math;

public class DivideByZero
{
	static int a=2;

	public static void main(String args[])
	{
		int y=1,x=1, p=0;
		
		try
		{
			int z = a/p; 
			x = a/y;
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("1.1: " + e);	
		}

		finally
		{
			System.out.println(x);	
		}
	}
}
