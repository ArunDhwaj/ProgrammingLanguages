/*
@author: Arun Dhwaj
@date: 8th Feb, 2019
@purpose: Futures were introduced in Java 5 (2004). They're basically placeholders for a result that hasn't happened yet. They promise to hold the result of some operation once that operation completes. The operation can be a Runnable or Callable instance that is submitted to an ExecutorService. The submitter of the operation can use the Future object to check whether the operation isDone(), or wait for it to finish using get().
*/

import MyThreadLib.*;
import java.util.concurrent.*;

public class FutureDriver
{
    public static void main( String[] args) throws InterruptedException
    {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        Future<Integer> f = exec.submit(new MyCallable());

        System.out.println(f.isDone()); //False

        try
        {
            System.out.println(f.get()); //Waits until the task is done, then prints 1
        }
        catch (ExecutionException e) 
        {
            //Do nothing
        }

        finally
        {
            exec.shutdown();
            return;
        }
    }
}

/*
/////////////////////////Output: Without thread Safety /////////////////////
Run-1:
Processing count= 10
*/
