//Oline test from http://www.pskills.org/randomtestaction.jsp

public class OTPskills
{
    public static void main( String[] args)
    {
        /*
        System.out.println("args.length");
        if(args.length >= 0)
        {
            System.out.println(args.length);
        }
        */
        
        /*                  
        System.out.println("Calling Logical Operator");
        test();
        */

        /*
        //Call 
        System.out.println("Calling tryCatch");
        tryCatch(); 
        */

        /*
        //Legal array declaration 
        System.out.println("Legal array declaration");
        legalArrayDec();
        */

        /*
        //Compilation test for if(integer_Value rather than bollean_value)
        System.out.println("Compilation test: of if condition");
        compilationTest();
        */
        
        //unsignedBitShift
        System.out.println("UnsignedBitShift");
        unsignedBitShift();


    }

    private static void unsignedBitShift()
    {
        int high = 2100000000;
        int low = 2000000000;
        System.out.println("mid = " + (low + high) );
        
        System.out.println("mid using >>> 1 = " + ((low + high) >>> 1));
        System.out.println("mid using / 2   = " + ((low + high) / 2));
    }

    private static void compilationTest()
    {
        /*
        Question: Test
        int f = 1;
    
        //The compiler will complain because of incompatible types, the if expects a boolean but it gets an integer.
        if(f) 
        {
            System.out.println("Odd");
        }
        */
        
        //Assuming the above declaration, which of the following statements would compile. Select the one correct answer.
        String s = new String("xyz"); 
        
        System.out.println("Before: " + s);
        s = s + s;
        System.out.println("After: " + s);
    }

    private static void legalArrayDec()
    {
       //int i[5][];
       
       int i[][]; 
       
       int []k[]; //Explanation: int [] k[];
       
       //int i[5][5]; 
       
       int[][] a;  
    }
    
    private static void test()
    {
        //int My2Age = 13/2;
        //char My2Age = 'A';
        //My2Age = 'ab';

        int My2Age = 5;
        //System.out.println(++My2Age++);  
        System.out.println(My2Age);
       
        int a = 5;
        int b = 20;
        int x = 10;

        //Single & operator
        if( x>a & x < b)
        {
            System.out.println("true");
        }
        
        //Two & operators
        if( x>a && x < b)
        {
            System.out.println("true");
        }

        //Both are same in javai
    }

    private static void tryCatch()
    {
        try 
        { 
            System.exit(0);
            return; 
        } 
        
        //System.exit();
                        
        finally 
        {
            System.out.println( "Finally" ); 
        } 
    }

}
