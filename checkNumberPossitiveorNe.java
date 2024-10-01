import java.util.Scanner;
public class checkNumberPossitiveorNe{
    public static void main(String[] a)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check number is positive or negative");
        int num1 = scanner.nextInt();

        if(num1 >= 0)
        {
            System.out.println(num1+" is a positive number");
        }
        else
        {
            System.out.println(num1+" is a negative number");
        }

    }
}