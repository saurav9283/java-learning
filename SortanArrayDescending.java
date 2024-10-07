import java.util.*;

public class SortanArrayDescending{
    public static void main(String[] args)
    {
        Integer[] arr = {1,2,3,4,5,6,7};
        int size = arr.length;

        System.out.println("Array: " + Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Descending Sorted Array: " + Arrays.toString(arr));

    }
}