/**
@file: SerializedSingleton.java
@author: Arun Dhwaj
@date: 3rd Aug, 2018
@purpose: SerializedSingleton implementation in java
**/

package SingletonLib;
import java.io.Serializable;

public class SerializedSingleton implements Serializable 
{
	private static final long serialVersionUID = -7604766932017737115L;
 
	//Declaring the private SerializeSingleton constructor
	private SerializedSingleton() 
	{
		// TODO Auto-generated constructor stub
	}
	
	//Declaring the SingletonHelper
	private static class SingletonHelper
	{
		private static final SerializedSingleton ssInstance = new  SerializedSingleton();
	}
	
	public static SerializedSingleton getInstance()
	{
		return SingletonHelper.ssInstance;
	}
	
	protected Object readResolve() 
	{
	    return getInstance();
	}	
}
