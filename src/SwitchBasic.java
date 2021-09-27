public class SwitchBasic {
    public static void main(String[] args) {
        int x;

        x = 1;

        switch(x){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(3);
                break;
            case 10:
                x = 2;
                break;
        }
        System.out.println(x);
    }
}
