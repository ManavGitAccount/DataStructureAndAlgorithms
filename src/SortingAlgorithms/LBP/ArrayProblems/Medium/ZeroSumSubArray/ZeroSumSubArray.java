package SortingAlgorithms.LBP.ArrayProblems.Medium.ZeroSumSubArray;

import java.util.HashSet;
import java.util.Set;

public class ZeroSumSubArray {

    //Returns true if arr[] has a subarray with sum zero
    static Boolean subArrayExists(int arr[]){

        //Create an empty hashset hs
        Set<Integer> hs = new HashSet<>();

        //Initialize sum of Elements
        int sum= 0;

        //Traverse through the given array
        for(int i=0; i<arr.length; i++){

            //Add the current elements to sum
            sum += arr[i];

            //Return true in the following cases
            //a) Current element is 0.
            //b) sum of elements from 0 to i is 0.
            if(arr[i] ==0 || sum == 0 || hs.contains(sum)){
                return true;
            }

            //Add Sum to Hashset
            hs.add(sum);
        }

        // We reach here only when there is no subarray with 0 sum
        return false;
    }

    public static void main( String[] args ) {
        int arr[] = {4, 2, -3, 1, 6};

        if(subArrayExists(arr)){
            System.out.println("Found a subarray with sum 0");
        }
        else{
            System.out.println("No such Sub Array Exists");
        }
    }
}
