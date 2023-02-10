package SortingAlgorithms.LBP.ArrayProblems.Easy.UnionIntersection.Union.HashSet;

import java.util.HashSet;

public class TestClass {

    static void getUnion(int [] a, int n, int b[], int m){

        //Defining Set Container S
        HashSet<Integer> hs = new HashSet<>();

        //Inserting array element in s
        for(int i=0; i<n; i++){
            hs.add(a[i]);
        }

        for(int j=0; j<m; j++){
            hs.add(b[j]);
        }

        System.out.print("Number of elements after union operation: " + hs.size() + "\n");
        System.out.print("The union set of both arrays is : " + "\n");
        System.out.print(hs.toString() + "  ");

    }

    public static void main( String[] args ) {

        int a[] = {1, 2, 3, 4, 5, 5, 2, 3, 1, 3, 8, 7};
        int b[] = {2, 2, 3, 5, 0,6, 7,14, 5, 7};

        getUnion(a,a.length, b, b.length);
    }
}
