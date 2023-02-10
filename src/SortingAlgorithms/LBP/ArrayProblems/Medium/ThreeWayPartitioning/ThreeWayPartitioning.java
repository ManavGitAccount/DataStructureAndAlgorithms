package SortingAlgorithms.LBP.ArrayProblems.Medium.ThreeWayPartitioning;

public class ThreeWayPartitioning {

    public static void threeWayPartitioning(int [] arr, int lowVal, int highVal){

        int n = arr.length;

        // Initialize the pointers at the start and end
        int start = 0;
        int end = n-1;

        // Traverse element from left to right
        for(int i=0; i<= end;){

            // If current element is smaller than range, put it on next available smaller position
            if(arr[i] < lowVal){
                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;
                i++;
            }

            // If current element is greater than range, put it on next available greater position
            else if(arr[i] > highVal){
                int temp = arr[end];
                arr[end] = arr[i];
                arr[i] = temp;
                end--;
            }

            else
                i++;
        }
    }

    static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++ ){
            System.out.print(arr[i] + "   ");
        }
    }
    public static void main( String[] args ) {

        int arr[] = {1, 14, 5, 20, 4, 2, 22};

        threeWayPartitioning(arr, 10, 20);
        printArray(arr);

    }
}
