/*
@Author: Arun Dhwaj
@Date: 17th Jan, 2018
@Purpose: POC for Java Stream API in Java 8
*/

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
 

public class StreamAPIDriver
{
    public static void main( String[] args )
    {
        List<Integer> myList = new ArrayList<>();
        
        for(int i=0; i<101; i++)
        {
            myList.add(i);
        }

        //Using the Stream: SequentialStream API
        Stream<Integer> seqList = myList.stream(); 
       
        //Using the Stream: ParallelStream API
        Stream<Integer> pList = myList.parallelStream(); 

        //Using lambda with Stream API, filter example
        Stream<Integer> highNums = pList.filter(p -> p > 90);
        //Stream<Integer> highNums = pList.filter(p -> p > 90).forEach(p-> System.out.println("Parallel Steam API: High Nums: "+p));
        //Stream<Integer> highNums = pList.filter(p -> { if(p > 90) System.out.println("Parallel Steam API: High Nums: "+p);});
             
       //Using lambda in forEach
       highNums.forEach(p -> System.out.println("Parallel Steam API: High Nums: "+p));
             
    }
}
/*
////////////////////////////////////////////////////////////////////////////////
//// Program Output ////////////////////////////////////////////////////////////
Parallel Steam API: High Nums: 94
Parallel Steam API: High Nums: 95
Parallel Steam API: High Nums: 96
Parallel Steam API: High Nums: 97
Parallel Steam API: High Nums: 98
Parallel Steam API: High Nums: 99
Parallel Steam API: High Nums: 100
Parallel Steam API: High Nums: 91
Parallel Steam API: High Nums: 92
Parallel Steam API: High Nums: 93
*/

