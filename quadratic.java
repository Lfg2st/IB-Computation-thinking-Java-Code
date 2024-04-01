import java.util.Scanner;
public class quadratic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Space();
        System.out.println("======= This programme allows you to solve quadratic equations =======");
        System.out.println("- Make sure your equation is in the format ax^2 + bx +c");
        System.out.println("- Then enter the values of a, b and c");
        Space();
        
        System.out.println("Enter the value of a: ");
        double a = sc.nextDouble();
        System.out.println("Enter the value of b: ");
        double b = sc.nextDouble();
        System.out.println("Enter the value of c: ");
        double c = sc.nextDouble();
        Space();
        if (Discriminant(a, b, c) < 0){
            System.out.println("The equation has no solutions");
        }
        else if(Discriminant(a, b, c) == 0.0){
            System.out.println("The equation has the solution:" + (-b + Math.sqrt(Discriminant(a, b, c)))/(2 * a));
        }
        else{
            System.out.println("The equation has the following solutions:");
            System.out.println("Solution 1:" + (-b - Math.sqrt(Discriminant(a, b, c)))/(2 * a));
            System.out.println("Solution 1:" + (-b + Math.sqrt(Discriminant(a, b, c)))/(2 * a));
        
        }
        Space();

        sc.close();
    }

    public static void Space(){
        for(int i = 0; i < 2; i++){
            System.out.println("");
        }
    }

    public static double Discriminant(double a, double b, double c){
        double d = b*b - (4*a*c);
        return d;
        
    }
}
