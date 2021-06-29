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
        // initializing attributes to zero.

        String playAgain;
        String userName = "";
        int randNum = RNG.rand();
        // initializing class method

        while (count != 0) {
            // setting value to 0 escapes the loop
            numOfGuess = count;
            if (count == 1) {
                randNum = RNG.rand();
                // resets random number
            }
            /* Uncomment the 2 lines below to test each condition */
            // System.out.println("This is the random num " + randNum);
            // System.out.println("This is the initial count " + count);
            if (count == 1) {
                // Header only appears on first attempt
                System.out.println("Welcome to Random Number Guesser! Pleaae enter your name");
                userName = obj.nextLine();
                System.out.println("Please enter a number between 1-100");
            }
            System.out.println("Enter your " + numOfGuess + " guess!");

            count++;
            int userNum = obj.nextInt();
            obj.nextLine();
            if (count > 1) {
                nextGuess = userNum;
                // assigns next guess on 2nd attempt
            }

            System.out.println("You guessed " + userNum);

            if (randNum == userNum) {
                System.out.println("Number of guesses is " + numOfGuess);
                System.out.println("Congratulations, you guessed correctly.");
                System.out.println("Try again? (yes or no)");
                playAgain = obj.nextLine();
                playAgain = playAgain.toLowerCase();

                if (playAgain.contains("yes")) {
                    count = 1;
                } else if (playAgain.contains("no")) {
                    System.out.println("Thanks for playing..." + userName);
                    count = 0;
                }

            } else if (randNum > userNum) {
                lowGuess = userNum;
                System.out.println("Number of guesses is " + numOfGuess);
                System.out.println("Your guess is too low.");
                highGuess = 100;
                RNG.inputValidation(nextGuess, lowGuess, highGuess);
            } else if (randNum < userNum) {
                highGuess = userNum;
                System.out.println("Number of guesses is " + numOfGuess);
                System.out.println("Your guess is too high.");
                lowGuess = 0;
                RNG.inputValidation(nextGuess, lowGuess, highGuess);
            }
        }

    }

}
