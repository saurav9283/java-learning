public class RemoveBracket{

    public static String removeBracket(String str)
    {
        StringBuffer sbuf = new StringBuffer();
        for(char c : str.toCharArray())
        {
            if(c != ')' && c != '(')
            {
                sbuf.append(c);
            }
        }

        return sbuf.toString();
    }
    public static void main(String[] args)
    {
        String str = "Saura()kumar";

        String ans = removeBracket(str);
        System.out.println(ans);

    }
}