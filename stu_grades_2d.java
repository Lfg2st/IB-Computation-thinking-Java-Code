import java.util.Scanner;
public class stu_grades_2d {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        space(3);
        System.out.println("   ========   WELCOME TO GRADES MANAGER    ========");
        space(2);
        System.out.println("Enter the number of students in your class: ");
        int num_students = sc.nextInt();
        System.out.println("Enter the number of lessons: ");
        int num_lessons = sc.nextInt();

        String[] names = new String[num_students];
        int[][] grades = new int[num_students][num_lessons];
        space(2);
        for(int i = 0; i < num_students; i++){
            System.out.println("Enter the name of student [" + (i) + "]: ");
            names[i] = sc.next();
        }
        space(2);
        for(int j = 0; j < num_students; j++){
            System.out.println("Student name: " + names[j]);
            for(int k = 0; k < num_lessons; k++){
                System.out.println("Enter the grades of lesson [" + (j) + "]: ");
                grades[j][k] = sc.nextInt();
            }
        }
        space(2);
        System.out.println("Student information: ");
        for(int l = 0; l < num_students; l++){
            System.out.println("Student name is: " + names[l]);
            for(int m = 0; m < num_lessons; m++){
            System.out.println("Grades for lesson " + m + " are " + grades[l][m]);
        }
        }
        sc.close();
    }
    public static void space(int n){
        for(int i = 0; i < n; i++){
            System.out.println("");
        }
    }
}
