/*
@author: Arun Dhwaj
@date: 10th Feb, 2019
@purpose: A supplier that sleeps for a second, then returns 1  
*/ 

package MyThreadLib;

import java.util.concurrent.*;
 
public static class MySupplier implements Supplier<Integer> 
{
    @Override
    public Integer get() 
    {
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e) 
        {
            //Do nothing
        }
        return 1;
    }
}

