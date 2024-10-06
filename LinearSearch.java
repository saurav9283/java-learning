public class LinearSearch{

    public static int search(int arr[], int size, int x)
    {
        for(int i = 0; i < size; i++)
        {
            if(arr[i] == x)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[] = {5, 4, 1, 6, 10, 9, 23, 2};
        int x = 9;
        int size = arr.length;

        int ans = search(arr , size,x);
        System.out.println(x + " present inn index " + ans);
    }
}