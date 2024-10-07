import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.List;

public  class FindKMaximum{

    public static void printmax3(int arr[] , int size, int k){
        PriorityQueue<Integer> pr = new PriorityQueue<>(k);

        for(int num: arr)
        {
            pr.add(num);
            if(pr.size() > k)
            {
                pr.poll();
            }
        }
        List<Integer> ls = new ArrayList<>(pr);
        Collections.sort(ls , Collections.reverseOrder());
        System.out.println("The " + k + " maximum elements are: " + ls);
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6};
        int size = arr.length;
        int k = 3;

        printmax3(arr, size,k);

    }
}