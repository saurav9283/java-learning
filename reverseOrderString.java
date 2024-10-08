public class reverseOrderString{
    public static void reverse(String str)
    {
        int size = str.length();
        for(int i = size-1; i >= 0; i--)
        {
            System.out.print(str.charAt(i));
        }
    }
    public static void main(String[] args)
    {
        String str = "Saurav";

        reverse(str);
    }
}