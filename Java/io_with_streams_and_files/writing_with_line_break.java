
/**
@author: Arun Dhwaj
@date: 30th Aug' 2018
@purpose: writing_with_line_break
*/

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class writing_with_line_break
{
    public static void main( String[] args)
    {
        int N_CPUS = Runtime.getRuntime().availableProcessors();

        System.out.println("Number of CPU: " + N_CPUS);
        
        String[] data = {
            "Line 1",
            "Line 2 2",
            "Line 3 3 3",
            "Line 4 4 4 4",
            "Line 5 5 5 5"
        };
        
        /*
        try
        {
            writeData(data);
        }
        catch( IOException e)
        {
            System.out.println(e.getMessage());
        }
        */

        System.out.println("Reading data from file: ");
        
        try
        {
            readData();
        }
        catch( IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    /*
    private static void writeData( String[] data ) throws IOException
    {
        try( BufferedWriter bw = new BufferedWriter(new FileWriter( "data.txt" )))
        {
            for( String d: data )
            {
                bw.write(d);
                bw.newLine();
            }
        }

    }
    */

    private static void readData( ) throws IOException
    {
        /*
        try( BufferedReader br = Files.newBufferedReader(Paths.get("data.txt")))
        {
            
            String str;
            while((str = br.readLine())!=null)
            {
                System.out.println(str);
            }
        }
        */

        //ReadAllLines()
        List<String> lines = Files.readAllLines(Paths.get("data.txt"));

        for(String line: lines)
        {
           System.out.println(line);
        }
    }
}
