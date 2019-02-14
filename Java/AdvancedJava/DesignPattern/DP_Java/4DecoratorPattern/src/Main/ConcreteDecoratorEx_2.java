package Main;

public class ConcreteDecoratorEx_2 extends AbstractDecorator 
{
	public void doJob()
	{		
		System.out.println("1.1: ConcreteDecoratorEx_2.java: doJob: I am explicitly from Ex_2");
		
		super.doJob();
		
		//Add additional thing if necessary
		System.out.println("Explicitly From DecoratorEx_2");
		System.out.println("***END. EX-2***");
		
		System.out.println("1.2: ConcreteDecoratorEx_2.java: doJob: I am explicitly from Ex_2");
	}
}
