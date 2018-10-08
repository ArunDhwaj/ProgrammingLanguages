package Main;

public class AdapterPatternDemo 
{
	public static void main(String[] args)
	{

		System.out.println("***Adapter Pattern Demo***");
	
		CalculatorAdapter cal = new CalculatorAdapter();
		Triangle t = new Triangle(30, 20);
	
		System.out.println("\nAdapter Pattern Example\n");
		System.out.println("Area of Triangle is :" + cal.getArea(t));
		
	}
}
