import java.util.*;

public class FactorialR {

    public static long fact(long num1)
    {
        if(num1 == 0 || num1 ==1)
        {
            return 1;
        }
        return num1* fact(num1-1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to findd factorial");
        int num1 = sc.nextInt();
        System.out.println("Factorial of  " + num1 + " is "+ fact(num1));
        
    }
}