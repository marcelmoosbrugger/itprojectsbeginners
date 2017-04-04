package course4;

/**
 * Created by Anatolia on 3.04.2017.
 */
public class SumAndAverage {
    public static void main (String[] args) {
        int sum = 0;          // Store the accumulated sum, init to 0
        double average;       // average in double
        int lowerbound = 1;   // The lowerbound to sum
        int upperbound = 100; // The upperbound to sum
        int i=0;

        while(lowerbound<=upperbound){
            sum=sum+lowerbound;
            lowerbound++;
            i++;



        }
        System.out.println(sum);

        System.out.println(sum/(double)i);

        /*// Use a for-loop um from lowerbound to upperbound
        for (int number = lowerbound; number <= upperbound; ++number) {
            sum += number;     // same as "sum = sum + number"
        }
        // Compute average in double. Beware that int/int produces int.
      average= sum/100.0;
        // Print sum and average.
        System.out.println(sum);
        System.out.println(average);*/



    }
}
