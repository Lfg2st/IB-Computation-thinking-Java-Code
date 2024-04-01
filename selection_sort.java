import java.util.Scanner;

public class selection_sort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] my_array = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Enter array element: ");
            my_array[i] = sc.nextInt();
        }

        //sorting array

        for(int j = 0; j < n - 1; j++){
            int min_index = j;
            for(int k = j + 1; k < n; k++){
                if (my_array[k] < my_array[j]){
                    min_index = k;
                }
            }

           int temp = my_array[j];
           my_array[j] = my_array[min_index];
           my_array[min_index] = temp;




        }

        for(int l = 0; l < n; l++){
            System.out.println("Array element is " + my_array[l]);
        }


        


        sc.close();
    }
}
