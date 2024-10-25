import java.util.*;

public class Fibonacci2{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();sc.nextLine();
        int first = 0;
        int second = 1;
        System.out.println(first+" ");
        while(second < num)
        {
            System.out.println(second + " ");
            int p = first+second;
            first = second;
            second = p;
        }
    }
}