package Main;

public class Observer2 implements IObserver 
{
	@Override
	public void update(String s, int i) 
	{
		System.out.println("Observer2: myValue in "+ s+ " is now: "+i);
	}
}