
/*
@author: Arun Dhwaj
@date: 15th Feb, 2019
@purpose: 
We can use Arrays class to get the view of array as list. However we won’t be able to do any structural modification to the list, it will throw 
java.lang.UnsupportedOperationException. So the best way is to use for loop for creating list by iterating over the array. Below is a simple example showing how to convert 
java array to list properly. 
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListDriver
{
    public static void main(String[] args) 
    {
        String[] vowels = {"a","e","i","o","u"};

        List<String> vowelsList = Arrays.asList(vowels);
        System.out.println(vowelsList);

        /**
        * Concept-1: Following will give Runtime error: java.lang.UnsupportedOperationException 
        * List is backed by array, we can't do structural modification
        * Both of the below statements will throw java.lang.UnsupportedOperationException
        */

        //vowelsList.remove("e");
        //vowelsList.clear();

        //using for loop to copy elements from array to list, safe for modification of list
        List<String> myList = new ArrayList<>();
        
        for(String s : vowels)
        {
            myList.add(s);
        }
    
        System.out.println(myList);
        myList.clear();
        System.out.println(myList);
    }

}
