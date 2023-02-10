package SortingAlgorithms.LBP.SortingProblems.Hard.KthElementOfTwoSortedArrays;

public class SortedElement {

    static int kth(int arr1[], int arr2[], int m, int n, int k){

        int sorted1[] = new int[m+n];
        int i = 0, j=0, d=0;

        while(i < m & j < n){

            if(arr1[i] < arr2[j]){
                sorted1[d++] = arr1[i++];
            }
            else{
                sorted1[d++] = arr2[j++];
            }
        }

        while(i<m){
            sorted1[d++] = arr1[i++];
        }
        while(j<m){
            sorted1[d++] = arr2[j++];
        }

        return sorted1[k-1];
    }

    public static void main( String[] args ) {
        int arr1[] = {12, 13, 18, 98, 109, 477};
        int arr2[] = {4, 14, 47, 50, 54, 87, 88, 100};
        int k = 9;
        System.out.println(kth(arr1 ,arr2, arr1.length, arr2.length, k));

    }
}
