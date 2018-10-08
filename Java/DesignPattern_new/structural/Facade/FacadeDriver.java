
/**
@file: FacadeDriver.java
@author: Arun Dhwaj
@date: 11th Sept, 2018
@purpose: A Driver class for implementing a Facade Structural Design Pattern
*/

//import facadeLib.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
//import java.io.MalformedURLException;
import java.io.IOException;


public class FacadeDriver
{
    public static void main( String[] args)
    {
        URL url = null;
        BufferedReader in = null;

        try
        {
            //url = new URL("http", "www.pluralsight.com", 80, "/author/bryan-hansen");
            url = new URL("https", "www.pluralsight.com", 443, "/author/bryan-hansen");
        }
        catch(IOException mue)
        {
            System.out.println(mue.toString());
        }
        
        try
        {
            in = new BufferedReader(new InputStreamReader(url.openStream()));
        }
        catch(IOException mue)
        {
            System.out.println(mue.toString());
        }

        
        String inputLine;
        
        try
        {
            while((inputLine = in.readLine()) != null)
            {
                System.out.println(inputLine);
            }
        }
        catch(IOException mue)
        {
            System.out.println(mue.toString());
        }
    }
}
