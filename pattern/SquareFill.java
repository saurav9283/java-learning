package pattern;
import java.util.*;

public class SquareFill{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        for(int i = 0; i <= n; i++)
        {
            for(int j = 0; j <= n; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}