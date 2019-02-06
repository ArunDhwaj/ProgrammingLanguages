/*
@author: Arun Dhwaj
@date: 5th Feb, 2019
@purpose: Thread by Extending Thread Class
*/

package MyThreadLib;  

public class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
    }

    @Override
    public void run()
    {
        System.out.println("Doing heavy processing - START: "+Thread.currentThread().getName());


        try 
        {
            Thread.sleep(1000);
          
            //Get database connection, delete unused data from DB
            doDBProcessing();
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        
        System.out.println("Doing heavy processing - END: "+Thread.currentThread().getName());
    }

    private void doDBProcessing() throws InterruptedException 
    {
        Thread.sleep(5000);
    }
}
