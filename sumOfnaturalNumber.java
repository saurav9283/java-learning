import java.util.*;

public class sumOfnaturalNumber{

    public static int sum(int a){
        int sum = 0;

        for(int i = 1; i <= a; i++)
        {
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] a)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to sum all ");
        int num1 = sc.nextInt();

        System.out.println("Youenter a number " + num1);

        System.out.println(sum(num1));


    }
}