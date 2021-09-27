import java.util.Scanner;
import java.util.Random;
public class GuessANumber {
    public static void main(String[] args){
        Random random = new Random();
        int number;
        int guess;
        Scanner scanner = new Scanner(System.in);

        number = random.nextInt(100) + 1;

        do{
        System.out.println("Guess a number between 1-100");
        guess = scanner.nextInt();

            if (guess == number) {
                System.out.println("Your guess was correct");
            } else if (guess < number) {
                System.out.println("Your guess was lower than the number.");
            } else if (guess > number) {
                System.out.println("Your guess was higher than the number.");
            }
        } while(guess != number);
    }
}
