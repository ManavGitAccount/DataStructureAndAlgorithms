package SortingAlgorithms.QuickSort;

import java.util.Scanner;
//https://www.youtube.com/watch?v=UA_Rmjfj4bw

public class QuickSort {

    private QuickSort(){}

    public static void sort(int[] a, int n){
        sort(a,0, n-1);
    }

    private static void sort( int[] a, int low, int up) {
        if(low>=up){
            return;
        }

        int p = partition(a, low, up);
        sort(a, low, p-1);
        sort(a, p+1, up);

    }

    private static int partition( int[] a, int low, int up ) {

        int temp, i, j, pivot;

        pivot = a[low];

        i = low+ 1;
        j = up;

        while(i<=j){
            while(a[i] < pivot && i < up) {
                i++;
            }
            while(a[j] > pivot) {
                j--;
            }

            if(i<j){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
            else
                break;
        }
        a[low] = a[j];
        a[j] = pivot;

        return j;
    }

    public static void main(String args[]){
        int i,n;
        int[] a = new int[20];
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of elements : ");
        n = scan.nextInt();

        for(i=0; i<n; i++){
            System.out.print("Enter element " + (i+1) + " : ");
            a[i] = scan.nextInt();
        }

        sort(a,n);

        System.out.print("Sorted array is : ");
        for(i=0 ; i<n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        scan.close();
    }
}
