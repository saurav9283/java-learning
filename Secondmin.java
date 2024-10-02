import java.util.*;

public class Secondmin{

    public static void second(int[] arr , int n)
    {
        int first  = Integer.MAX_VALUE;
        int second  = Integer.MAX_VALUE;

        for(int i = 0;i < n; i++)
        {
            if(arr[i] < first)
            {
                second = first;
                first = arr[i];
            }
            else if (arr[i] < second && arr[i] != first){

                second = arr[i];
            }
        }

        if(second == Integer.MAX_VALUE)
        {
            System.out.println("No second elemet");
        }
        System.out.println("Second element is " + second);
    }
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i]  =sc.nextInt();
        }

        second(arr, n);
    }
}