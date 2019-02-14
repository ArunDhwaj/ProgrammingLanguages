/*
@author: Arun Dhwaj
@date: 8th Feb, 2019
@purpose: CompletableFutures were introduced in Java 8 (2014). They are in fact an evolution of regular Futures, inspired by Google's Listenable Futures, part of the Guava library. They are Futures that also allow you to string tasks together in a chain. You can use them to tell some worker thread to "go do some task X, and when you're done, go do this other thing using the result of X"

Futures were introduced in Java 5 (2004). They're basically placeholders for a result that hasn't happened yet. They promise to hold the result of some operation once that operation completes. The operation can be a Runnable or Callable instance that is submitted to an ExecutorService. The submitter of the operation can use the Future object to check whether the operation isDone(), or wait for it to finish using get().
*/


import MyThreadLib.*;
import java.util.concurrent.*;

public class CompletableFuturesDriver
{
    public static void main( String[] args) throws Exception
    {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        
        CompletableFuture<Integer> f = CompletableFuture.supplyAsync(new MySupplier(), exec);
        
        System.out.println(f.isDone()); // False
        
        CompletableFuture<Integer> f2 = f.thenApply(new PlusOne());
       
        System.out.println(f2.get());
        
        /*
        try
        {
            // Waits until the "calculation" is done, then prints 2
            System.out.println(f2.get());
        }
        catch()
        }
        finally
        {
            exec.shutdown();
            return;
        }
        */
    }
}

/*
/////////////////////////Output: Without thread Safety /////////////////////
Run-1:
Processing count= 10
*/
