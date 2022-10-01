package SortingAlgorithms.LoveBabbarCodePuzzles.SortingProblems.Hard.CountInversionInArray.MinimumNumberSwaps;

import java.util.Arrays;

public class MinimumNumberSwaps {

    public int minSwaps(int[] arr, int N){
        int ans = 0;

        int[] temp = Arrays.copyOfRange(arr, 0, N);
        Arrays.sort(temp);

        for(int i=0; i<N; i++){
            if(arr[i] != temp[i]){
                ans++;
                swap(arr, i, indexOf(arr, temp[i]));
            }
        }
        return ans;
    }

    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public int indexOf(int[] arr, int ele){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == ele){
                return i;
            }
        }
        return -1;
    }
}

class Main{
    public static void main( String[] args ) {
        int[] a = {5, 4, 1, 2};

        int n = a.length;

        System.out.println(new MinimumNumberSwaps().minSwaps(a, n));
    }
}