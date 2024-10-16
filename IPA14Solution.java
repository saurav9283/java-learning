import java.util.*;

class Movie {
    private String movieName;
    private String company;
    private String genre;
    private int budget;
    private String details;

    public Movie(String movieName, String company, String genre, int budget) {
        this.movieName = movieName;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getcompany() {
        return company;
    }

    public String getgenre() {
        return genre;
    }

    public int getbudget() {
        return budget;
    }

    public String getDetails() {
        return details;
    }
}

public class IPA14Solution {

    public static void getMovieByGenre(Movie[] movies, String search) {
        for (Movie movie : movies) {
            if (movie.getgenre().equalsIgnoreCase(search)) {
                if (movie.getbudget() > 80000000) {
                    System.out.println("High Budget Movie");
                } else {
                    System.out.println("Low Budget Movie");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie[] movie = new Movie[4];
        for (int i = 0; i < 4; i++) {
            String movieName = sc.nextLine();
            String company = sc.nextLine();
            String genre = sc.nextLine();
            int budget = sc.nextInt();
            sc.nextLine();

            movie[i] = new Movie(movieName, company, genre, budget);
        }
        String search = sc.nextLine();
        getMovieByGenre(movie, search);

    }
}