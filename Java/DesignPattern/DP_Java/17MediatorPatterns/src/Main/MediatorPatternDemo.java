/**
 * 
 */
package Main;

/**
 * @author sbp
 *
 */
public class MediatorPatternDemo 
{
	
	public static void main(String[] args)
	{
		System.out.println("***Mediator Pattern Demo***\n");
		
		ConcreteMediator m = new ConcreteMediator();
		
		Friend1 Aarush = new Friend1(m, "Aarush");
		Friend2 Aarul = new Friend2(m, "Aarul");
		Boss Arun = new Boss(m, "Arun" );
		
		m.setFriend1(Aarush);
		m.setFriend2(Aarul);
		m.setBoss(Arun);
		
		Aarush.Send(" [Aarush here]: Good Morrning. Can we discuss the mediator pattern?");
		Aarul.Send(" [Aarul here]: Good Morning. Yes, we can discuss now.");
		Arun.Send(" [Boss: Arun here]: Please get back to work quickly");
		
	}
}
