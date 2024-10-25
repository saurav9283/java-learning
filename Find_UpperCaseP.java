import java.util.*;


public class Find_UpperCaseP{
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str=  sc.nextLine();
        String[] s = str.split(" ");
        for(String word: s){
            char ch = word.charAt(0);
            if(ch >= 'A' && ch <= 'Z')
            {
                System.out.println(ch);
            }
        }
    }
}