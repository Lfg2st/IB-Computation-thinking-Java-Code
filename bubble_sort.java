import java.util.Scanner;
public class bubble_sort{
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

        for(int j = 0; j < n; j++){
            for(int k = 0; k < n-1; k++){
                if(my_array[k] <  my_array[k + 1]){
                    int temp = my_array[k];
                    my_array[k] = my_array[k + 1];
                    my_array[k + 1] = temp;
                }
            }
        }

        for (int l = 0; l < n; l++){
            System.out.println("Element is: " + my_array[l]);
        }
        sc.close();
    }
}