
import java.util.*;
public class PalindromeString {

    public static boolean isPal(char[] str)
    {
        int left = 0;
        int right = str.length-1;
        while(left < right)
        {
            if(str[left] != str[right])
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        if(isPal(ch))
        {
            System.out.println("Yes it is palendrom");
        }
        else{
            System.out.println("Not a palendrom");
        }
    }
}
