import java.util.Scanner;
//imports scanner class

public class RandomNumberGuesser {
    public static void main(String[] args) {
        RNG cRNG = new RNG();
        // Creates class instance/object
        Scanner obj = new Scanner(System.in);
        // Creates input object
        int count = RNG.getCount();
        // Using class method to get initial count

        int nextGuess = 0;
        int lowGuess = 0;
        int highGuess = 0;
        int numOfGuess = 0;
        // initializing attributes

        String playAgain;
        // int randNum = RNG.rand();
        int reset;

        while (count != 0) {
            count++;
            numOfGuess = count++;
            int randNum = RNG.rand();
            System.out.println("This is the random num " + randNum);
            System.out.println("This is the initial count " + count);

            System.out.println("Welcome to Random Number Guesser!");
            System.out.println("Please enter a number between 1-100");
            System.out.println("Enter your first guess!");
            int userNum = obj.nextInt();
            obj.nextLine();

            System.out.println("You guessed " + userNum);

            if (randNum == userNum) {
                System.out.println("Congratulations, you guessed correctly.");
                System.out.println("Try again? (yes or no)");
                playAgain = obj.nextLine();
                playAgain = playAgain.toLowerCase();

                if (playAgain.contains("yes")) {
                    count = numOfGuess;
                } else if (playAgain.contains("no")) {
                    count = 0;
                }

            } else if (randNum > userNum) {
                lowGuess = userNum;

                nextGuess = obj.nextInt();
                RNG.inputValidation(nextGuess, lowGuess, highGuess);
            } else if (randNum < userNum) {
                highGuess = userNum;
                nextGuess = obj.nextInt();
                RNG.inputValidation(nextGuess, lowGuess, highGuess);
            }

        }

    }

}