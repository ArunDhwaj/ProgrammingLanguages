/*
@author: Arun Dhwaj
@date: 8th Feb, 2019
@purpose:
Thread safety in java is the process to make our program safe to use in multithreaded environment, there are different ways through which we can make our program thread safe.
Synchronization is the easiest and most widely used tool for thread safety in java.
Use of Atomic Wrapper classes from java.util.concurrent.atomic package. For example AtomicInteger
Use of locks from java.util.concurrent.locks package.
Using thread safe collection classes, check this post for usage of ConcurrentHashMap for thread safety.
Using volatile keyword with variables to make every thread read the data from memory, not read from thread cache.
*/

import MyThreadLib.*;

public class ThreadSafetyDriver
{
    public static void main( String[] args) throws InterruptedException
    {
        long start =  System.currentTimeMillis();
        WorkerThread.start = start;
      
        WorkerThread wt = new WorkerThread();

        Thread wt1 = new Thread(wt, "Worker1");
        wt1.start();

        Thread wt2 = new Thread(wt, "Worker2");
        wt2.start();
        
        wt1.join();
        wt2.join();
        
        System.out.println("Processing count= "+wt.getCount());        
    }
}

/*
/////////////////////////Output: Without thread Safety /////////////////////
Run-1:
Processing count= 10

Run-2:
Processing count= 8

Run-3:
Processing count= 7

Run-4:
Processing count= 9

Run-5:
Processing count= 9

Run-6:
Processing count= 8

/////////////////////////Output: With thread Safety /////////////////////
Run-7:
ssing count= 10

Run-8:
Processing count= 10

Run-9:
Processing count= 10

Run-10:
Processing count= 10

Run-11:
Processing count= 10

Run-12:
Processing count= 10

Output: With thread Safety /////////////////////

*/
