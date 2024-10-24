import java.util.*;

public class CountPrime {
    public static boolean isPrime(int n)
    {
        if(n <= 1)
        {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++)
        {
            if(n%i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for(int i = 0; i < str.length(); i++)
        {
            int p =  Character.getNumericValue(str.charAt(i));
            if(isPrime(p) == true){
                count++;
            }
        }
        System.out.println(count);
    }
}