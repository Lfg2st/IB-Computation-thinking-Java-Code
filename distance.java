public class distance {
    public static void main(String[] args) {
        //An algoritm that finds the two neighbouring numbers in an array with the smallest distance to each other. The program should output the distance, index of the first number and index of the second number. For example, in the array A = {5, 1, 4, 7, 9, -12}, the algo should return distance 2 between element 3 and 4

        int[] a = {5, 1, 4, 7, 9, -12};

        int min_distance = Math.abs(a[1] - a[0]);
        int ele_index = 0;

        for(int i = 0; i < a.length - 1; i++){
            int item_distance = Math.abs(a[i + 1] - a[i]);
            if (item_distance< min_distance){
                min_distance = Math.abs(a[i] - a[i + 1]);
                ele_index = i;
            }
        }

        System.out.print("distance " + min_distance + " between element " + ele_index + " and " + (ele_index +1));



    }
}
