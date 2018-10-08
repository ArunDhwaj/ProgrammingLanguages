/*
@file: Boxing.java
@author: Arun Dhwaj,
@date: 25th Aug, 2018
@purpose: Describing Wrapper calss boxing and unboxing property. As we know: "Boxing conversions that always return the same wrapper class instance" 
*/

public class Boxing
{
    public static void main(String[] args)
    {
        try
        {
            Integer i1000A = 10 * 10 * 10;
            
            Integer i1000B = 100 * 10;

            if(i1000A == i1000B)
            {
                System.out.println("References are same");
            }
            

            if(i1000A.equals(i1000B))
            {
                System.out.println("Values are same");
            }
        
            Integer i8A = 4 * 2;
            Integer i8B = 2 * 2 * 2;

            if(i8A == i8B)
            {
                System.out.println("References are same");
            }
        }

        finally
        {
            System.out.println("Successfully completed!!!");
        }
    }
}

