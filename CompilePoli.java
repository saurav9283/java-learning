class Poli{
    public void fun(int a)
    {
        System.out.println("Value is " + a);
    }
    public void fun(int a, int b)
    {
        System.out.println("Value is " + a + b);
    }
    public void fun(double a)
    {
        System.out.println("Value is " + a);
    }
}

public class CompilePoli {
    public static void main(String[] args)
    {
        Poli obj = new Poli();
        obj.fun(10);
        obj.fun(1,2);
        obj.fun(333.33);
    }
    
}
