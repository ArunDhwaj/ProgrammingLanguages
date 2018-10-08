mport java.io.*;
import java.util.*;


public class TestClass 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
            
        for(int t_i=0; t_i<T; t_i++)
        {
            String s = br.readLine();

            String out_ = solve(s);
            System.out.println(out_);
         }

         wr.close();
         br.close();
    }
    
    static String solve(String s)
    {
        //Create a sorted map based on key.
        
        if(s.length() == 0)
        {
            return "";
        }

        if(s.length() == 1)
        {
            return s;
        }
        
        
        Map<String, Integer> map = new TreeMap<>();  
        
        for(int i=0; i<s.length(); i++)
        {
            if(map.containsKey(""+s.charAt(i)))
            {
                map.put(""+s.charAt(i), map.get(""+s.charAt(i))+1);
            }
            else
            {
                map.put(""+s.charAt(i), 1);            
            }
        }
        
        //Create a Treemap of unsortedMap to get it sorted
        //Map<String, Integer> sortedMap = new TreeMap<String, Integer>(map);
        
        //For creating palindrome, (excep middle, if total number chars is odd)
        //every chars should be min. even in number.
        
        //Print smallest lexicograpic palindrome
        
        StringBuilder middle = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) 
        {
            String key = entry.getKey(); 
            Integer val = entry.getValue();
            
            if( (val >= 2) && (val % 2 == 0 ) )
            {
                Integer temp = val;
                sb.append(key);
              
               /* 
                while(temp >=0 )
                {
                    sb.append(key);
                    temp = temp -2;
                }
                */
                
            }
            else if( (val > 1) && (val % 2 != 0 ) )
            {
                Integer temp = val;
                sb.append(key);
                /*
                while(temp >= 1)
                {
                    sb.append(key);
                    temp = temp -2;
                }
                */
                
                middle.append(key);
            }
            else if( (val == 1))
            {
                middle.append(key);
            }

        }
        
        StringBuilder finalStr = new StringBuilder(sb);
        
        if(middle.length() > 0)
        {
            finalStr.append(""+middle.charAt(0));
        }
        
        finalStr.append(sb.reverse());
        
        String retrunStr = new String(finalStr);
        
        return retrunStr;
    }
}
