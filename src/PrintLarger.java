import java.util.Scanner;

public class PrintLarger {
    public static void larger(int x, int y){
        if(x == y){
            System.out.println("You wrote the same number twice.");
        }
        else if(x>y){
            System.out.print(x + " is larger.");
        }
        else{
            System.out.print(y + " is larger.");
        }
    }
    public static void main(String[] args){
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which whole number is larger, please write two different ones: ");
        a = scanner.nextInt();
        b = scanner.nextInt();

        larger(a, b);

    }
}
