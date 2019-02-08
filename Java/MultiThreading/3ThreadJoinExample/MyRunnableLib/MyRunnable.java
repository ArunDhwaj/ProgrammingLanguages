/*
@author: Arun Dhwaj
@date: 6th Feb, 2019
@purpose: My Runnable  
*/ 
package MyRunnableLib;
 
public class MyRunnable implements Runnable
{
    public static long start; 
    
    @Override
    public void run() 
    {
        
        //long start =  System.currentTimeMillis();
        System.out.println("Thread started::: " + (System.currentTimeMillis() - start ) + ": "+ Thread.currentThread().getName());
        

        try 
        {
            Thread.sleep(4000);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        
        //System.out.println("Thread ended::: " + (System.currentTimeMillis() - start ) + ": "+ Thread.currentThread().getName());
    }
}

