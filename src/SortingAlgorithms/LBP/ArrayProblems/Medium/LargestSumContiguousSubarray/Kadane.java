package SortingAlgorithms.LBP.ArrayProblems.Medium.LargestSumContiguousSubarray;

public class Kadane {

    public static void main(String args[]){
        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is " +
                maxSubArraySum(a));
    }

    private static int maxSubArraySum( int[] a ) {

        int size = a.length;
        int max_so_far = Integer.MIN_VALUE;
        int max_end_here = 0;

        for(int i = 0; i<size; i++){
            max_end_here = max_end_here + a[i];

            if(max_so_far < max_end_here){
                max_so_far = max_end_here;

            }

            if(max_end_here < 0){
                max_end_here = 0;
            }
        }

        return max_so_far;

    }
}
