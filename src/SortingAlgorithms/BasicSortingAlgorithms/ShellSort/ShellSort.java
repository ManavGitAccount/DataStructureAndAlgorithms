package SortingAlgorithms.BasicSortingAlgorithms.ShellSort;

import java.util.Scanner;

public class ShellSort {
    public static void Sort(int[] a, int n){
        int i,j, h, temp;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter maximum increment (odd value) : ");
        h = scan.nextInt();

        while(h>=1){
            for(i=h; i<n; i++){
                temp = a[i];
                for(j=i-h; j>=0 && a[j] > temp; j=j-h){
                    a[j+h] = a[j];
                }
                a[j+h] = temp;
            }
            h = h-2;
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
