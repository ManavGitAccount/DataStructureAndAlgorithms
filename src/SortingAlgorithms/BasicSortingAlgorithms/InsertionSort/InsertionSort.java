package SortingAlgorithms.BasicSortingAlgorithms.InsertionSort;

import java.util.Scanner;

public class InsertionSort {

    public static void Sort(int[] a, int n){

        int i, j, temp;

        for(i=1; i<n; i++){
            temp = a[i];
            for(j=i-1; j>=0 && a[j]>temp; j--){
                a[j+1] = a[j];
            }
            a[j+1] = temp;

        }

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

        Sort(a,n);

        System.out.print("Sorted array is : ");
        for(i=0 ; i<n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        scan.close();
    }
}
