import java.util.*;

public class FirstLetterOfEachWord{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str=  sc.nextLine();
        String[] s =  str.split(" ");
        String ch = "";
        for(String word: s)
        {
            ch += word.charAt(0);
        }
        System.out.println(ch);
    }
}