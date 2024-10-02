import java.util.Scanner;

public class Remove_non_alphabets{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enters string that contain not char alpha");
        String str = sc.nextLine();

        StringBuffer sbuf = new StringBuffer(str);

        for(int i = 0; i < sbuf.length(); i++)
        {
            char ch = sbuf.charAt(i);
            if(!Character.isAlphabetic(ch)){
                sbuf.deleteCharAt(i);
                i--;
            }
        }
        System.out.println("new Remove non alphabets is " + sbuf);
    }
}