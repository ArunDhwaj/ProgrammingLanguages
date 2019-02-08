/*
@author: Arun Dhwaj
@date: 6th Feb, 2019
@purpose: POC: Exploring Thread Sleep
*/

//import ThreadSleepLib.*;

public class ThreadSleepDriver
{
    public static void main( String[] args) throws InterruptedException
    {
        long start = System.currentTimeMillis();

        Thread.sleep(3000);

        System.out.println("Sleep time in ms = "+(System.currentTimeMillis()-start));
    }
}
