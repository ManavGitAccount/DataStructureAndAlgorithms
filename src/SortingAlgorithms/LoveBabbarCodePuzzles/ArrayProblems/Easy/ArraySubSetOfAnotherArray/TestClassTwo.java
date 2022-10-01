package SortingAlgorithms.LoveBabbarCodePuzzles.ArrayProblems.ArraySubSetOfAnotherArray;

public class TestClassTwo {

    static boolean isSubset(int a[], int b[])
    {
        int i = 0;
        int j= 0;
        int k = 0;

        for(i=0; i<a.length;i++){
            for(j=0;j<b.length;j++){
                if(a[i] == b[j]){
                    return true;
                }
            }
        }

        return false;
    }

    public static void main( String[] args ) {
        int arr1[] = {10, 5, 2, 23, 19};
        int arr2[] = {19, 5, 3} ;

        if(isSubset(arr1, arr2)){
            System.out.println("arr2 is a subset of arr1");
        }
        else{
            System.out.println("arr2 is not a subset of arr1");
        }
    }
}
