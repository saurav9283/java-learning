import java.util.*;

public class Find_CountWord{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String find  = sc.nextLine();
        String[] s = str.split("\\w+");
        int count = 0;
        String ch = "";
        // for(int i = 0 ; i < s.length; i++)
        // {
        //     for(int j =0; j < s[i].length(); j++)
        //     {
        //         if(Character.isLowerCase(s[i].charAt(j)))
        //         {
        //             ch += s[i].charAt(j);
        //         }
        //     }
        //     if(ch.equals(find))
        //     {
        //         count++;
        //     }
        //     ch = "";
        // }
        
        for(String word: s){
            if(word.equals(find))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}