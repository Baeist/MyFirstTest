import java.util.Scanner;
public class UserValidationTwo {

    public static int getInt(String msg) {
        int number;
        boolean check;
        Scanner scanner = new Scanner(System.in);
        check = true;

        do {
            System.out.println(msg);

        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            return number;
        }
        else {
            System.out.println("Wrong input type.");
            check = false;
            scanner.nextLine();
        }
        }
        while(check == false);
        return 1;
    }
    public static void main(String[] args){
        String text;
        int x;

        text = "Enter a whole number: ";

        x = getInt(text);

        System.out.println("You chose " + x);

    }


}
