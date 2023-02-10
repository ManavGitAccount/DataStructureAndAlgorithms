package SortingAlgorithms.LBP.SortingProblems.Easy.FirstAndLast;
/**
Given a sorted array with possibly duplicate elements, the task is to find indexes of first and last occurrences of an
 element x in the given array.

        Examples:

        Input : arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125}
        x = 5
        Output : First Occurrence = 2
        Last Occurrence = 5

        Input : arr[] = {1, 3, 5, 5, 5, 5, 7, 123, 125 }
        x = 7
        Output : First Occurrence = 6
        Last Occurrence = 6
 **/

/**
 * Very important concept of continue.
 * What's continue: continue keyword is used to end the current iteration in a for loop (or a while loop),
 * and continues to the next iteration.
 */

public class FirstAndLast {

    public static void findFirstAndLast(int arr[], int x)
    {
        int n = arr.length;
        int first = -1, last = -1;
        for (int i = 0; i < n; i++) {
            if (x != arr[i])
                continue;
            if (first == -1)
                first = i;
            last = i;
            System.out.println(last);
        }
        if (first != -1) {
            System.out.println("First Occurrence = " + first);
            System.out.println("Last Occurrence = " + last);
        }
        else
            System.out.println("Not Found");
    }

    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 3, 4, 3,5,3};
        int x = 3;
        findFirstAndLast(arr, x);
    }
}
