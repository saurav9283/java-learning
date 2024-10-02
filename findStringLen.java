import java.util.Scanner;

public class findStringLen{
    public static void main(String[] args){
        // String s = "Saurav";
        // int len = 0;
        // for(int i = 0 ;i <  s.length(); i++)
        // {
        //     len++;
        // }
        // System.out.println("Length of "+ s + " is " + len);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string to check length");
        String s = sc.nextLine();

        int len = 0;

        for(int i = 0 ; i < s.length(); i++)
        {
            len++;
        }

        System.out.println("you entered " + s + " and its length is " + len);

    }
}