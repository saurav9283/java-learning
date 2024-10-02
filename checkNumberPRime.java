import java.util.*;
public class checkNumberPRime{

    public static boolean isPrime(int num1)
    {
        if(num1 <= 1)
        {
            return false;
        }
        for(int i = 2; i < num1; i++)
        {
            if(num1 % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] a)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check it is prime or not");
        int num1 = sc.nextInt();

        if(isPrime(num1))
        {
            System.out.println("this number a prime number");
        }
        else{
            System.out.println("This is not a prime number");
        }
    }
}