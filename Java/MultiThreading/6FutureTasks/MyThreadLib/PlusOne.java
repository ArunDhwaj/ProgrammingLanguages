/*
@author: Arun Dhwaj
@date: 10th Feb, 2019
@purpose: A (pure) function that adds one to a given Integer 
*/ 

package MyThreadLib;

import java.util.concurrent.*;
 
public static class PlusOne implements Function<Integer, Integer> 
{
    @Override
    public Integer apply(Integer x) 
    {
        return x + 1;
    }
}

