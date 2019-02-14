class Observer4 implements IObserver
{
	@Override
	public void update(int i)
	{
		System.out.println("Observer4: myValue in Subject is now: "+i);
	}
}
