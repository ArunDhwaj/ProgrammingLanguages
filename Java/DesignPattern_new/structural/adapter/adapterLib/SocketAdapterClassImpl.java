
/**
@file: SocketAdapterClassImpl.java
@author: Arun Dhwaj
@date: 10th Jul, 2018
@purpose: Implementing "SocketAdapterClassImpl" class in Adapter Design Pattern in Java
*/

package adapterLib;

import adapterLib.Volt;
import adapterLib.Socket;
import adapterLib.SocketAdapter;

public class SocketAdapterClassImpl extends Socket implements SocketAdapter
{
    @Override
    public Volt get120Volt()
    {
        return getVolt();
    }
    
    @Override
    public Volt get12Volt()
    {
        Volt v = getVolt();
        return convert(v, 10);
    }
    
    @Override
    public Volt get3Volt()
    {
        Volt v = getVolt();
        return convert(v, 40);
    }

    private Volt convert(Volt v, int i)
    {
        return new Volt( v.getVolts()/i );
    }

}
