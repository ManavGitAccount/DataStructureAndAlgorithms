package SortingAlgorithms.LoveBabbarCodePuzzles.SortingProblems.Easy.FirstAndLast.AdjacentElementsDifferByK;

class AdjacentElementDiffer {

    private AdjacentElementDiffer(){}


    // x is the element to be searched in arr[0..n-1] such that all
    // elements differ by at-most k.
    public static int search(int arr[], int n, int x, int k){

        // Traverse the given array starting
        // from leftmost element
        int i = 0;

        while(i<n){

            // If x is found at index i
            if(arr[i] == x){
                return i;
            }

            // Jump the difference between current array element and x divided by k We use max here
            // to make sure that i move at-least one step ahead.
            i = i + Math.max(1, Math.abs(arr[i]-x)/k);
        }

        System.out.println("number is not present");
        return -1;
    }

    // Driver program to test above function
    public static void main(String[] args)
    {

        int arr[] = {20, 40, 50, 70, 70, 60};
        int k = 20;
        int x = 70;
        int n = arr.length;

        System.out.println("Element " + x +
                " is present at index "
                + search(arr, n, x, k));
    }
}

