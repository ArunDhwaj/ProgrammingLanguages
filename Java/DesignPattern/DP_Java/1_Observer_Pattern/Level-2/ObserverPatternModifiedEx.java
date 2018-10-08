import java.util.*;
//import 1_Observer_Pattern.Observer;
//import 1_Observer_Pattern.Subject;

class ObserverPatternModifiedEx
{
	public static void main(String[] args)
	{
		System.out.println("*** Modified Observer Pattern Demo ***\n");
		
		Subject sub = new Subject();	
		Observer1 o1 = new Observer1();
		Observer2 o2 = new Observer2();

		sub.register(o1);
		sub.register(o2);

		System.out.println("Setting myValue = 5 ");
		sub.setMyValue(5);

		System.out.println("Setting myValue = 25 ");
		sub.setMyValue(25);

		System.out.println("Unregistering Observer o1 \n");
		sub.unregister(o1);

		//No notification this time to o1 .Since it is unregistered.
		System.out.println(" Now only  Observer2 will observe the changes, as Observer1 has removed himself \n");
		System.out.println("Setting myValue = 250 ");
		sub.setMyValue(250);
	}
}

