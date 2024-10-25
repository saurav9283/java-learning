import java.util.*;

public class CountVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int vowel = 0;
        int consonent = 0;
        int number = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'
                        || str.charAt(i) == 'U' || str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                        || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    vowel++;
                } else {
                    consonent++;
                }
            } else if (Character.isDigit(str.charAt(i))) {
                number++;
            }
        }
        System.out.println("Vowel : " + vowel);
        System.out.println("Consonant : " + consonent);
        System.out.println("Number : " + number);

    }
}