import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class IPA48Solution{
    public static boolean validation(int score)
    {
        return score > 0 && score <= 100;
    }

    public static List<Integer> findValidScores(List<Integer>scores)
    {
        List<Integer> validScore = new ArrayList<>();
        for(int score : scores)
        {
            if(validation(score)){
                validScore.add(score);
            }
        }

        if(validScore.isEmpty())
        {
            return null;
        }
        else{
            return validScore;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<Integer>scores = new ArrayList<>();
        for(int i = 0; i < 5; i++)
        {
            int score = sc.nextInt();sc.nextLine();
            scores.add(score);
        }

        List<Integer> validScore = findValidScores(scores);
        if(validScore != null)
        {
            for(int s : validScore)
            {
                System.out.println("Valid scores are = " + s);
            }
        }
        else{
            System.out.println("No valid score found.");
        }
    }
}