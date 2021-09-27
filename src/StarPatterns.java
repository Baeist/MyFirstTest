public class StarPatterns {
    public static void main(String[] args){

         firstFigure();
         secondFigure();
         thirdFigure();
        fourthFigure();

    }
    public static void firstFigure(){

        for(int counter = 1; counter < 9; counter++){
            for(int counterTwo = 1; counterTwo <= counter; counterTwo++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
    public static void secondFigure(){

        for(int counter = 0; counter < 8; counter++){
            for(int counterTwo = counter +1; counterTwo < 9; counterTwo++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
    public static void thirdFigure(){

        int counterTwo;

        for(int counter = 0; counter < 8; counter++){
            counterTwo = 8 - counter;
            for(int counterThree = 8 - counterTwo; counterThree > 0; counterThree--){
                System.out.print("  ");
            }
            for(counterTwo = 8 - counter; counterTwo > 0; counterTwo--){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
    public static void fourthFigure(){

        for(int counter = 0; counter < 8; counter++){

            int counterFour = 0;

            for(int counterTwo = 7 - counter; counterTwo > 0; counterTwo--){
                System.out.print("  ");
                counterFour++;
            }
            for(int counterThree = 8 - counterFour; counterThree > 0; counterThree--){
                System.out.print("# ");
                }
            System.out.println();
        }

    }
}
