/**
@file:
@author: Arun Dhwaj
@purpose: Java Implementation of the Adpter design pattern
@description: Adapter design pattern is one of the structural design pattern and its used so that two unrelated interfaces can work together. 
The object that joins these unrelated interface is called an Adapter.
*/

import adapterLib.*;

public class adapterDriver
{
    public static void main( String[] args)
    {
        testClassAdapter();
        testObjectAdapter();
    }

    private static void testClassAdapter()
    {
        SocketAdapter sockAdapter = new SocketAdapterClassImpl();
       
        Volt v3 = getVolt(sockAdapter,3);
        Volt v12 = getVolt(sockAdapter,12);
        Volt v120 = getVolt(sockAdapter,120);
       
        System.out.println("v3 volts using Class Adapter="+v3.getVolts());
        System.out.println("v12 volts using Class Adapter="+v12.getVolts());
        System.out.println("v120 volts using Class Adapter="+v120.getVolts());
    }

    private static void testObjectAdapter()
    {
        SocketAdapter sockAdapter = new SocketAdapterObjectImpl();
        
        Volt v3 = getVolt(sockAdapter,3);
        Volt v12 = getVolt(sockAdapter,12);
        Volt v120 = getVolt(sockAdapter,120);
        
        System.out.println("v3 volts using Object Adapter="+v3.getVolts());
        System.out.println("v12 volts using Object Adapter="+v12.getVolts());
        System.out.println("v120 volts using Object Adapter="+v120.getVolts());

    }
    
    private static Volt getVolt(SocketAdapter socketAdapter, int i)
    {
        switch(i)
        {
            case 3:
                return socketAdapter.get3Volt();
                //break;

            case 12:
                return socketAdapter.get12Volt();
                //break;

            case 120:
                return socketAdapter.get120Volt();
                //break;

            default:
                return socketAdapter.get120Volt();
        }
    }
}
