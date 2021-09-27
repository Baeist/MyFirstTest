import java.util.Scanner;
public class WhileLoopBasic {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int age;

        System.out.println("Type your age please:");            // do/while bedre her da man kan putte denne her ind først

        while(!scanner.hasNextInt()){                           //false statement
            scanner.nextLine();                             // string som beholder til alle input
            System.out.println("Type your age please:");
            }
        age = scanner.nextInt();

        System.out.println("Your age is: " + age);
    }
}
