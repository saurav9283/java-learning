import java.util.*;

public class Consecutive2vowels{
    public static boolean isvowel(char c)
    {
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
        {
            return true;
        }
        return false;
    }
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        String[] s = str.split(" ");
        int count = 0;
        for(int i =0;i < s.length; i++)
        {
            for(int j = 1; j < s[i].length(); j++)
            {
                if(isvowel(s[i].charAt(j-1)) == true && isvowel(s[i].charAt(j)) == true)
                {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count); 
    }
}