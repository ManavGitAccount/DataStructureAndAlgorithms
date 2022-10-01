package SortingAlgorithms.LoveBabbarCodePuzzles.ArrayProblems.Arrays.NegativetoBeginningAndPositiveToEnd.Approach2;

public class TestClassTwo {

    static void rearrange(int arr[], int n){

        int j = 0, temp;
        for(int i=0; i<n; i++){
            if(arr[i] <0){
                if (i != j){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

    static void printArray(int[] arr, int n){
        for(int i = 0; i<n ; i++){
            System.out.print(arr[i] + "  ");
        }
    }

    public static void main( String[] args ) {
        int[] arr = {-4, -9, -5, 6, 7, -9, -8, -6, -111};
        int n = arr.length;

        rearrange(arr, n);
        printArray(arr, n);
    }
}
