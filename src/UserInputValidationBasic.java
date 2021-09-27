import java.util.Scanner;
public class UserInputValidationBasic {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int year;
        boolean check;

        do{
            System.out.println("How old are you: ");

            if (scanner.hasNextInt()) {                                   // hasNext"type" of info giver true/false
                year = scanner.nextInt();
                System.out.println("You are " + year + " years old.");
                check = true;

            }
            else {
                System.out.println("Wrong type of input. Please reply with a valid one.");
                scanner.nextLine();
                check = false;
            }
        }
        while(check == false);


    }
}
