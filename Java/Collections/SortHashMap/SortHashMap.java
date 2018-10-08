
/**
@file: SortHashMap.java
@author: Arun Dhwaj
@date: 15th Sept, 2018
@purpose: Sorting of HashMap by key and Value.
*/

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;

import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;


public class SortHashMap
{
    public static void main( String[] args)
    {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();     
        
        hmap.put(21, "Arun");
        hmap.put(2, "Dhwaj");
        hmap.put(5, "SBP");
        hmap.put(1, "Smart");
        hmap.put(18, "Bit");
        hmap.put(3, "Pixel");
        hmap.put(16, "Tech");
        hmap.put(6, "Pvt");
        
        System.out.println("Printing the HashMap before sorting");
        printMapByLambda(hmap);
        
        System.out.println("Printing the HashMap after sorting by keys");    
        printMapByLambda( sortByKey(hmap));
        
        System.out.println("Printing the HashMap after sorting by values");    
        printMapByLambda( sortByValue(hmap));
    }
    
    private static void printMapByLambda(Map<Integer, String> hmap )
    {
        hmap.forEach( (k,v) ->
        {
            System.out.println("Key:" + k + ", Value: " + v);
        });
    }

    private static Map<Integer, String> sortByKey(HashMap<Integer, String> hmap)
    {
        return new TreeMap<Integer, String>(hmap);
    }
    
    private static Map<Integer, String> sortByValue(HashMap<Integer, String> hmap)
    {
        List list = new LinkedList(hmap.entrySet());
        
        //Sorting the list

        Collections.sort(list, new Comparator()
        {
            public int compare(Object o1, Object o2) 
            {
                return ( (Comparable) ((Map.Entry)(o1)).getValue() )
                    .compareTo( ((Map.Entry)(o2)).getValue() );
            }
        });

        HashMap sortedHashMap = new LinkedHashMap();
        
        list.forEach( (item)->
        {
            Map.Entry entry = (Map.Entry)item;
            sortedHashMap.put(entry.getKey(), entry.getValue());
        });
        
        return sortedHashMap;
    }
}
 
