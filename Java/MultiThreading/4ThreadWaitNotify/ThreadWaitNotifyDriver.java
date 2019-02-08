/*
@author: Arun Dhwaj
@date: 8th Feb, 2019
@purpose: Test class that will create multiple threads of Waiter and Notifier and start them.
*/

import MyThreadLib.*;

public class ThreadWaitNotifyDriver
{
    public static void main( String[] args) throws InterruptedException
    {
        long start =  System.currentTimeMillis();
        Waiter.start = start;
        Notifier.start = start;

        Message msg = new Message("process it");
       
        Waiter waiter1 = new Waiter(msg);
        //new Thread(waiter1,"waiter1").start();
        Thread wt1 = new Thread(waiter1, "waiter1");
        wt1.start();

        Waiter waiter2 = new Waiter(msg);
        //new Thread(waiter1, "waiter1").start();
        Thread wt2 = new Thread(waiter2, "waiter2");
        wt2.start();

        Notifier notifier1 = new Notifier(msg);
        //new Thread(notifier1, "notifier1").start();
        
        Thread nt1 = new Thread(notifier1, "notifier1");
        nt1.start();
        System.out.println("All the threads are started");

        //if("main".equals(Thread.currentThread().getName()))
        if( Thread.currentThread().getName().equals("main") ) 
        {
            wt1.join();
            wt2.join();
            
            System.out.println("All threads are dead, exiting main thread::: " + (System.currentTimeMillis() - start ) + ": "+ Thread.currentThread().getName());
        }
    }
}

/*
/////////////////////////Output /////////////////////

All the threads are started
waiter1: waiting to get notified at time: 32
notifier1 started at time: 32
waiter2: waiting to get notified at time: 33
notifier1  thread, now getting this message: notifier1: thread work is done
waiter2: waiter thread got notified at time: 2038
waiter2: waiter thread: Processing the Message now.
waiter2: waiter thread: Processed message: New Message from Waiter
waiter1: waiter thread got notified at time: 2039
waiter1: waiter thread: Processing the Message now.
waiter1: waiter thread: Processed message: New Message from Waiter
All threads are dead, exiting main thread::: 2040: main
*/
