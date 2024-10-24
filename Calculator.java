import java.util.*;

public class Calculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();sc.nextLine();
        int num2 = sc.nextInt();sc.nextLine();
        char operator = sc.nextLine().charAt(0);
        if(operator == '+')
        {
            System.out.println(num1+ "+" +num2+"= " +(num1+num2));
        }
        else if(operator == '-')
        {
            System.out.println(num1+ "-" +num2+"= " +(num1-num2));
        }
        else if(operator == '%')
        {
            System.out.println(num1+ "%" +num2+"= " +(num1%num2));
        }
        else if(operator == '*')
        {
            System.out.println(num1+ "*" +num2+"= " +(num1*num2));
        }
        else {
            System.out.println("Invalid operator");
        }
    }

}