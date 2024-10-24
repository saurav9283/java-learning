import java.util.Scanner;

public class CharRepeat{
    public static String findnewstring(String str)
    {
        int count = 1;
        StringBuilder comp = new StringBuilder();
        for(int i = 1; i < str.length(); i++)
        {
            if(str.charAt(i) == str.charAt(i-1))
            {
                count++;
            }
            else{
                comp.append(str.charAt(i-1)).append(count);
                count = 1;
            }
        }
        comp.append(str.charAt(str.length()-1));
        return comp.toString();
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = findnewstring(str);
        System.out.println(ans);        
    }
}