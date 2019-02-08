/*
@author: Arun Dhwaj
@date: 8th Feb, 2019
@purpose: A class that will wait for other threads to invoke notify methods to complete it’s processing. 
Notice that Waiter thread is owning monitor on Message object using synchronized block.  
*/ 

package MyThreadLib;
import MyThreadLib.*;
 
public class Waiter implements Runnable 
{
    private Message message; 
    public static long start =  System.currentTimeMillis();
    
    public Waiter( Message m )
    {
        this.message = m;
    }

    @Override
    public void run() 
    {  
        String name = Thread.currentThread().getName(); 
        
        synchronized(message)
        {
            try 
            {
                System.out.println( name + ": waiting to get notified at time: " + (System.currentTimeMillis() - start ));
                message.wait();
            } 
            catch (InterruptedException e) 
            {
                System.out.println(e);
            }
            
            System.out.println( name + ": waiter thread got notified at time: " + (System.currentTimeMillis() - start ));
            
            System.out.println( name + ": waiter thread: Processing the Message now.");
            message.setMsg("New Message from Waiter");
            
            System.out.println( name + ": waiter thread: Processed message: " + message.getMsg());
        }
    }
}

