package pattern;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num1 = sc.nextInt();

        System.out.println("You entered the number " + num1);

        for (int i = 1; i <= num1; i++) {
            for (int j = 1; j <= num1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();  // Close the scanner
    }
}
