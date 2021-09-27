import java.util.Scanner;
public class GiveMeStars {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int starsWanted;
        boolean check;
        int index;

        starsWanted = -1;                          // skal initialeres ellers fejl i for loopet

        do {
            System.out.println("How many stars would you like me to show you?");        // sjovere hvis man ikke ved hvor mange man må angive, 1-100
            if(scanner.hasNextInt()){
            starsWanted = scanner.nextInt();
                if(starsWanted<101 && starsWanted>0){
                    System.out.println("What a nice and modest amount of stars you have chosen!");
                check = false;
                }
                else{
                    System.out.println("That is not a possible amount of stars. Lets try again.");
                    check = true;
                }
            }
            else   {
                scanner.nextLine();
                System.out.println("That is not a possible amount of stars. Lets try again.");
                check = true;
            }
        } while(check == true);

        System.out.println("Here you go: ");
        for(index = 1; index <= starsWanted; index++){
            System.out.print("*");
        }


    }
}
