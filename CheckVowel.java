public class CheckVowel{
    public static void main(String[] args){
        char ch = '4';

        if(Character.isAlphabetic(ch)){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                System.out.println("The  character is vowel");
            }
            else{
                System.out.println("Not a vowel");
            }
        }
        else{
            System.out.println("Not a character");
        }
    }
}