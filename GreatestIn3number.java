import java.util.Scanner;

public class GreatestIn3number{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        System.out.println("Enter third number");
        int c = scanner.nextInt();

        if(a > b && a > b)
        {
            System.out.println( a + "A is the greater from a and b");
        }
        else if(b >a && b > c)
        {
            System.out.println(b + "B is greater from a and c");
        }
        else{
            System.out.println(c + "C is greater from a and b");
        }

        scanner.close();


    }
}