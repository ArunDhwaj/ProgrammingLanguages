package Main;

public abstract class AbstractDecorator extends Component 
//public abstract class AbstractDecorator extends ConcreteComponent
{
	protected Component com;
	
	public void SetTheComponent(Component c)
	{
		com = c;
	}
	
	public void doJob()
	{
		if (com != null)
		{
			com.doJob();
		}
	}
}
