package pattern;
import java.util.*;

public class NumberIncreasing{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            System.err.println();
        }
    }
}