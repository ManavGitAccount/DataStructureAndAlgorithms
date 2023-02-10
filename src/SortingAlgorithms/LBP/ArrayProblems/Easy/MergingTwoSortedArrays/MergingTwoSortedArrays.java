package SortingAlgorithms.LBP.ArrayProblems.Easy.MergingTwoSortedArrays;

import java.util.Scanner;

public class MergingTwoSortedArrays {

    private MergingTwoSortedArrays(){}

    public static void MergeSortedArrays(int[] a1, int[] a2, int[] temp, int n1, int n2){
        int i=0,j=0,k=0;

        while((i<n1-1) && (j<n2-1)){
            if(a1[i] < a2[j]){
                temp[k++] = a1[i++];
            }
            else{
                temp[k++] = a2[j++];
            }
        }

        while(i<n1-1){
            temp[k++] = a1[i++];
        }

        while(j<n2-1){
            temp[k++] = a2[j++];
        }
    }

    public static void main(String[] args) {
        int i, n1, n2;
        int[] a1 = new int[10];
        int[] a2 = new int[10];
        int[] temp = new int[20];

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of elements in a1: ");
        n1 = scan.nextInt();
        System.out.println("Enter elements in sorted order: ");
        for(i=0; i<n1 ; i++){
            System.out.print("Enter element " + (i+1) + " : ");
            a1[i] = scan.nextInt();
        }

        System.out.print("Enter the number of elements in a2: ");
        n2 = scan.nextInt();
        System.out.println("Enter elements in sorted order: ");
        for(i=0; i<n2 ; i++){
            System.out.print("Enter element " + (i+1) + " : ");
            a2[i] = scan.nextInt();
        }

        MergeSortedArrays(a1, a2, temp, n1, n2);

        System.out.println("Merge Sorted Array is : ");
        for(i=0; i<n1+n2; i++){
            System.out.print(temp[i] + " ");
        }
        System.out.println();
        scan.close();
    }
}
