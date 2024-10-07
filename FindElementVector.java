import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class FindElementVector{

    public static void printindex(List<Integer> list , int element)
    {
        int index = list.indexOf(element);
        if(index != -1)
        {
            System.out.println(index);
        }
        else{
            System.out.println("-1");
        }
    }
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        int element = 5;
        printindex(list , element);    

    }
}