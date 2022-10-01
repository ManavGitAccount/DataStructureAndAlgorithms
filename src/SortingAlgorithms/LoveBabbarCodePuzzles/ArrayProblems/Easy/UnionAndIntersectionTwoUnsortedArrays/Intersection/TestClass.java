package SortingAlgorithms.LoveBabbarCodePuzzles.ArrayProblems.Arrays.UnionAndIntersectionTwoUnsortedArrays.Intersection;

import java.util.HashSet;

public class TestClass {

    static void printUnion(int arr1[], int arr2[]){

        HashSet<Integer> hs = new HashSet<>();

        for(int i= 0; i<arr1.length; i++){
            hs.add(arr1[i]);
        }

        for(int i= 0; i<arr2.length; i++){
            hs.add(arr2[i]);
        }

        System.out.println(hs);
    }

    static void printIntersection(int arr1[], int arr2[]){
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i=0; i< arr1.length; i++){
            hs.add(arr1[i]);
        }

        for( int i=0; i<arr2.length; i++){
            if(hs.contains(arr2[i])){
                hashSet.add(arr2[i]);
            }
        }

        System.out.println("This is the intersection of elements : " + hashSet);
    }

    public static void main( String[] args ) {
        int arr1[] = { 101, 43, 56, 78, 90, 7, 1, 5, 2, 3, 6 };
        int arr2[] = { 34, 56, 12, 101, 78, 903, 8, 6, 20, 7 };

        // Function call
        System.out.println("Union of two arrays is : ");
        printUnion(arr1, arr2);

        System.out.println();
        System.out.println(
                "Intersection of two arrays is : ");
        printIntersection(arr1, arr2);

    }
}
