

public class InsertionSort {

    public static void inserctionSort(int[] arr , int size)
    {
        int key,j;
        for(int i = 1; i < size; i++)
        {
            key = arr[i];
            j = i-1;
            while(j >= 0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {5,2,5,1,6};
        int size = arr.length;

        inserctionSort(arr , size);

        for(int i = 0; i < size; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
