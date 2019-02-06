
public class TestFrac 
{
    public static void main(String[] args) 
    {
        Frac f1 = new Frac(3, 4);
        Frac f2 = new Frac(2, 3);
        Frac f3 = new Frac(1, 2);
        Frac f4 = Frac.max(f1, Frac.max(f2, f3));
    }
}

public class Frac 
{
    private int numer, denom;
    private static int numCreated;
    
    public Frac(int n, int d)
    { 
        numer = n; 
        denom = d; 
        numCreated++; 
    }
    
    public static Frac max(Frac a, Frac b) 
    {
        int aSize = a.numer*b.denom;
        int bSize = b.numer*a.denom;
        
        if (aSize > bSize) return a;
        else return b;
    }
    
    public Frac mult(Frac f) 
    {
        return new Frac( this.numer * f.numer, this.denom * f.denom); 
    }
        
    public String toString()
    { 
        return numer + "/" + denom; 
    }
}
