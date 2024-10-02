import java.util.*;

public class checkPalindrome {

    public static boolean isPalendrom(int num1) {
        int ans = 0;
        int temp = num1;
        while (temp != 0) {
            ans = (ans * 10) + (temp % 10);
            temp /= 10;
        }
        if(ans == num1){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check number is palendrom or not");
        int num1 = sc.nextInt();

        if (isPalendrom(num1)) {
            System.out.println("Number is palendrom");
        } else {
            System.out.println("Numner is not palendeom");
        }
    }
}