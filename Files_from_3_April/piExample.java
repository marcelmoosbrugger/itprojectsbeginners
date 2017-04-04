package course4;

/**
 * Created by Anatolia on 3.04.2017.
 */
public class piExample {
    public static void main(String[] args) {

        double sum = 0;

        for(double i = 21; i >= 1; i-=2){
            if(i % 4 == 1){
                sum += 1/i;
            }else if (i % 4 == 3){
                sum-= 1/i;
            }
        }
        System.out.println(4*sum);
    }

}
