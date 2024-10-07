public class isSubsetArray{

    public static boolean subset(int arr1[] , int arr2[], int a , int b)
    {
        int i,j;
        for(i = 0; i <b; i++)
        {
            for(j = 0; j < a; j++)
            {
                if(arr2[i] == arr1[j])
                {
                    break;
                }
            }
            if(j == a){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        int arr1[] =  {1,2,3,4,5};
        int arr2[] =  {9};
        int a = arr1.length;
        int b = arr2.length;

        if(subset(arr1 , arr2,a,b))
        {
            System.out.println("arr2 is a subset of arr1");
        }
        else{
            System.out.println("Not any subarray");
        }
    }
}