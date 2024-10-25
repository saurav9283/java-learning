import java.util.Scanner;

public class Count_Word_Vowel {
    public static boolean isVower(char c)
    {
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||c == 'A' ||c == 'E' || c == 'I' || c == 'O' || c == 'O')
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=  new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" ");
        int count  = 0;
        for(String word : s){
            for(int  i = 0; i < 1; i++)
            {
                char c = word.charAt(i);
                if(isVower(c))
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}