
/**
@file: Volt.java
@author: Arun Dhwaj
@date: 10th Jul, 2018
@purpose: Implementing Adapter Design Pattern in Java
*/

package adapterLib;

public class Volt
{
    private int volts;

    public Volt(int volts)
    {
        this.volts = volts;
    }
    
    public int getVolts()
    {
        return this.volts;
    }

    public void setVolts(int volts)
    {
        this.volts = volts;
    }

}

 
