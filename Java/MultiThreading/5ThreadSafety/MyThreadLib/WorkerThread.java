/*
@author: Arun Dhwaj
@date: 8th Feb, 2019
@purpose: 
A class that will do the work.  
*/ 

package MyThreadLib;
import MyThreadLib.*;
 
public class WorkerThread implements Runnable 
{
    private int count; 
    private String name; 
    
    //dummy object variable for synchronization
    private Object mutex = new Object();

    public static long start =  System.currentTimeMillis();
    
    @Override
    public void run() 
    {  
        name = Thread.currentThread().getName();
                 
        for(int i=0; i<5; i++)
        {
            doProcessing(i);

            synchronized(mutex)
            {
                count++;
            }
        }
    }

    public int getCount()
    {
        return this.count;
    }

    private void doProcessing(int i) 
    {
        // processing some job
        try 
        {
            Thread.sleep(i*1000);
        } 
        catch (InterruptedException e) 
        {
            System.out.println( name + ": thread: Processing.");
        }
    }
}

