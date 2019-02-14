package Aggregate;

import Iterator.IIterator;

public class Arts implements ISubject 
{
	
	//Its storing the Data in Big Array
	private String[] subjects;

	public Arts()
	{
		subjects = new String[3];
		subjects[0] = "Hindi";
		subjects[1] = "English" ;
		subjects[2] = "Bengali" ;
	}

	@Override
	public IIterator CreateIterator() 
	{
		return new ArtsIterator(subjects);
	}	
	
	//Containing the ArtsIterator
	public class ArtsIterator implements IIterator
	{
		private String[] subjects;
		private int position;
		
		public ArtsIterator(String[] subjects)
		{
			this.subjects = subjects;
			position = 0;
		}
		
		public void First()
		{
			position = 0;
		}
		
		public String Next()
		{
			return subjects[position++];
		}
		
		public Boolean IsDone()
		{
			return position >= subjects.length;
		}
		
		public String CurrentItem()
		{
			return subjects[position];
		}
	}
	
}
