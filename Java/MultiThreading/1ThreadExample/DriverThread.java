/*
@author: Arun Dhwaj
@date: 5th Feb, 2019
@purpose: Driver class for using Thread
*/

//package MyThreadLib;

import MyThreadLib.*;
  
public class DriverThread
{
    public static void main( String[] args )
    {
        //MyThreadRunnable Uses
       
        Thread mtr1 = new Thread(new MyThreadRunnable(), "MyThreadRunnable-1");
        mtr1.start(); 
        
        //System().sleep(1000);
        //Thread.sleep(1000);
         
        Thread mtr2 = new Thread(new MyThreadRunnable(), "MyThreadRunnable-2");
        mtr2.start(); 
    }
}
