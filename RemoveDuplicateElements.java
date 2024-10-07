import java.util.HashSet;
import java.util.Set;

public  class RemoveDuplicateElements{

    public static void removeDupl(int arr[] , int size)
    {
        Set<Integer> set = new HashSet<>();
        for(int num : arr)
        {
            set.add(num);
        }

        System.out.println("After remove duplicate");
        for(int num : set)
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void  main(String[] args)
    {
        int arr[] = {1,2,3,3,4,5,6};
        int n = arr.length;
        System.out.println("before duplicate ");
        for(int i = 0; i <  n; i++)
        {
            System.out.println(arr[i]);
        }
        removeDupl(arr, n);
    }
}