package Main;

public class Observer3 implements IObserver 
{
	@Override
	public void update(String s, int i) 
	{
		System.out.println("Observer3: myValue in "+ s+ " is now: "+i);
	}
}