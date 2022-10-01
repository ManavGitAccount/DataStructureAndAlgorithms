package SortingAlgorithms.LoveBabbarCodePuzzles.ArrayProblems.Arrays.MaxAndMinInArray;

public class FindMaxAndMin {

    static class Pair{

        int min;
        int max;
    }


    static Pair getMinMax(int arr[], int n){

        Pair minmax = new Pair();
        int i;

        /*If there is only one element then return it
        as min and max both*/
        if(n == 1){
            minmax.max = arr[0];
            minmax.min = arr[0];
            return minmax;
        }

        /* If there are more than one elements, then initialize min
            and max*/
        if(arr[0] > arr[1]){
            minmax.max = arr[0];
            minmax.min = arr[1];
        }
        else{
            minmax.max = arr[1];
            minmax.min = arr[0];
        }

        for(i = 2; i < n; i++){
            if(arr[i] > minmax.max){
                minmax.max = arr[i];
            }
            else if( arr[i] < minmax.min){
                minmax.min = arr[i];
            }
        }

        return minmax;
    }

    public static void main(String args[]){
        int arr[] = {100, 34, 12, 345, 1, 0};
        int arr_size= arr.length;
        Pair minmax = getMinMax(arr, arr_size);
        System.out.printf("\n Maximum element is %d", minmax.max);
        System.out.printf("\n Minimum element is %d", minmax.min);
    }
}
