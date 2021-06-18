import java.util.Scanner;


public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner movieObj = new Scanner(System.in);
		String movie = " ";
		int rating;
		
		System.out.println("Please enter the title of a movie");
		movie = movieObj.nextLine();
		
		System.out.println("You selected the movie " + movie);
		
		System.out.println("What rating would you give this movie? 1-5");
		rating = movieObj.nextInt();
		
		System.out.println("You gave the movie a rating of" + " "+rating + " out of 5.");
		

	}

}
