import java.util.Scanner;

public class bonus {
    public static void main(String[] args) {
        // if worked for 9 months or more --> 30% of salary
        // if worked for less than 9 months AND salary less than 2000 --> 20% of salary
        // if worked for less than 9 months AND salar equal or more than 2000 --> 10% of salary


        Scanner sc = new Scanner(System.in);
        

        System.out.println("    =======    BONUS CALCULATOR    ======");
        int months = 0;
        double salary = 0;
        try {
            System.out.println("How many months has the employee worked for: ");
            months = sc.nextInt();
            System.out.println("How much do they earn: ");
            salary = sc.nextDouble();

            if (months >= 9){
                System.out.println("The employee would receive 30% bonus");
                System.out.println("Salary after bonus: " + (salary + salary*0.3));
            }
           else if (months < 9){
                if (salary < 2000){
                    System.out.println("The employee would receive 20% bonus");
                    System.out.println("Salary after bonus: " + (salary + salary*0.2));
                }
                else{
                    System.out.println("The employee would receive 10% bonus");
                    System.out.println("Salary after bonus: " + (salary + salary*0.1));
                }
            }
    
        } catch (Exception e) {
            System.out.println("An error occurred: ");
        
        
       


        sc.close();
    } 
}
}
