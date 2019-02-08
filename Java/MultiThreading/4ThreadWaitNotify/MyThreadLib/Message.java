/*
@author: Arun Dhwaj
@date: 8th Feb, 2019
@purpose: A java bean class on which threads will work and call wait and notify methods.  
*/ 
package MyThreadLib;
 
public class Message
{
    private String msg; 

    public Message(String str)
    {
        this.msg=str;
    }

    public String getMsg() 
    {
        return msg;
    }

    public void setMsg(String str) 
    {
        this.msg=str;
    }
}

