/*
@author: Arun Dhwaj
@date: 9th Feb, 2019
@purpose:
Thread safety in java is the process to make our program safe to use in multithreaded environment, there are different ways through which we can make our program thread safe.
Synchronization is the easiest and most widely used tool for thread safety in java.
Use of Atomic Wrapper classes from java.util.concurrent.atomic package. For example AtomicInteger
Use of locks from java.util.concurrent.locks package.
Using thread safe collection classes, check this post for usage of ConcurrentHashMap for thread safety.
Using volatile keyword with variables to make every thread read the data from memory, not read from thread cache.
*/

import MyThreadLib.*;
import java.util.Arrays;

public class ThreadSynchronizedDriver
{
    public static void main( String[] args) throws InterruptedException
    {
        long start =  System.currentTimeMillis();
        WorkerThread.start = start;
     
        /////////////////////////////////////////
        String[] arr = {"1","2","3","4","5","6"};
      
        HashMapProcessor hmp = new HashMapProcessor(arr);

        Thread hmp1 = new Thread(hmp, "t1");
        hmp1.start();

        Thread hmp2 = new Thread(hmp, "t2");
        hmp2.start();
        
        Thread hmp3 = new Thread(hmp, "t3");
        hmp3.start();
        
        hmp1.join();
        hmp2.join();
        hmp3.join();
       
        System.out.println("Time taken= "+(System.currentTimeMillis()-start));
       
        //check the shared variable value now
        System.out.println(Arrays.asList(hmp.getMap())); 
    }
}

/*
/////////////////////////Output: Without thread Safety /////////////////////
Run-1:
Time taken= 15030
[1:t2, 2:t3:t3, 3:t3:t3, 4:t3:t3, 5:t3:t3, 6:t3]

Run-2:
Time taken= 15011
[1:t2:t3, 2:t3:t3, 3:t3:t3, 4:t3:t3:t3, 5:t3:t3:t3, 6:t3]

Run-3:
Time taken= 15024
[1:t1:t3, 2:t3:t3, 3:t3, 4:t3:t3, 5:t3:t3:t3, 6:t3:t3]

Run-4:
Time taken= 15019
[1:t1:t2:t3, 2:t3:t3, 3:t3:t3:t3, 4:t3, 5:t3:t3, 6:t3:t3]


/////////////////////////Output: With thread Safety /////////////////////
Run-5:
Time taken= 15024
[1:t1:t2:t3, 2:t3:t3:t3, 3:t3:t3:t3, 4:t3:t3:t3, 5:t3:t3:t3, 6:t3:t3:t3]

Run-6:
Time taken= 15011
[1:t1:t2:t3, 2:t3:t3:t3, 3:t3:t3:t3, 4:t3:t3:t3, 5:t3:t3:t3, 6:t3:t3:t3]

Run-7:
Time taken= 15022
[1:t2:t3:t3, 2:t3:t3:t3, 3:t3:t3:t3, 4:t3:t3:t3, 5:t3:t3:t3, 6:t3:t3:t3]

Output: With thread Safety /////////////////////
*/
