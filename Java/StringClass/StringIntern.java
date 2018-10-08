
public class StringIntern
{  
    public static void main(String args[])
    {
        System.out.println("Exaple1 of intern()");
        example1();  
        
        System.out.println("Exaple2 of intern()");
        example2();  
    }

    private static void example1()
    {
        String s1=new String("hello");  
        String s2="hello";  
        
        //Returns string from pool, now it will be same as s2  
        String s3=s1.intern();
        
        //False because reference variables are pointing to different instance  
        System.out.println(s1==s2);
        
        //True because reference variables are pointing to same instance      
        System.out.println(s2==s3);

    }

    private static void example2()
    {
        String s1 = "Javatpoint"; // In java8, it will go into String Pool  
        
        // It will search a string which value is "value is content of s1" from pool and it will find. So, it will return the pointer of s1.  
        String s2 = s1.intern();  
        
        //It will create a new memory location from heap;
        String s3 = new String("Javatpoint");  
        
        String s4 = s3.intern();          
        
        System.out.println(s1==s2); // True  
        System.out.println(s1==s3); // False  
        System.out.println(s1==s4); // True       
        System.out.println(s2==s3); // False  
        System.out.println(s2==s4); // True        
        System.out.println(s3==s4); // False         
    }
}  
