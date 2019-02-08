/*
@author: Arun Dhwaj
@date: 8th Feb, 2019
@purpose: A class that will process on Message object and then invoke notify method to wake up threads waiting for Message object. Notice that synchronized block is used to own the monitor of Message object.
*/
 
package MyThreadLib;
import MyThreadLib.*;
 
public class Notifier implements Runnable 
{
    private Message message; 
    public static long start =  System.currentTimeMillis();
    
    public Notifier( Message m )
    {
        this.message = m;
    }

    @Override
    public void run() 
    {  
        String name = Thread.currentThread().getName(); 
        System.out.println( name + " started at time: " + (System.currentTimeMillis() - start ));
        
        try 
        {
            Thread.sleep(2000);
            
            synchronized(message)
            {
                message.setMsg(name+": thread work is done");
                //message.notify();
                message.notifyAll();
            }
        }
        catch (InterruptedException e) 
        {
            System.out.println(e);
        }
            
        System.out.println( name + "  thread, now getting this message: " + message.getMsg());
    }
}

/*
///////////////////////////////////////////
///Output:
///////////////////////////////////////////

All the threads are started
notifier1 started at time: 3
waiter1: waiting to get notified at time: 3
waiter2: waiting to get notified at time: 3
waiter2: waiter thread got notified at time: 2006
notifier1  thread, now getting this message: notifier1: thread work is done
waiter2: waiter thread: Processing the Message now.
waiter2: waiter thread: Processed message: New Message from Waiter
waiter1: waiter thread got notified at time: 2006
waiter1: waiter thread: Processing the Message now.
waiter1: waiter thread: Processed message: New Message from Waiter
All threads are dead, exiting main thread::: 2006: main
*/

