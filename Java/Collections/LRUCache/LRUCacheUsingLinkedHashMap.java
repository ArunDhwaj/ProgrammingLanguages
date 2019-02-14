/*
@author: Arun Dhwaj
@date: 14th Feb, 2019
@purpose:

I) About Cache
================ 
Caching is often leveraged to maintain the data in form of key-value pair in main memory. This results into better performance in comparison to other options such 
as database storage and file storage. However since main memory is always limited, we need to define the eviction policy to ensure that cache does not grow beyond a certain 
size.

There are different caching algorithms based on the eviction policies that they offer. Some of these caching algorithms are LRU (Least Recently Used), LFU (Least Frequently 
Used) and MRU (Most Recently Used). In this tutorial, we will be focusing on LRU cache and see how we can implement it using LinkedHashMap class in Java.

II) Characteristics of LRU Cache
=================================

Here are the characteristics of LRU cache that distinguishes it from other types of caches -

i) Maintains fixed number of elements.
ii) Orders the elements based on their usage pattern. Most recently used element always remains on head while least recently used element is stored at tail end.
iii) Removes the element that was least recently used when cache gets full or crosses a threshold ratio (called load factor).
iv) Updates the element's value if element to be inserted already exists.

III) LRU Cache Implementation in Java
=========================================

We will be extending LinkedHashMap class provided by Java to implement our LRUCache. LinkedHashMap can order the elements in Insertion order as well as Access order. 
By default, LinkedHashMap maintains the data in Insertion order. However in this case, we will be configuring LinkedHashMap to maintain the data in Access order by setting 
the accessOrder flag to true in its three argument copy constructor.

Additionally, we will override method removeEldestEntry that LinkedHashMap calls after every put method call to check whether it should remove the eldest element. In our 
implementation, we will return true when size becomes greater than the capacity to let LinkedHashMap remove the least recently accessed element.

*/


import java.util.LinkedHashMap;

public class LRUCacheUsingLinkedHashMap<K, V> extends LinkedHashMap<K, V> 
{
    private static final long serialVersionUID = 1L;

    private final int capacity;

    @Override
    protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) 
    {
        //Remove the eldest element whenever size of cache exceeds the capacity
        return (size() > this.capacity);
    }

    public LRUCacheUsingLinkedHashMap(int capacity) 
    {
        // Call constructor of LinkedHashMap with accessOrder set to true to
        // achieve LRU Cache behavior
        super(capacity + 1, 1.0f, true);
        this.capacity = capacity;
    }

    /**
    * Returns the value corresponding to input key from Cache Map.
    * 
    * @param key
    *            Key for the element whose value needs to be returned
    * @return Value of the element with input key or null if no such element
    *         exists
    */
    public V find(K key) 
    {
        return super.get(key);
    }

    /**
    * Set the element with input key and value in the cache. If the element
    * already exits, it updates its value.
    * 
    * @param key
    *            Key of the element
    * @param value
    *            Value of the element
    */
    public void set(K key, V value) 
    {
        super.put(key, value);
    }

    /**
    * Entry point for testing LRU Cache.
    */
    public static void main(String[] args) 
    {
        // Create the cache with capacity 3
        LRUCacheUsingLinkedHashMap<String, Integer> cache = new LRUCacheUsingLinkedHashMap<>(3);
       
        System.out.println("Will add an element with key as k1 and value 1");
        cache.set("k1", 1);

        System.out.println("Will add an element with key as k2 and value 2");
        cache.set("k2", 2);
        
        System.out.println("Print the cache: ");
        System.out.println(cache);
        
        System.out.println("Will add an element with key as k3 and value 3");
        cache.set("k3", 3);
        
        System.out.println("Print the cache: ");
        System.out.println(cache);
        
        System.out.println("Will add an element with key as k4 and value 4. It also removes the oldest accessed element k1.");
        cache.set("k4", 4);
        
        System.out.println("Print the cache: ");
        System.out.println(cache);
        
        System.out.println("Will read an element with key as k2.");
        System.out.println("Print the value of k2: " + cache.find("k2"));

        System.out.println("Print the cache: ");
        System.out.println(cache);
    }
}

/*
///////////// Output //////////////////////////////

Will add an element with key as k1 and value 1
Will add an element with key as k2 and value 2
Print the cache: 
{k1=1, k2=2}
Will add an element with key as k3 and value 3
Print the cache: 
{k1=1, k2=2, k3=3}
Will add an element with key as k4 and value 4. It also removes the oldest accessed element k1.
Print the cache: 
{k2=2, k3=3, k4=4}
Will read an element with key as k2.
Print the value of k2: 2
Print the cache: 
{k3=3, k4=4, k2=2}

////////////////////////////////////////////////////
*/
