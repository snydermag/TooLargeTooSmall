/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args){
        Scanner userIn = new Scanner(System.in);
        Random generator = new Random();
        int randomNum;
        int userGuess;
        int prevGuess = 0;
        int numGuesses = 0;
        boolean correct = false;

        randomNum = generator.nextInt(41);

        while (correct == false) {

            System.out.println("Guess a number between 1-40:");

            // Take in user guess
            userGuess = userIn.nextInt();

            if (userGuess == prevGuess){
                System.out.println("You already tried that! Try again.\n");
                prevGuess = userGuess;
            }
            else if (userGuess < randomNum) {
                System.out.println("Too small. Try again.\n");
                numGuesses++;
            }
            else if (userGuess > randomNum) {
                System.out.println("Too big. Try again.\n");
                numGuesses++;
            }
            else {
                System.out.println("Congrats! You guessed the number.");
                correct = true;
                numGuesses++;
            }

            prevGuess = userGuess;
        }

        if (numGuesses < 2) {
            System.out.println("And it only took you " + numGuesses + " guess!");
        }
        else {
            System.out.println("And it only took you " + numGuesses + " guesses!");
        }
    }
}
