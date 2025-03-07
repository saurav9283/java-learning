package Sorting;
// BubbleSort
public class BubbleSort{
    public static void main(String[] args)
    {
        int arr[] = {34,54,243,453,234,45};
        int length = arr.length;

        for(int i = 0; i < length; i++)
        {
            for(int j = 1; j < length-i; j++)
            {
                if(arr[j-1] > arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        for(int i = 0; i < length; i++)
        {
        System.out.println(arr[i]);
        }
    }
}