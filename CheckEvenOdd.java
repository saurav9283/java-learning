import java.util.Scanner;

public class CheckEvenOdd {

    public static boolean isEven(int n) {
        return (n % 2 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number to check if it is even or odd: ");
        int num1 = scanner.nextInt(); 

        if (isEven(num1)) {
            System.out.println(num1 + " is an Even number");
        } else {
            System.out.println(num1 + " is an Odd number");
        }

        scanner.close();
    }
}
