import java.util.Scanner;

public class countNoVlwel{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char it is vowel or not");
        String str = sc.nextLine();

        System.out.println("you entered " + str);
        StringBuffer sbuf = new StringBuffer(str);
        int count  = 0;

        for(int i = 0; i < sbuf.length(); i++)
        {
            char ch = sbuf.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                count++;
            }
        }

        System.out.println("Totle vowel in " + str + " is " + count);


    }
}