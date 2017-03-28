import com.sun.org.apache.xpath.internal.SourceTree;

public class exercise1
{
    public static void main(String[] args) {
       double x = 1/10.0;
       System.out.println(x);
       x = x * x;
       x -= 0.01;

       System.out.println(x);

       /*if(x < -0.001){
           System.out.println("negative");
       }else if(x > 0.001){
           System.out.println("positive");
       }else{
           System.out.println("close to zero");
       }

       if(x < 0){ //Math.abs(x);
           x = x * -1;
       }

       if(x < 1){
           System.out.println("small");
       }else if(x > 1000000){
           System.out.println("large");
       }*/

       if(x > -1 && x < 0) {
           System.out.println("negative small");
       }
       else if(x <= -1 && x >= -1000000) {
           System.out.println("negative");
       }
       else if(x < -1000000) {
           System.out.println("negative large");
       }
       else if(x > -0.001 && x < 0.001) {
           System.out.println("zero");
       }
       else if(x < 1 && x > 0) {
           System.out.println("positive small");
       }
       else if(x >= 1 && x <= 1000000) {
           System.out.println("positive");
       }
       else if(x > 1000000) {
           System.out.println("positive large");
       }
    }
}

