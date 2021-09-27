import java.util.Scanner;
import java.util.Random;
public class OpgaveCardValueGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int colorGuess;
        int valueGuess;
        int cardValue;
        int cardColor;
        int counter = 0;
        int counterTwo = 0;
        boolean check;

        System.out.println("The rules for guessing a card is that you have two guesses at the color and three at the value." +
                " I will help you with the values a bit by giving hints, if you make it that far. Good luck.\n");

        cardColor = random.nextInt(4) + 1;
        cardValue = random.nextInt(13) + 1;

        // System.out.println(cardColor + " color and " + cardValue + " value"); // cheat mode

        do{
            System.out.println("Try and guess the color of the card first. Type 1 for Spade, 2 for Diamond, 3 for Heart and 4 for Club.");
            if(scanner.hasNextInt()){
                colorGuess = scanner.nextInt();
                if(colorGuess < 5 && colorGuess > 0){
                    if(colorGuess == cardColor){
                        System.out.println("Congratulations you guessed the color correctly.");
                        check = false;
                        counter = 2;
                    }
                    else if(counter < 1){
                        System.out.println("Wrong guess, try one more time.");
                        counter = 1;
                        check = true;
                    }
                    else{
                        System.out.println("Sorry you lost.");
                        check = false;
                    }
                }
                else{
                    System.out.println("The number you chose is out of bounds.");
                    scanner.nextLine();
                    check = true;
            }
        }
        else{
            System.out.println("Your guess did not make any sense.");
            scanner.nextLine();
            check = true;
            }
        }
        while(check == true);

        if(counter == 2){
            do{
                System.out.println("Try and guess the value of the card now.");
                scanner.nextLine();
                if(scanner.hasNextInt()){
                    valueGuess = scanner.nextInt();
                    if(valueGuess < 14 && valueGuess > 0){
                        if(valueGuess == cardValue){
                            System.out.println("Congratulations you also guessed the value correctly. You won the game!!");
                            check = false;
                        }
                        else if(counterTwo < 2 && valueGuess < cardValue){
                            System.out.println("Wrong guess, the value is higher than your guess.");
                            counterTwo = counterTwo + 1;
                            check = true;
                        }
                        else if(counterTwo < 2 && valueGuess > cardValue) {
                            System.out.println("Wrong guess, the value is lower than your guess.");
                            counterTwo = counterTwo + 1;
                            check = true;
                        }
                        else{
                            System.out.println("Sorry you lost.");
                            check = false;
                            }
                    }
                    else{
                        System.out.println("Your guess is out of range.");
                        check = true;
                    }
                }
                else{
                    System.out.println("Your guess did not make any sense.");
                    check = true;
                }
            }
            while(check == true);
        }

    }

}
