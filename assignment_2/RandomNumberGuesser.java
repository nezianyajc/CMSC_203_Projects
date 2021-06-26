import java.util.Scanner;

public class RandomNumberGuesser {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        // creates Scanner object

        System.out.println("Welcome to Random Number Guesser!");

        int userNum = obj.nextInt();
        obj.nextLine();

        RNG cRNG = new RNG();
        // creates instance of RNG class

    }

}