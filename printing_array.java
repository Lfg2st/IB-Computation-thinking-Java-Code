import java.util.Scanner;

public class printing_array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the array size: ");
        int n = sc.nextInt();


        int[] myArray = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Enter element of array: ");
            myArray[i] = sc.nextInt();
            
        }

        for(int j = 0; j < n; j++){
            System.out.println("Array element at index " + j + " is: " + myArray[j]);
        }
        sc.close();
    }
}