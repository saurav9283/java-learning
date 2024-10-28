import java.util.Scanner;

public class RemoveVowel {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a string to remover vowel in it");
            String str = sc.nextLine();

            StringBuffer sbuf = new StringBuffer(str);

            for (int i = 0; i < sbuf.length(); i++) {
                char ch = sbuf.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                        || ch == 'O' || ch == 'U') {
                    sbuf.deleteCharAt(i);
                    i--;
                }
            }

            System.out.println("String without buffer " + sbuf.toString());
        } catch (Exception e) {
            System.out.println("Error=-=-=" + e);

        }
    }
}