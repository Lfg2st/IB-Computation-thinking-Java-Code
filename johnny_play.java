import java.util.Scanner;
public class johnny_play {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Space(3);
        System.out.println("Will Johnny play today? Let's see!");
        Space(2);
        System.out.println("Did Johnny finish homework[yes/no]: ");
        String homework = sc.nextLine();
        System.out.println("Is the whether good[yes/no]: ");
        String weather = sc.nextLine();

        Space(2);
   
        if (homework.equals("yes") && weather.equals("yes")) {
            System.out.println("Johnny can go play! :)");
        } else if (homework.equals("no") || weather.equals("no")) {
            System.out.println("Johnny cannot play today. :(");
        } else {
            System.out.println("Invalid input");
        }
        sc.close();
    }

    public static void Space(int a){
        for(int i = 0; i < a; i++){
            System.out.println("");
        }
    }
}
