import java.util.*;

import Observer.*;

class Subject1 implements ISubject
{
	List<IObserver> observerList = new ArrayList<IObserver>();
	private int myValue;
	
	public int getMyValue()
	{
		return myValue;
	}

	public void setMyValue(int myValue)
	{
		this.myValue = myValue;
		//flag value changed .So notify observer(s)
		notifyObservers(myValue);
	}

	@Override
	public void register(IObserver o)
	{
		observerList.add(o);
	}

	@Override
	public void unregister(IObserver o)
	{
		observerList.remove(o);
	}

	@Override
	public void notifyObservers(int updatedValue)
	{
		System.out.println("Subject1: Notifying all registered observer\n");

		for(int i=0;i<observerList.size();i++)
		{
			observerList.get(i).update(updatedValue);
		}
	}
}