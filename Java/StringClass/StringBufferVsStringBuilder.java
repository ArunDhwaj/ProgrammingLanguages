/*
@file: StringBufferVsStringBuilder.java 
@author: Arun Dhwaj
@date: 27th Aug, 2018
@purpose: StringBuffer Vs. StringBuilder.
*/

public class StringBufferVsStringBuilder
{  
    public static void main(String[] args)
    {  
        long startTime = System.currentTimeMillis();  
        StringBuffer sb = new StringBuffer("Java");  
        
        for (int i=0; i<10000000; i++)
        {  
            sb.append("Tpoint");  
        }  
        
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
        startTime = System.currentTimeMillis();  
        
        StringBuilder sb2 = new StringBuilder("Java");  
        for (int i = 0; i < 10000000; i++)
        {  
            sb2.append("Tpoint");  
        }  
       
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
    }  
}  
