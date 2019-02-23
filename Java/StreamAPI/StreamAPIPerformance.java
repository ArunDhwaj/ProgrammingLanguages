/*
@Author: Arun Dhwaj
@Date: 17th Feb, 2018
@Purpose: Java8 Streams was a very big addition to the Java programming language which was introduced to achieve the best performance. 
In the last few years, the programming has been changed drastically per the way hardware evolved, where parallel processing, real-time, cloud, and several other approaches 
have been introduced to achieve higher performance.
    In Java8 Streams, performance is achieved by parallelism, laziness, and using short-circuit operations, but there is a downside as well, and we need to be very cautious 
while choosing Streams, as it may degrade the performance of your application.
    
*/

import java.util.ArrayList;
import java.util.List;

public class StreamAPIPerformance 
{
    static List < Integer > myList = new ArrayList < > ();
   
    public static void main(String[] args) 
    {
        for (int i = 0; i < 5000000; i++)
            myList.add(i);
        
        int result = 0;
        long loopStartTime = System.currentTimeMillis();
        
        for (int i: myList) 
        {
            if (i % 2 == 0)
                result += i;
        }

        long loopEndTime = System.currentTimeMillis();

        System.out.println(result);
        System.out.println("1: Loop total Time = " + (loopEndTime - loopStartTime));

        long streamStartTime = System.currentTimeMillis();
        System.out.println(myList.stream().filter(value -> value % 2 == 0).mapToInt(Integer::intValue).sum());
        long streamEndTime = System.currentTimeMillis();
        
        System.out.println("2: Stream total Time = " + (streamEndTime - streamStartTime));

        long parallelStreamStartTime = System.currentTimeMillis();
        System.out.println(myList.parallelStream().filter(value -> value % 2 == 0).mapToInt(Integer::intValue).sum());
        long parallelStreamEndTime = System.currentTimeMillis();

        System.out.println("3: Parallel Stream total Time = " + (parallelStreamEndTime - parallelStreamStartTime));
    }
}

/*
////////////////////////////////////////////////////////////////////////////////
//// Program Output ////////////////////////////////////////////////////////////
820084320
1: Loop total Time = 36
820084320
2: Stream total Time = 558
820084320
3: Parallel Stream total Time = 171
SmartBitPixels-MacBook-Pro:StreamAPI sbp$ java StreamAPIPerformance
820084320
1: Loop total Time = 48
820084320
2: Stream total Time = 807
820084320
3: Parallel Stream total Time = 155

As you can see, a for loop is really good in this case; hence, without proper analysis, don't replace for loop with streams.  Here we can see the good performance of 
parallel Streams over normal Streams. 

Note: Results may vary on different hardware.

*/

