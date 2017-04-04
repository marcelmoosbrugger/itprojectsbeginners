/**
 * Created by ANILALCI on 27.03.2017.
 */
public class Hallo123 {

    public static void main(String[] args) {

        int i,j;

        /*for(i=0; i<10; i++) {

            System.out.println("Hallo");

            for(j=1; j<=3; j++) {
                System.out.println(j);
            }
        }*/





        /*for(i=0; i<10; i++) {

            for(j=0; j<=3; j++) {

                if(j == 0) {
                    System.out.println("Hallo");
                }
                else {
                    System.out.println(j);
                }
            }
        }*/






        int output;

        for(i=0; i<40; i++) {

            output = i % 4;

            if(output == 0) {
                System.out.println("Hallo");
            }
            else {
                System.out.println(output);
            }
        }
    }
}
