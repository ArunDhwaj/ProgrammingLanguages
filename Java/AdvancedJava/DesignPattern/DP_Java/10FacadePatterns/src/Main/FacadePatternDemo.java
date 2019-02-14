package Main;
import robotFacade.*;

public class FacadePatternDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("***Facade Pattern Demo***");
		RobotFacade rf1 = new RobotFacade();
		rf1.ConstructRobot("Green", "Iron");
		
		RobotFacade rf2 = new RobotFacade();
		rf2.ConstructRobot("Blue", "Steel");
		
		RobotFacade rf3 = new RobotFacade();
		rf3.ConstructRobot("Red", "Plastic");		
	}
}
