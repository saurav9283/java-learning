import java.util.*;

public class sumArray{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n =  sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int sum  = 0;
        for(int i = 0; i < n; i++)
        {
            sum += arr[i];
        }

        System.out.println("Sum of array is " + sum);
    }
}