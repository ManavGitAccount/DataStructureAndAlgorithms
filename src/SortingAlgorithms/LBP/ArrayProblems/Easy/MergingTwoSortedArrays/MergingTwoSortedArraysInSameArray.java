package SortingAlgorithms.LBP.ArrayProblems.Easy.MergingTwoSortedArrays;

public class MergingTwoSortedArraysInSameArray {

    public static void mergeSameSortedArray(int a[], int temp[], int low1, int up1, int low2, int up2){

        int i = low1;
        int j = low2;
        int k = low1;

        while((i <= up1) && (j <= up2)) {
            if(a[i] <= a[j]){
                temp[k++] = a[i++];
            }
            else{
                temp[k++] = a[j++];
            }
        }

        while(i <= up1){
            temp[k++] = a[i++];
        }
        while(j <= up2){
            temp[k++] = a[j++];
        }
    }

    public static void main(String[] args) {
        int i;
        int[] a = {1, 3, 5, 7, 2, 4, 8, 11, 14};
        int [] temp = new int[15];


        mergeSameSortedArray(a, temp, 0, 3, 4, 8);

        System.out.print("Array a is : ");
        for(i = 0; i<=8; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.println("Merged array is : ");
        for(i=0; i<9; i++){
            System.out.print(temp[i] + " ");
        }
        System.out.println();

    }
}
