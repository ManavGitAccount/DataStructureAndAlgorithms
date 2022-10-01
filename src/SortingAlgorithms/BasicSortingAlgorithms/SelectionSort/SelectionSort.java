package SortingAlgorithms.SelectionSort;

import java.util.Scanner;

public class SelectionSort {

    public static void sort(int[] a, int n){
        int minIndex, temp;

        for(int i=0; i<n-1; i++){
            //We are assigning the min index to the very first element in the for loop
            minIndex = i;

            for(int j= i+1; j<n; j++){
                // comparing the first element here to the entire array basically.
                // if the next element in the array is less than what the min index is
                // then the position of the min index becomes to what j is pointing to.
                if(a[j] < a[minIndex]){
                    minIndex = j;
                }
            }
            // This is where the swapping happens.
            // Since we have located the minimum element. Now the temp becomes the element
            // at a[i] , and a[i] is pointed to the element which is the smallest one.
            // Finally, the array element which is at min index is pointed to the temp.
            if(i != minIndex){
                temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;

            }
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

        sort(a,n);

        System.out.print("Sorted array is : ");
        for(i=0 ; i<n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        scan.close();

    }
}
