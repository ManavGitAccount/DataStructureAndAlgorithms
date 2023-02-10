package SortingAlgorithms.LBP.ArrayProblems.Medium.MinimumSwapsRequiredToK;

import java.util.Arrays;

public class GFG {
    private static int minSwap(int[] arr, int n, int k)
    {

        int snowBallSize = 0; // initially snowBallsize is 0
        int count = 0;

        for (int i = 0; i < n; i++) {
            // we will increment our
            // snowBall only if we see an
            // element greater than K
            if (arr[i] > k) {
                snowBallSize++;
            }
            // this case will handle if we see an element less than <= k,
            // then we will swap the element arr[i] which is less
            // than K, with our first element of snowBall window which is greater than K.
            else if (snowBallSize > 0) {
                int tmp = arr[i];
                arr[i] = arr[i - snowBallSize];
                arr[i - snowBallSize] = tmp;

                count++;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {

        int arr1[] = { 2, 7, 9, 5, 8, 7, 4 };
        int n = arr1.length;
        int k = 5;
        System.out.println("min swaps = "
                + minSwap(arr1, n, k));
        System.out.println("Array after min swaps = "
                + Arrays.toString(arr1));
//        int arr2[] = {2, 1, 5, 6, 3};
//        n = arr2.length;
//        k = 3;
//        System.out.println("min swaps = "
//                + minSwap(arr2, n, k));
//        System.out.println("Array after min swaps = "
//                + Arrays.toString(arr2));

    }
}


