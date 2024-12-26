package pattern;
import java.util.*;

public class NumberChanging{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        int num = 1;
        for(int i = 1; i <= n ;i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.err.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}