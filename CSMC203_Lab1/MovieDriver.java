import java.util.Scanner;

public class MovieDriver {

    public static void main(String[] args) {
        Scanner movieObj = new Scanner(System.in);
        String movie, tickets, lowRatings, rating;
        int ticketsSold, morRates;

        morRates = 1;

        while (morRates != 0) {
            System.out.println("Welcome to movie rater.");
            System.out.println("Please enter the title of a movie");
            movie = movieObj.nextLine();
            System.out.println("You selected the movie " + movie);

            System.out.println("What rating would you give this movie? PG, PG-13, R");
            rating = movieObj.nextLine();

            System.out.println("You gave the movie a rating of" + " " + rating);

            System.out.println("Please enter the number of tickets sold at AMC for " + movie);
            ticketsSold = movieObj.nextInt();
            tickets = Integer.toString(ticketsSold);

            System.out.println("AMC sold " + tickets + " for " + movie);
            System.out.println(movie + " " + "rating " + rating + " Tickets sold " + tickets);
            System.out.println("Would you like to rate another movie? Please enter yes or no");
            lowRatings = movieObj.next();
            movieObj.nextLine();
            System.out.println("You replied " + lowRatings);

            if (lowRatings.contains("yes")) {
                morRates = 1;
            } else if (lowRatings.contains("no")) {
                morRates = 0;
            }
        }
        movieObj.close();
    }
}