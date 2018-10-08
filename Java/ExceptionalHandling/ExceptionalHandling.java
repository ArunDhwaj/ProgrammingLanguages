/*
@file: ExceptionalHandling.java
@author: Arun Dhwaj,
@date: 26th Aug, 2018
@purpose: Exceptional handling in Java.
@syntax: A try block must be followed either by catch or finally or both. 
*/

import java.io.*;

public class ExceptionalHandling
{
    public static void main(String[] args)
    {
        BufferedReader reader = null;
        int total = 0;

        try 
        {
            reader = new BufferedReader(new FileReader("input.txt"));

            String line = null;

            while( (line = reader.readLine()) != null )
            {
                total += Integer.valueOf(line);
            }

            System.out.println("Total: " + total);
        }
        catch( NumberFormatException e)
        {
            System.out.println("Error: Invalid value: " + e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        finally
        {
            try
            {
                //reader.close();
                
                if(reader != null)
                {
                    reader.close();
                }
            }
            catch( Exception e)
            {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

