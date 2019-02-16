
/*
@author: Arun Dhwaj
@date: 15th Feb, 2019
@purpose: Showing the correct way to convert a list to array.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArrayDriver
{
    public static void main(String[] args) 
    {
        List<String> letters = new ArrayList<String>();
        
        letters.add("A");
        letters.add("B");
        letters.add("C");

        System.out.println(letters);
        
        //Converting list to array
        String[] strArr = new String[letters.size()]; 
        strArr = letters.toArray(strArr);
        
        System.out.println(Arrays.toString(strArr));
    }
}
