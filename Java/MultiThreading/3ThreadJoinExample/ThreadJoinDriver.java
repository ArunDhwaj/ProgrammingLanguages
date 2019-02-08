/*
@author: Arun Dhwaj
@date: 6th Feb, 2019
@purpose: POC: Exploring Thread Sleep
*/

import MyRunnableLib.*;

public class ThreadJoinDriver
{
    public static void main( String[] args) throws InterruptedException
    {
        Thread t1 = new Thread( new MyRunnable(), "t1");
        Thread t2 = new Thread( new MyRunnable(), "t2");
        Thread t3 = new Thread( new MyRunnable(), "t3");
        
        //Current time in millis

        long start =  System.currentTimeMillis();
        MyRunnable.start = start;
        
        t1.start();
        //System.out.println("Thread started::: " + (System.currentTimeMillis() - start ) + ": "+ Thread.currentThread().getName());

        //Start thread t2 after waiting for 2 seconds or if t1 is dead
        try
        {
            t1.join(2000);
        }
        catch (InterruptedException e) 
        {
            //e.printStackTrace();
        }

        //System.out.println("Sleep time in ms = "+(System.currentTimeMillis()-start));
        
        t2.start();
        //System.out.println("Thread started::: " + (System.currentTimeMillis() - start ) + ": "+ Thread.currentThread().getName());

        //start third thread only when first thread is dead
        try 
        {
            t1.join();
        } 
        catch (InterruptedException e) 
        {
            //e.printStackTrace();
        }

        t3.start();
        //System.out.println("Thread started::: " + (System.currentTimeMillis() - start ) + ": "+ Thread.currentThread().getName());

        //Let all threads finished execution before finishing main thread 

        try
        {
            t1.join();
            t2.join();
            t3.join();
        }
        catch(InterruptedException e)
        {
            //e.printStackTrace(e);
        }
        
        System.out.println("All threads are dead, exiting main thread::: " + (System.currentTimeMillis() - start ) + ": "+ Thread.currentThread().getName());
    }
}
