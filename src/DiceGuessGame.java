import java.util.Scanner;
import java.util.Random;

public class DiceGuessGame {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        boolean equalOdd;
        int eyesRolled;

        System.out.print("One dice will be rolled, will the number of eyes rolled be even(true/false)?");
        equalOdd = scanner.nextBoolean();

        eyesRolled = diceRoll();

        if(equalOdd && eyesRolled == 2 || equalOdd && eyesRolled == 4 || equalOdd && eyesRolled == 6){
            System.out.println("You guessed correctly, the roll was " + eyesRolled);
        }
        else{
            System.out.println("Your guesss was terrible and you should feel bad. The roll was " + eyesRolled);
        }
    }

    public static int diceRoll(){
        Random random = new Random();
        int rolledEyes;

        rolledEyes = random.nextInt(6) + 1; // undgår 0 som resultat
        // System.out.println(rolledEyes);
        return rolledEyes;
    }
}
