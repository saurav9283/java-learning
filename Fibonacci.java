import java.util.*;

public class Fibonacci{

    public static int CalculateFab(int num1){
        int ans = 0;
        int first = 0;
        int second = 1;
        if(num1 == 0)
        {
            return first;
        }

        for(int i = 2; i <= num1; i++)
        {
            ans = first + second;
            first = second;
            second = ans;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate Fibonacci");

        int num1 = sc.nextInt();
        System.out.println("Fibonacci is " + CalculateFab(num1));
    }
}