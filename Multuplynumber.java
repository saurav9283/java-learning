import java.util.Scanner;

public class Multuplynumber{
    public static void main(String[] a){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1  = scanner.nextInt();

        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();
        
        int result = num1 * num2 ;
        System.out.println("The multiply of " + num1 +" and "+ num2 + " is " + result);

        scanner.close();
    }
}