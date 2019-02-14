/*
@author: Arun Dhwaj
@date: 9th Feb, 2019
@purpose: A task that sleeps for a second, then returns 1  
*/ 

package MyThreadLib;

import java.util.concurrent.*;
 
public class MyCallable implements Callable<Integer> 
{
    @Override
    public Integer call() throws Exception 
    {
        Thread.sleep(1000);
        return 1;
    }
}

