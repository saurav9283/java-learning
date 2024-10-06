import java.util.*;

public class FindSuminString{
    public static int SumOFNUmber(String str)
    {
        int sum = 0;
        for(char ch:str.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                sum += ch - '0';
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = "12345";
        System.out.println("sum is " + SumOFNUmber(str));
    }
}