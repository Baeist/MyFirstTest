import java.util.Scanner;

public class DoWhileLoopBasic {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int age;
        boolean check;

        do{
            System.out.println("Type your age please:");
            if(!scanner.hasNextInt()){
            scanner.nextLine();
            check = true;
            }
            else{
                check = false;
            }

        }
        while(check == true);

        age = scanner.nextInt();

        System.out.println("Your age is: " + age);
    }
}
