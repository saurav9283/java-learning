package pattern;
import java.util.*;


public class Trangle {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num1 = sc.nextInt();
        System.out.println("You enered " + num1);

        for(int i = 1; i <= num1; i++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}