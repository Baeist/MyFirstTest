import java.util.Scanner;
import java.util.Random;
public class CardGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int color;
        int number;
        int guessColor;
        int guessNumber;
        int counter;
        int guessCardColor;
        int counterTwo;

        color = random.nextInt(4) +1;
        number = random.nextInt(13) +1;
        // counter = 0;                             // unødvendig ved for(counter = 0; ...) men nok ikke ved for(counter == 0; ...)
        counterTwo = 0;

        // System.out.println(color); //answers
        // System.out.println(number);

        System.out.println("You have two guesses at the color of the card, and four guesses at the value, get both right and you win! :)");

        for(counter = 0; counter < 2; counter++){
            System.out.println("Guess a color(type 1 for spade, 2 for diamond, 3 for heart or 4 for club): "); // dobbelt op på variabler her pga omskrivning
        guessCardColor = scanner.nextInt();
            if(guessCardColor == 1){
            guessColor = 1;
            if(guessColor == color){
                System.out.println("You guessed the color of the card!");
                counter = 5;
            }
        }
        else if(guessCardColor == 2){
            guessColor = 2;
            if(guessColor == color){
                System.out.println("You guessed the color of the card!");
                counter = 5;
            }
        }
        else if(guessCardColor == 3){
            guessColor = 3;
            if(guessColor == color){
                System.out.println("You guessed the color of the card!");
                counter = 5;
            }
        }
        else if(guessCardColor == 4){
            guessColor = 4;
            if(guessColor == color){
                System.out.println("You guessed the color of the card!");
                counter = 5;
            }
        }
        else{
            System.out.println("Wrong type of guess, try again.");
            counter--;
        }
        }
        // System.out.println(counter);                // hvad sker der her, den kan udskrive counter som 2, men kører ikke if bagefter?? Behøver ikke initial value for at køre "for"
        if(counter == 2){
            counterTwo = 4;
        }
        if(counterTwo == 0){                            // funktionelt med ekstra if,  men ikke sikker på hvorfor den initialserer med counterTwo == 4, må sætte value ved første del af for
            for(counterTwo = 0; counterTwo < 4; counterTwo++){
                System.out.println("Try and guess the card value(1-13): ");
                guessNumber = scanner.nextInt();
                if(guessNumber == number){
                    System.out.println("Amazing! Congratulations you have guessed the card correctly!");
                    counterTwo = 5;
                }
            }

        }
        else if(counterTwo == 4){
            System.out.println("Sorry better luck next time.");
        }




    }


}
