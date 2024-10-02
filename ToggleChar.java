import java.util.Scanner;

public class ToggleChar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to toggle");
        String s = sc.nextLine();

        StringBuilder toggle = new StringBuilder(s);

        for(int i = 0; i < toggle.length(); i++)
        {
            char ch = toggle.charAt(i);
            if(Character.isLowerCase(ch)){
                toggle.setCharAt(i, Character.toUpperCase(ch));
            }
            else if(Character.isUpperCase(ch)){
                toggle.setCharAt(i, Character.toLowerCase(ch));
            }
        }

        System.out.println("your toggle string is " + toggle.toString());
    }
}