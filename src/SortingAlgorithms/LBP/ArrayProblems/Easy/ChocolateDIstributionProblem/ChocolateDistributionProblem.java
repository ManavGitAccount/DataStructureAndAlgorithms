package SortingAlgorithms.LBP.ArrayProblems.Easy.ChocolateDIstributionProblem;

import java.util.Arrays;

public class ChocolateDistributionProblem {

    public static void main( String[] args ) {

        int[] a = {3, 4, 1, 9, 56, 7, 9, 12};
        int n = a.length;
        int m = 3;
        System.out.print("The minumum cholocat is : " +
               chocolateDistributionMinimum(a, n, m));

    }

    public static int chocolateDistributionMinimum(int arr[], int n, int m){


        // if there are no chocolates or
        // number of students is 0
        if (m == 0 || n == 0)
            return 0;

        int min = Integer.MAX_VALUE;

        Arrays.sort(arr);

        for(int i=0; i+m-1<n; i++){
            int diff = arr[i+m-1] - arr[i];
            if(diff < min){
                min = diff;
            }
        }
        return min;
    }
}
