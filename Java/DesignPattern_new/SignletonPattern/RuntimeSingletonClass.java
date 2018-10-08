/**
@file: RuntimeSingletonClass.java
@author: Arun Dhwaj
@date: 28th Sept, 2018
@purpose: Use of the Runtime Singleton class provided by Java Package.
*/

import java.io.*;
import java.util.*;

public class RuntimeSingletonClass
{
    public static void main(String[] args )
    {
        //Runtime is a Singleton class provided by Java Library
        
        Runtime rt1 = Runtime.getRuntime();
        System.out.println(rt1);
        
        int cores = rt1.availableProcessors();        
        System.out.println(cores);
        
        Runtime rt2 = Runtime.getRuntime();
        System.out.println(rt2);

        if(rt1 == rt2)
        {
            System.out.println("They are the same instance");
        }
    }
   
}
