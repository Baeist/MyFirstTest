import java.util.Scanner;

public class Coolness {
    public static boolean getBoolean(String msg){
        Scanner scanner = new Scanner(System.in);
        boolean coolOrNot;

        System.out.print(msg);
        coolOrNot = scanner.nextBoolean();
        return coolOrNot;
    }
    public static void main(String[] args){

        boolean blond;
        boolean cool;
        boolean happy;

        System.out.println("Answer the following questions with true/false.");

        blond = getBoolean("Are you blond: ");
        cool = getBoolean("Are you cool: ");
        happy = getBoolean("Are you happy: ");

        if(blond && cool && happy){
            System.out.println("Wow you are living the life huh!");
        }
        else if(blond && cool || cool && happy || happy && blond){
            System.out.println("Two out of three, not too shabby.");
        }
        else if(blond ^ cool ^ happy){
            System.out.println("One out of three is better than nothing."); // "or" kan skrives på mere end en måde || eller ^ lidt forskellige betydninger dog, virker her
        }                                                                      // pga else if. ^ skal have 1 og kun 1 af statements korrekt for at virke
        else{
            System.out.println("Better believe in reincarnation:/");
        }

    }
}

