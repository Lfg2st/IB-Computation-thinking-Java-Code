public class stu_grades {
  public static void main(String[] args) {
    String[] NAMES = {"may", "eri", "elen", "rit", "rato", "more", "epi", "ent", "ronal", "bib"};
    int[] GRADES = {99, 55, 77, 45, 89, 99, 76, 45, 33, 75};

    //printing grades and corresponding name
    System.out.println("------------------");
    System.out.println("Student's list");
    System.out.println("------------------");

    for(int i = 0; i < NAMES.length; i++){
        System.out.println((i + 1) + ". Student's name: " + NAMES[i] );
        System.out.println("   "+ "Student's grade: " + GRADES[i] );
        System.out.println("");
    }
    System.out.println("------------------");
    System.out.println("Statistics");
    System.out.println("------------------");
    System.out.println("1. Average is: " + average_finder(GRADES));
    System.out.println("2. Highest scoring student is " + highest_grade_finder(GRADES, NAMES));
    System.out.println("3. Lowest scoring student is " + lowest_grade_finder(GRADES, NAMES));
  }  

  public static double average_finder(int[] grades){
    double sum = 0;
    for(int i = 0; i < grades.length; i++){
      double  student_grade =  grades[i];
      sum = sum + student_grade;
    }
    double average = sum / grades.length;
    return average;
  }

  public static String highest_grade_finder(int[] grades, String[] names){
    int highest_grade = grades[0];
    String highest_name = names[0];
    for(int i = 0; i < grades.length;i++){
        if(grades[i] > highest_grade){
            highest_grade = grades[i];
            highest_name = names[i];
        }
    }

    return highest_name + " at " + highest_grade;

    
  }
  public static String lowest_grade_finder(int[] grades, String[] names){
    int lowest_grade = grades[0];
    String lowest_name = names[0];
    for(int i = 0; i < grades.length;i++){
        if(grades[i] < lowest_grade){
            lowest_grade = grades[i];
            lowest_name = names[i];
        }
    }

    return lowest_name + " at " + lowest_grade;

    
  }
}
