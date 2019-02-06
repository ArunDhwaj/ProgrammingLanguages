

public class HeapStackMemory
{

    //1:
    static int global_int = 10;
    
    //2:
    int public_int = 10;

    //3:
    private int private_int = 10;
    
    //4
    String global_name = "Arun Dhwaj 1"; 
              
    //5: main() function
    public static void main(String[] args)
    {
        //6: local_int
        int local_int = 20;

        //7: local_name
        String local_name = "Arun Dhwaj 2";
        
        //8: obj reference
        Object obj = new Object();

        //9: 
        // HeapStackMemory hsm = new HeapStackMemory();   
        
        //10
        System.out.println(global_int);
       
    }
    

    private void foo( Object param)
    {
        //11
        String str = param.toString();

        //12
        System.out.println(str);
        
        //13
        System.out.println(global_int);
        
        //14
        System.out.println(public_int);
        
        //15
        System.out.println(private_int);
    
    }
}
