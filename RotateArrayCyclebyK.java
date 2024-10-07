public class RotateArrayCyclebyK{

    public static void rotate(int arr[] , int size, int k){
        int[] temp = new int[size];
        int t=0;
        for(int i = k; i < size; i++)
        {
            temp[t] = arr[i];
            t++;
        }
        for(int i = 0;i < k ;i++)
        {
            temp[t] = arr[i];
            t++;
        }

        for(int i = 0; i < size; i++)
        {
            arr[i] =  temp[i];
        }
    }
    public static void main(String[] arggs)
    {
        int arr[] =  {1,2,3,4,5};
        int size = arr.length;
        int k = 2;
        rotate(arr, size, k);

        for(int i = 0; i < size; i++)
        {
            System.out.print(arr[i]);
        }
    }
}