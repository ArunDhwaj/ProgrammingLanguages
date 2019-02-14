package Aggregate;

import java.util.LinkedList;

import Iterator.IIterator;

public class Science implements ISubject 
{

	//Its storing the Data in LinkedList
	private LinkedList<String> subjects;
	
	public Science()
	{
		subjects = new LinkedList<String>();
		subjects.addLast("Maths");
		subjects.addLast("Comp. Sc.");
		subjects.addLast("Physics");
	}
	
	@Override
	public IIterator CreateIterator() 
	{
		return new ScienceIterator(subjects);	
	}
	
	
	//Containing the ScienceIterator
	public class ScienceIterator implements IIterator
	{
		private LinkedList<String> subjects;
		private int position;
		
		public ScienceIterator(LinkedList<String> subjectsS)
		{
			this.subjects = subjectsS;
			position = 0;
		}
		
		public void First()
		{
			position = 0;
		}
	
		public String Next()
		{
			return subjects.get(position++);
		}
		
		public Boolean IsDone()
		{
			return position >= subjects.size();
		}
		
		public String CurrentItem()
		{
			return subjects.get(position);
		}
		
	}

}
