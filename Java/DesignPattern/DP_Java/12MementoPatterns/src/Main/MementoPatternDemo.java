package Main;

public class MementoPatternDemo 
{

	public static void main(String[] args) 
	{
		System.out.println("***Memento Pattern Demo***\n");
		
		Originator o = new Originator();
		o.setState("First state - 1");
		
		// Holding old state
		Caretaker c1 = new Caretaker();
		c1.SaveMemento(o.OriginatorMemento());
		
		//Changing state
		o.setState("Second state - 2");
		
		// Holding old state
		Caretaker c2 = new Caretaker();
		c2.SaveMemento(o.OriginatorMemento());

		// Restore to saved state - 1
		o.Revert(c1.RetrieveMemento());
		
		//Changing state
		o.setState("Second state - 3");

		// Holding old state
		Caretaker c3 = new Caretaker();
		c3.SaveMemento(o.OriginatorMemento());

		// Restore to saved state - 2
		o.Revert(c2.RetrieveMemento());

		// Restore to saved state - 1
		o.Revert(c1.RetrieveMemento());

	}
}
