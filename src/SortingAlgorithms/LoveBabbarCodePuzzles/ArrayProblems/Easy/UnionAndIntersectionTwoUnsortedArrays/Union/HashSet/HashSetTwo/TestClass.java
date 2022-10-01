package SortingAlgorithms.LoveBabbarCodePuzzles.ArrayProblems.Arrays.UnionAndIntersectionTwoUnsortedArrays.Union.HashSet.HashSetTwo;

import java.util.HashSet;
import java.util.Set;

public class TestClass {

    static void getUnion(int a[], int n, int b[], int m){

        //find min of n and m
        int min = (n<m) ? n:m;

        //set container
        Set<Integer> set = new HashSet<>();

        // add elements from both the arrays from index 0 to min(n,m)-1
        for(int i=0; i<min; i++){
            set.add(a[i]);
            set.add(b[i]);
        }

        //add remaining elements to the set from the other array
        // only one of the loops will execute because we would have already added all
        // the elements from one array. The left out array will be used to add element
        if(n>m){
            for(int i=m; i<n; i++){
                set.add(a[i]);
            }
        }
        else{
            for(int i=n; i<m; i++){
                set.add(b[i]);
            }
        }
        System.out.print("Number of elements after union operation: " + set.size() + "\n");
        System.out.print("The union set of both arrays is : " + "\n");
        System.out.print(set.toString() + "  ");
    }

    public static void main( String[] args ) {
        int a[] = { 1, 2, 0 , 47, 5, 6, 2, 3, 5, 7, 3 };
        int b[] = { 2, 4, 5, 6, 8, 9, 4, 6, 5, 4 };

        getUnion(a, a.length, b, b.length);
    }

}
