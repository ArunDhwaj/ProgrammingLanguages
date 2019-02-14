
/**
@file: SocketAdapter.java
@author: Arun Dhwaj
@date: 10th Jul, 2018
@purpose: Implementing "SocketAdapter" class in Adapter Design Pattern in Java
*/

package adapterLib;

import adapterLib.Volt;


public interface SocketAdapter 
{
    public Volt get120Volt();
   
    public Volt get12Volt();
    
    public Volt get3Volt();

}
