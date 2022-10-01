package SortingAlgorithms.LoveBabbarCodePuzzles.ArrayProblems.Arrays.LongestConsecutiveSubsequence;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestSubsequence {


    public static int findLongestConsecutiveSubSequence(int arr[], int n){

        Arrays.sort(arr);

        int ans = 0;
        int count = 0;

        ArrayList<Integer> intList = new ArrayList<>();

        for(int i= 1; i < n; i++){
            if(arr[i] != arr[i-1]){
                intList.add(arr[i]);
            }
        }

        for(int i=0; i<intList.size(); i++){
            if(i>0 && intList.get(i) == intList.get(i-1) + 1){
                count ++;
            }
            else {
                count = 1;
            }
            ans = Math.max(ans, count);
        }

        return ans;
    }

    public static void main( String[] args ) {

        int arr[] = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42 };
        int n = arr.length;

        System.out.println(
                "Length of the Longest "
                        + "contiguous subsequence is "
                        + findLongestConsecutiveSubSequence(arr, n));
    }

}

