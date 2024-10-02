import java.util.*;

public class Hcf{

    public static int GCD(int a , int b)
    {
        int result = Math.min(a,b);

        while(result > 0)
        {
            if(a % result == 0 && b % result == 0)
            {
                break;
            }
            result--;
        }
        return result;
    }
    
    public static void main(String[] ags){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two number to find hcf");

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(GCD(a,b));
    }
}