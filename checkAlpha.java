import java.util.Scanner;

public class checkAlpha{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character to check it is valid or not");
        

        char ch = scanner.next().charAt(0);
        System.out.println("You entered " + ch);
         if(Character.isAlphabetic(ch))
         {
            System.out.println("This is valid char");
         }
         else{
            System.out.println("THis is not valod  character");
         }
    }
}