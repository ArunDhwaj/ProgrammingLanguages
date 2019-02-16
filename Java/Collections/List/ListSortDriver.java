
/*
@author: Arun Dhwaj
@date: 15th Feb, 2019
@purpose: There are two ways to sort a list. We can use Collections class for natural sorting or we can use List sort() method and use our own Comparator for sorting. Below 
is a simple example for java list sorting.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Random;

public class ListSortDriver
{
    public static void main(String[] args) 
    {
        List<Integer> nums = new ArrayList<Integer>();
        
        Random rand = new Random();
        
        for( int i=0; i<10; i++)
        {
            nums.add(rand.nextInt(1000));
        }
        
        //Method-1: Collections class for natural sorting.
        //Collections.sort(nums);
        System.out.println("Natural sorting: " + nums);
        
        //Method-2: My custom sorting, incresing order.
        nums.sort((o1,o2)->{return(o1-o2);});
        System.out.println("Sorted in increasing order: " + nums);
        
        //Method-3: My custom sorting, reverse order.
        nums.sort((o1,o2)->{return(o2-o1);});
        System.out.println("Sorted in decreasing order: " + nums);
    }
}
