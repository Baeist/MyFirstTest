import java.util.Scanner;
public class DaysOfMonthTwo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int monthNumber;
        boolean wantToKnow;
        int year;
        int modulusFourYear;
        int hundredYearModulus;
        int fourHundredYearModulus;

        System.out.print("Please write the number of the month, you want to know number of days in: ");
        monthNumber = scanner.nextInt();


            if(monthNumber == 1 ^ monthNumber == 3 ^ monthNumber == 5 ^ monthNumber == 7 ^ monthNumber == 8 ^ monthNumber == 10 ^ monthNumber == 12) {
                System.out.println("There are 31 days in this month.");
            }
            else if(monthNumber == 4 ^ monthNumber == 6 ^ monthNumber == 9 ^ monthNumber == 11){
                System.out.println("There are 30 days in this month");
            }
            else {
                System.out.println("There are 28 days in this month unless its a leap year in which case there are 29 days.");
                System.out.print("Do you wish to know if a certain year is/was a leap year(true/false)? ");
                wantToKnow = scanner.nextBoolean();

                if (!wantToKnow) {
                    System.out.println("No problem.");
                } else {
                    System.out.print("Please enter the year you are interested in: ");
                    year = scanner.nextInt();

                    modulusFourYear = year % 4;
                    hundredYearModulus = year % 100;
                    fourHundredYearModulus = year % 400;

                    if (modulusFourYear == 0 && hundredYearModulus != 0) {
                        System.out.println("The year " + year + " was a leap year.");
                    } else if (fourHundredYearModulus == 0) {
                        System.out.println("The year " + year + " was a leap year.");
                    } else {
                        System.out.println("The year " + year + " was not a leap year.");
                    }
                }





        }

    }
}

