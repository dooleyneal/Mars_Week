import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public GuessingGame() {
        Scanner input = new Scanner(System.in);

        boolean correctGuess = false;

        int guess = 0;
        int increment = 0;

        System.out.println("\nHello User. What is your name?");

        String name = input.nextLine();

        System.out.println("Welcome " + name + " I'm thinking of a number between 1 and 100.");

        Random random = new Random();

        int number = random.nextInt(100);

        System.out.println("\nTry to guess my number.");

        while (correctGuess == false) {
            increment++;

            try {
                guess = input.nextInt();
            }
            catch (Exception e) {
                String badInput = input.next();
                System.out.println("\nThat's not an integer, try again");
                continue;
            }

            if (guess > 100 || guess < 1) {
                System.out.println("\nYour guess is out of range. Try again");
            }
            else if (guess > number) {
                System.out.println("Your guess is too high. Try again.");
            }
            else if (guess < number) {
                System.out.println("Your guess is too low. Try again.");
            }
            else {
                System.out.println("Well done " + name + "! You found my number in " + increment + " tries!");
                correctGuess = true;
            }
        }
        //input.close();
    }
}