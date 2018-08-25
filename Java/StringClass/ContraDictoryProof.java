/*
@file: ContraDictoryProof.java
@author: Arun Dhwaj
@date: 25th Aug, 2018,
@purpose: Contradictory general proof about different references of two strings which values are same.
*/

public class ContraDictoryProof
{
    public static void main(String[] args)
    {
        /*
         Contradictory proof: Proved that s1 and s2 have different reference still their vallues are same.
         
         Proof: 
         Step-1: Assume s1 and s2 have same reference. It means they pointing to the same memory location, say addrStr;
        
         Step-2: Change the s1 with concatenating "I";
         s1 += " SBP";
             
        Step-3: Check the value of s2.
        if s2.equals(s1)
        Then both are pointing to same location.
        Else Step-1 assumption is incorrect. And so both are pointing to the different location.
        
        */   
        
        
        String s1 = "I Love";
        s1 += " Java";

        String s2 = "I";
        s2 += " Love Java";

        if(s1==s2)
        {
            System.out.println("s1 and s2 have same references");
        }
        else
        {
            System.out.println("s1 and s2 have different references");

        }
        
        if(s1.equals(s2))
        {
            System.out.println("s1 and s2 have same values");
        }
        else
        {
            System.out.println("s1 and s2 have different values");

        }
    }
}
