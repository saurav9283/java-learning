import java.util.*;

public class LengthStringR {

    public static int CalLen(String str){
        if(str.isEmpty())
        {
            return 0;
        }
        return 1+ CalLen(str.substring(1));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("you enter the string " + str);
        System.out.println(CalLen(str));

    }
    
}
