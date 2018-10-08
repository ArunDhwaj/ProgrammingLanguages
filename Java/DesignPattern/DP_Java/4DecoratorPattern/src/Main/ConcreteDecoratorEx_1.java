package Main;

public class ConcreteDecoratorEx_1 extends AbstractDecorator 
{
	public void doJob()
	{
		System.out.println("1.1: ConcreteDecoratorEx_1.java: doJob: I am explicitly from Ex_1");
		
		super.doJob();
		
		//Add additional thing if necessary
		System.out.println("1.2: ConcreteDecoratorEx_1.java: doJob: I am explicitly from Ex_1");
	}
}
