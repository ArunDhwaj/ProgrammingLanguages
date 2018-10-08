package Main;

public class Observer4 implements IObserver 
{
	@Override
	public void update(String s, int i) 
	{
		System.out.println("Observer4: myValue in "+ s+ " is now: "+i);
	}
}