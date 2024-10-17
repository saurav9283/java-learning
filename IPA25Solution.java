import java.util.*;

class Cinema {
    private int movieId;
    private String director;
    private int rating;
    private int budget;

    public Cinema(int movieId, String director, int rating, int budget) {
        this.movieId = movieId;
        this.director = director;
        this.rating = rating;
        this.budget = budget;
    }

    public int getid() {
        return movieId;
    }

    public String getdirector() {
        return director;
    }

    public int getrating() {
        return rating;
    }

    public int getbudget() {
        return budget;
    }
}

public class IPA25Solution {
    public static int findAvgBudgetByDirector(Cinema[] cinemas, String find) {
        int sum = 0;
        int count = 0;
        for (Cinema cinema : cinemas) {
            if (cinema.getdirector().equalsIgnoreCase(find)) {
                sum += cinema.getbudget();
                count++;
            }
        }
        if (sum > 0) {
            int avg = sum / count;
            return avg;
        } else {

            return 0;
        }
    }

    public static int  getMovieByRatingBudget(Cinema[] cinemas, int findratinf, int findbudget)
    {
        for(Cinema cinema: cinemas)
        {
            if(cinema.getrating() == findratinf && cinema.getbudget() == findbudget && findbudget%findratinf == 0)
            {
                return cinema.getid();
            }
        }
        return 0;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Cinema[] cinema = new Cinema[4];
        for(int i = 0; i <4; i++)
        {
            int movieId = sc.nextInt();sc.nextLine();
            String director = sc.nextLine();
            int rating = sc.nextInt();sc.nextLine();
            int budget = sc.nextInt();sc.nextLine();

            cinema[i] = new Cinema(movieId, director, rating, budget);
        }
        String find = sc.nextLine();
        int findrating = sc.nextInt();sc.nextLine();
        int findbudget = sc.nextInt();sc.nextLine();

        int ans  = findAvgBudgetByDirector(cinema,find);
        if(ans != 0)
        {

            System.out.println(ans);
        }
        else{
            System.out.println("Sorry - The given director has not yet directed any movie");
        }

        int result = getMovieByRatingBudget(
            cinema,findrating,findbudget
        );
        if(result != 0)
        {
            System.out.println(result);
        }
        else{
            System.out.println("Sorry - No movie is available with the specified rating and budget requirement");
        }



    }
}