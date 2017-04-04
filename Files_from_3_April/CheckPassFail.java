package course4;

/**
 * Created by Anatolia on 3.04.2017.
 */
/*
Exercise CheckPassFail (if-else): Write a program called CheckPassFail which prints "PASS" if the int variable "mark" is more than or equal to 50; or prints "FAIL" otherwise. The program shall always print “DONE” before exiting.
 */

/*
 * Trying if-else statement.
 */
public class CheckPassFail {  // Save as "CheckPassFail.java"
    public static void main(String[] args) {  // Program entry point
        int mark = 49;  // Set the value of "mark" here!
        System.out.println("The mark is " + mark);

        if ( mark>=50) {
            System.out.println( "Pass" );
        } else {
            System.out.println( "Fail" );
        }
        System.out.println( "Done" );
    }
}