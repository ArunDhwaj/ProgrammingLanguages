package ProxyPatternDemo;

import ProxyClasses.*;

public class ProxyPatternDemo 
{
	public static void main(String[] args)
	{
		System.out.println("*** ProxyPatternDemo ***\n");
		
		Proxy px = new Proxy();
		px.doSomeWork();
	}	
}
