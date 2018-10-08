/**
 * 
 */
package Main;

/**
 * @author sbp
 *
 */
public abstract class Friend 
{
	protected Mediator mediator;
	public String name;
	
	//Constructor
	public Friend(Mediator _mediator)
	{
		mediator = _mediator;
	}
	
}
