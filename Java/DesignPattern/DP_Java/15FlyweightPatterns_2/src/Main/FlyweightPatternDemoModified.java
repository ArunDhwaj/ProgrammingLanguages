/**
 * 
 */
package Main;

import java.util.*;

/**
 * @author sbp
 *
 */
public class FlyweightPatternDemoModified 
{
	public static void main(String[] args) throws Exception
	{
	
		RobotFactory myfactory = new RobotFactory();
		System.out.println("\n***Flyweight Pattern Example Modified***\n");
		Robot shape;
	
		/*Here we are trying to get 3 king type robots*/
		for (int i = 0; i < 3; i++)
		{
			shape = (Robot) myfactory.GetRobotFromFactory("King");
			shape.setColor(getRandomColor(i));
			shape.Print();
		}
		
		System.out.println("\n*** Storing the previous color or not ? ***\n");
		
		/*Here we are trying to get 3 king type robots*/
		for (int i = 0; i < 3; i++)
		{
			shape = (Robot) myfactory.GetRobotFromFactory("King");
//			shape.setColor(getRandomColor(i));
			shape.Print();
		}

		/*Here we are trying to get 3 queen type robots*/
		for (int i = 0; i < 3; i++)
		{
			shape = (Robot) myfactory.GetRobotFromFactory("Queen");
			shape.setColor(getRandomColor(i));
			shape.Print();
		}
	
		int NumOfDistinctRobots = myfactory.TotalObjectsCreated();
		//System.out.println("\nDistinct Robot objects created till now = "+ NumOfDistinctRobots);
	
		System.out.println("\n Finally no of Distinct Robot objects created: "+ NumOfDistinctRobots);
	}
	
	
	static String getRandomColor(int i)
	{
		String colorType = "";
		Random r = new Random();
		/*You can supply any number of your choice in nextInt argument.www
		
		* we are simply checking the random number generated is an even number
		* or an odd number. And based on that we are choosing the color. For
		simplicity, we'll use only two colors—red and green
		*/
		
		int random = r.nextInt(20);
	
//		if(random % 2 == 0)
		if( i % 3 == 0)
		{
			colorType = "blue";
		}
		else if( i % 3 == 1)
		{
			colorType = "green";
		}
		else if( i % 3 == 2)
		{
			colorType = "red";
		}
		
		return colorType;
	}
	
}
