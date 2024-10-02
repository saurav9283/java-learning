import java.util.*;

public class FindMinMaxinArr{

    public static void findMinMax(int[] arr , int n)
    {
        int mini = arr[0];
        int maxi = arr[0];

        for(int i = 0; i < n; i++)
        {
            if(arr[i] < mini)
            {
                mini = arr[i];
            }
            else if(arr[i] > maxi)
            {
                maxi = arr[i];
            }
        }
        System.out.println("minimum " + mini);
        System.out.println("Maximum " + maxi);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array element");
        for(int i =0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        findMinMax(arr , n);
    }
}