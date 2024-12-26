package pattern;
import java.util.*;

public class PalindromeTriangle{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        for(int i = 1; i <=n ;i++)
        {
            for(int j = 1; j <= 2*(n-i); j++)
            {
                System.out.print(" ");
            }

            for(int k = i; k >= 1; k--)
            {
                System.out.print(k + " ");
            }

            for(int j = 2; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}