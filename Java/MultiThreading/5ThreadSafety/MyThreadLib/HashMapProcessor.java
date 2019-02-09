/*
@author: Arun Dhwaj
@date: 9th Feb, 2019
@purpose: A class that will process an array and convert into hash.  
*/ 

package MyThreadLib;
import MyThreadLib.*;
 
public class HashMapProcessor implements Runnable 
{
    private String name;
    private String[] strArr = null;
    
    //dummy object variable for synchronization
    private Object mutex = new Object();

    public static long start; // =  System.currentTimeMillis();
    
    public HashMapProcessor( String[] m )
    {
        this.strArr = m;
    }

    public String[] getMap() 
    {
        return strArr;
    }

    @Override
    public void run() 
    {  
        name = Thread.currentThread().getName();
        
        for(int i=0; i < strArr.length; i++)
        {
            processSomething(i);
            
            //process data and append thread name
            addThreadName(i, name);
        }
    } 

    private void addThreadName(int i, String name) 
    {
        synchronized(mutex)
        {
            strArr[i] = strArr[i] +":"+name;
        }
    }

    private void processSomething(int index) 
    {
        // processing some job
        try 
        {
            Thread.sleep(index*1000);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
}

