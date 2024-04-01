import java.util.Scanner;
public class binary_search{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the size of your array: ");
        int arr_size = sc.nextInt();


        int[] my_array = new int[arr_size];
        for (int i = 0; i < arr_size; i++){
            System.out.println("Please enter array element: ");
            my_array[i] = sc.nextInt();
        }

        System.out.println("Which element would you like to find: ");
        int search_element = sc.nextInt();
        boolean found = false;
        int low = 0;
        int high = arr_size - 1;
        int output = -1;

        while (found == false){
            int mid = (high + low)/2;
            if(my_array[mid] == search_element){
                found = true; 
                output = mid;
            }

            else if(search_element < my_array[mid]){
                high = mid - 1;
            }

            else{
                low = mid + 1;
            }

        }

        System.out.println("The element was found at " + output);

        sc.close();
    }
}