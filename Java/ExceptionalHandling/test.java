/*
@file: ExceptionalHandling.java
@author: Arun Dhwaj,
@date: 26th Aug, 2018
@purpose: Exceptional handling in Java.
@syntax: A try block must be followed either by catch or finally or both. 
*/

import java.io.*;

public class test
{
    public static void main(String[] args)
    {
        add(5);
    }

    private static void add(int a)
    {
        loop: for(int i=1; i<3; i++){
                for(int j=1; j<3;j++){
                    if(a==5){
                        break loop;
                    }
                    System.out.println(i*j);
                }
        }
    }
}

