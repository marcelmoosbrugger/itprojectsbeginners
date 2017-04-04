package course4;

/**
 * Created by Anatolia on 3.04.2017.
 */
public class PrintNumberInWord {
    public static void main(String[] args) {
        int number = 3;  // Set the value of "number" here!

        /*
        // Using nested-if
        if (number == 1) {
            System.out.println("ONE");
        } else if (number == 2) {
            System.out.println("TWO");
        } else if (number == 3) {
            System.out.println("THREE");

        } else {
            System.out.println("INVALID NUMBER");
        }*/

        // Using switch-case
        switch(number) {
            case 1: System.out.println("ONE"); break;  // Don't forget "break"
            case 2: System.out.println("TWO"); break;
            case 3: System.out.println("THREE"); break;


            default: System.out.println("INVALID NUMBER");
        }
    }
}
