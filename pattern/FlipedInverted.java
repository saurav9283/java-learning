package pattern;
import java.util.*;

public class FlipedInverted{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entwr the number");
        int num1 = sc.nextInt();

        System.out.println("You entered " + num1);

        for(int i = 1; i<= num1; i++)
        {
            for(int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            for(int k = 1; k <= num1-i+1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}