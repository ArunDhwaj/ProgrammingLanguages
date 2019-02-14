package Main;

import java.util.*;

public class Subject1 implements ISubject 
{

	private int myValue;
	
	List<IObserver> observersList = new ArrayList<IObserver>();
	
	
	public int getMyValue() 
	{
		return myValue;
	}
	
	public void setMyValue(int myValue) 
	{
		this.myValue = myValue;
		
		//Notify observers
		notifyObservers(myValue);
	}
	
	
	@Override
	public void register(IObserver o) 
	{
		System.out.println(o.getClass().getName() + ": is register to Subject1\n");
		observersList.add(o);
	}

	@Override
	public void unregister(IObserver o) 
	{
		System.out.println(o.getClass().getName() + ": is unregister to Subject1\n");
		observersList.remove(o);
	}

	@Override
	public void notifyObservers( int updatedValue )
	{
		for(int i = 0; i < observersList.size(); i++ )
		{
			observersList.get(i).update(this.getClass().getSimpleName(), updatedValue);
		}
	}

}
