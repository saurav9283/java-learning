import java.util.*;

public class Armstrong {
    public static boolean isArmstrom(int num1)
    {
        
        int newnumber = num1;
        int sum = 0;
        int numberOfDigits = String.valueOf(num1).length();
        while(num1 != 0)
        {
            int digit = num1%10;
            sum += Math.pow(digit, numberOfDigits);
            num1 /=  10;
        }

        return sum == newnumber;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        boolean ans = isArmstrom(num1);
        if(ans)
        {
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("number is not Armstrong");
        }
    }
}