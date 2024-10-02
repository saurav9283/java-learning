import java.util.*;

public class factorialOfnumber{

    public static int factorial(int a)
    {
        int sum = 1;
        while(a > 1)
        {
            sum *= a;
            a--; 
        }
        return sum;
    }
    public static void main(String[] a)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find factorial");
        int num1 = sc.nextInt();

        System.out.println(factorial(num1));
    }
}