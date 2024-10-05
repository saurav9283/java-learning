import java.util.*;

public class ReverseString{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to reverse");
        String str = sc.nextLine();
        System.out.println("You enter" + str);

        for(int i = str.length()-1; i >= 0; i--)
        {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}