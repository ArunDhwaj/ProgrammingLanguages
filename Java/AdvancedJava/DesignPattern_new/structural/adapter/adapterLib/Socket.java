
/**
@file: Socket.java
@author: Arun Dhwaj
@date: 10th Jul, 2018
@purpose: Implementing of Scoket class for Adapter Design Pattern
*/

package adapterLib;

import adapterLib.Volt; 

public class Socket
{
    public Volt getVolt()
    {
        return new Volt(120);
    }
}
