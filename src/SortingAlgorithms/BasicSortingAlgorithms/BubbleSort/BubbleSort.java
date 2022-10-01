package SortingAlgorithms.BubbleSort;

import java.util.Scanner;

public class BubbleSort {

    public static void Sort(int a[], int n){

        int temp,swaps;
        for(int x = n-2; x>=0; x--){
            swaps = 0;
            for(int j=0; j<=x ; j++){
                if(a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swaps++;
                }
            }
            if(swaps == 0){
                break;
            }
        }
    }

    public static void main(String args[]){

        int[] a = new int[20];

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of elements : ");
        int n = scan.nextInt();

        for(int i = 0 ; i <n ; i++){
            System.out.print("Enter element " + (i+1) + " : ");
            a[i] = scan.nextInt();
        }

        Sort(a, n);

        System.out.print("Sorted array is : ");
        for(int i=0; i<n ; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        scan.close();

    }
}
