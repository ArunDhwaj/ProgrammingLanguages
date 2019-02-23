// Java code for IntStream anyMatch 
// (Predicate predicate) to check whether 
// any element of this stream match 
// the provided predicate. 

import java.util.*; 
import java.util.stream.IntStream; 

class StreamSearch 
{ 
    // Driver code 
    public static void main(String[] args) 
    { 

        // Creating an IntStream 
        IntStream stream = IntStream.of(1, 2, 3, 4, 5, 6); 
        int k = 5;
        // Stream anyMatch(Predicate predicate) 
        boolean answer = stream.anyMatch(num ->{ (num - k) == 0}; ); 

        // Displaying the result 
        System.out.println(answer); 
    } 
} 
