import java.util.*;
public class LeapYear{

    public static boolean checkLeap(int year){
        if(year % 400 == 0 || year % 4 == 0)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year to check year is lear or not");
        int year = sc.nextInt();

        if(checkLeap(year))
        {
            System.out.println("tis year is a leap year");
        }
        else {
            System.out.println("This  year is not a leat year");
        }
    }
}