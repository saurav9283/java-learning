import java.util.*;

public class Count_Word{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" ");
        int count = 0;
        for(int i = 0; i < s.length; i++)
        {
            count++;
        }
        System.out.println(count);
    }
}