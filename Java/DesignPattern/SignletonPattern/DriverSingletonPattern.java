/**
@file: DriverSingletonPattern.java
@author: Arun Dhwaj
@date: 3rd Aug, 2018
@purpose: Driver function for testing Singleton pattern
**/
 
import java.io.Serializable;
import SingletonLib.SerializedSingleton;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class DriverSingletonPattern
{
    public static void main( String[] args ) throws IOException, FileNotFoundException, ClassNotFoundException
    {
        SerializedSingleton sbp_ss1 = SerializedSingleton.getInstance();
       
        ///////////////////////////////////////////////////////////////////////////////////////// 
        //Writing Serialized Singleton object and then write into a file name sbp1.ser -- Start
        
        ObjectOutput out = new ObjectOutputStream( new FileOutputStream("sbp1.ser"));
        out.writeObject(sbp_ss1);
        out.close();   
        
        //Writing Serialized Singleton object and then write into a file name sbp1.ser -- End
        /////////////////////////////////////////////////////////////////////////////////////////
        
        
        ///////////////////////////////////////////////////////////////////////////////////////// 
        // Deserialized from file to Singleton object -- Start 
        
        ObjectInput in = new ObjectInputStream(new FileInputStream( "sbp1.ser" ));
        SerializedSingleton sbp_ss2 = (SerializedSingleton) in.readObject();
        in.close(); 
                        
        // Deserialized from file to Singleton object -- End 
        ///////////////////////////////////////////////////////////////////////////////////////// 

        System.out.println("sbp_ss1 hashCode = " + sbp_ss1.hashCode());
        System.out.println("sbp_ss2 hashCode = " + sbp_ss2.hashCode());
    }
}
