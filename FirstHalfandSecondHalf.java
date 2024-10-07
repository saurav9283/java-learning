public class FirstHalfandSecondHalf{
    public static void operation(int arr[] , int size)
    {
        int temp;
        for(int i = 0; i < size-1; i++)
        {
            for(int j = 0; j < size/2; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

            for(int j = size/2; j < size-1; j++)
            {
                if(arr[j] < arr[j+1])
                {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i = 0; i < size; i++)
        {
            System.out.println("New Array is " + arr[i]);
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6};
        int size = arr.length;

        operation(arr,size);
    }
}