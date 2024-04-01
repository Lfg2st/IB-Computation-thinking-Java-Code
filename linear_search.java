import java.util.Scanner;

public class linear_search{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        int n = sc.nextInt();
        int[] my_array = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Enter array element: ");
            my_array[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be found: ");
        int search_ele = sc.nextInt();

        int output = -1;
        for(int j = 0; j < n; j++){
            if (my_array[j] == search_ele){
                output = j;
            }
        }

        System.out.println("The element was found at: " + output);
        sc.close();
    }
}