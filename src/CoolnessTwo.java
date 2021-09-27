import java.util.Scanner;
public class CoolnessTwo {
    public static boolean getBoolean(String message){
        Scanner scanner = new Scanner(System.in);
        boolean coolOrNot;

        System.out.print(message);
        coolOrNot = scanner.nextBoolean();
        return coolOrNot;

    }
    public static void main(String[] args){
        boolean smart;
        boolean funny;
        boolean awesome;


        System.out.println("Please answer true or false to the following: ");
        smart = getBoolean("Are you smart? ");
        funny  = getBoolean("Are you funny? ");
        awesome= getBoolean("Are you awesome? ");

        System.out.println();

        if (smart && funny && awesome){
            System.out.println("You are among the greatest living beings ever!");
        }
        else if(smart && funny || smart && awesome){
            System.out.println("Wonderful attributes you have here.");
        }
        else if(smart){
            System.out.println("At least you have the most important feature.");
        }
        else{
            System.out.println("Dumb loser!");
        }

    }
}
