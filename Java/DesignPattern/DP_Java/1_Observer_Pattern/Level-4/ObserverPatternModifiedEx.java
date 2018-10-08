import java.util.*;

import Observer.*;

//import Observer.IObserver;
//import Observer.Observer2;
//import Observer.Observer3;
//import Observer.Observer4;
//import 1_Observer_Pattern.Subject;

class ObserverPatternModifiedEx
{
	public static void main(String[] args)
	{
		System.out.println("*** Modified Observer Pattern Demo ***\n");
		
		Subject1 sub1 = new Subject1();
		Subject2 sub2 = new Subject2();

		Observer1 o1 = new Observer1();
		Observer2 o2 = new Observer2();
		Observer3 o3 = new Observer3();
		Observer4 o4 = new Observer4();

		sub1.register(o1);
		sub1.register(o2);

		System.out.println("Setting myValue = 5 ");
		sub1.setMyValue(5);

		System.out.println("Setting myValue = 25 ");
		sub1.setMyValue(25);

		System.out.println("Unregistering Observer o1 \n");
		sub1.unregister(o1);

		//No notification this time to o1 .Since it is unregistered.
		System.out.println(" Now only  Observer2 will observe the changes, as Observer1 has removed himself \n");
		System.out.println("Setting myValue = 250 ");
		sub1.setMyValue(250);
		
		sub2.register(o3);
		sub2.register(o4);

		System.out.println("Setting myValue = 505 ");
		sub2.setMyValue(505);

		System.out.println("Setting myValue = 5025 ");
		sub2.setMyValue(5025);

		System.out.println("Unregistering Observer o3 \n");
		sub2.unregister(o3);

		//No notification this time to o3 .Since it is unregistered.
		System.out.println(" Now only  Observer4 will observe the changes, as Observer3 has removed himself \n");
		System.out.println("Setting myValue = 50250 ");
		sub2.setMyValue(50250);
	}
}

