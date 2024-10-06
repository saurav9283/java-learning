public class SelectionSort{

    public static void sort(int arr[] , int size)
    {
        for(int i = 0; i < size-1; i++)
        {
            int min_index = i;
            for(int j = i+1; j < size; j++)
            {
                if(arr[i] > arr[j])
                {
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int arr[] , int n)
    {
        for(int i = 0; i < n; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args)
    {
        int arr[]= {5,3,4,2,6};
        int length = arr.length;
        sort(arr , length);
        printArray(arr , length);

    }
}