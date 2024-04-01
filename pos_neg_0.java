import java.util.Scanner;

public class pos_neg_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n= sc.nextInt();

        if (n < 0){
            System.out.println("Number is negative!");
        }
        else  if (n > 0){
            System.out.println("Number is positive!");
        }
        else {
            System.out.println("Number is 0!");
        }

        sc.close();
    }
}
