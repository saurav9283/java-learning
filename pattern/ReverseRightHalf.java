package pattern;
import java.util.*;

public class ReverseRightHalf{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n-i+1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}