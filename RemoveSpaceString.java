import java.util.Scanner;

public class RemoveSpaceString{

    public static String removeSpace(String str){
        StringBuffer sbuf = new StringBuffer();
        for(char c : str.toCharArray())
        {
            if(c != ' ')
            {
                sbuf.append(c);
            }
        }
        return sbuf.toString();
    }
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the strinf to remove space from it ");
        String str = sc.nextLine();
        

        System.out.println("New string is " + removeSpace(str));
    }
}