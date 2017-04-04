/*
 * Trying if-else statement and modulus (%) operator.
 */
public class CheckOddEven {   // Save as "CheckOddEven.java"
    public static void main(String[] args) {  // Program entry point
        int number = 49;       // Set the value of "number" here!
        System.out.print("The number is " + number);
        if ( number %2 == 0 ) {
            System.out.println( "Even" );
        } else {
            System.out.println(" Odd"  );
        }
        System.out.println( "Bye" );
    }
}