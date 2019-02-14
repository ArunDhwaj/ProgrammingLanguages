/**
 * 
 */
package Main;

/**
 * @author sbp
 *
 */
public class Friend1 extends Friend 
{

	public Friend1(Mediator mediator, String name)
	{
		super(mediator);
		this.name = name;
	}
	
	public void Send(String msg)
	{
		mediator.Send(this, msg);
	}
	
	public void Notify(String msg)
	{
		System.out.println(this.name + " gets message: "+ msg);
	}
	
}
