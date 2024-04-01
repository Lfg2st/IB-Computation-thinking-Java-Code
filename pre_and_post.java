// the pre-condition of the programme is the value of x = 16
// the post-conditon of the programme is the square root of 16

public class pre_and_post {
    public static void main(String[] args) {
        double x = 16;
        if (x >=0){
            System.out.println("Square root is: " + Math.sqrt(x));
        }
        else{
            System.out.println("Invalid input!");
        }
    }
}
