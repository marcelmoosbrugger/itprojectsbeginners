package course4;

/**
 * Created by Anatolia on 3.04.2017.
 */
public class HarmonicSum {
    public static void main (String[] args) {
        int maxDenominator = 50000;  // Use a more meaningful name instead of n
        float sumL2R = 0.0f;    // sum from left-to-right
        float sumR2L = 0.0f;    // sum from right-to-left

        // for-loop for summing from left-to-right
        for (int denominator = 1; denominator <= maxDenominator; ++denominator) {

            sumL2R= sumL2R + 1/(float)denominator;
            // Beware that int/int gives int, e.g., 1/2 gives 0.
        }
        System.out.println("The sum from left-to-right is: " + sumL2R);

        for (int denominator = maxDenominator; denominator >= 1; --denominator){
            sumR2L = sumR2L+ 1/(float)denominator;
        }
        System.out.println("The sum from right-to-left is: " + sumR2L);


    }
}
