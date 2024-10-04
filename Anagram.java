import java.util.*;

public class Anagram{

    public static boolean anagram(String str1 , String str2){
        if(str1.length() != str2.length())
        {
            return false;
        }
        
        char[] array1 = str1.toLowerCase().toCharArray();
        char[] array2 = str2.toLowerCase().toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("EENter frist string");
        String str1 = sc.nextLine();
        System.out.println("EENter frist string");
        String str2 = sc.nextLine();

        System.out.println("Entered String is "+ str1);
        System.out.println("Entered String is "+ str2);

        if(anagram(str1 , str2)){
            System.out.println("This string is anagram");
        }
        else{
            System.out.println("THis  string is not anagram");
        }

    }
}