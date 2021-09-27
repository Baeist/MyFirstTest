import java.util.Scanner;
public class MagicBox {
    public static void main(String[] args){

         Scanner scanner = new Scanner(System.in);

        int boxSize = 0;
        boolean check = true;

        System.out.println("I will make you a magic box. I just require one small thing from you.");

        while(check == true){
        System.out.println("How large would you like your box?(just one number please)");
        if(scanner.hasNextInt()){
        boxSize = scanner.nextInt();
        check = false;
            if(boxSize < 7 || boxSize > 99){
                System.out.println("Number is outside the boundaries set by the wizarding council.");
                check = true;
            }
        }
        else{
            scanner.nextLine();
        }
        }

        int placeHolder = boxSize;

        for(int counter = 0; counter < placeHolder; counter++){
            int counterTwo =  placeHolder - counter;
            if(counterTwo == placeHolder || counterTwo == 1) {
                for (int counterThree = 0; counterThree < placeHolder; counterThree++) {
                    System.out.print("# ");
                }
                System.out.println();
            }
            if(counterTwo <= placeHolder - 1 && counterTwo > 1){
                    System.out.print("# ");
                    for(int counterFour = 0; counterFour < placeHolder - 2; counterFour++){
                        System.out.print("  ");
                }
                System.out.print("# ");
                System.out.println();
            }
        }
    }
}
