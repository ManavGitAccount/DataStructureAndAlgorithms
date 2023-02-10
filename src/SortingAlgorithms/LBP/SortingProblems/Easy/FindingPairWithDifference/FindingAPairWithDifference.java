package SortingAlgorithms.LBP.SortingProblems.Easy.FindingPairWithDifference;

public class FindingAPairWithDifference {

    static boolean findPair(int arr[], int n){

        int size = arr.length;

        // Initialize the two elements
        int i= 0, j=1;

        //Search for a pair
        while(i < size && j <size){
            if((i !=j) && (arr[j] -arr[i] == n || arr[i] -arr[j] == n)){

                System.out.println("Pair Found: " +
                        "(" + arr[i] + ", " + arr[j] + ")");

                return true;
            }
            else if(arr[j] - arr[i] < n){
                j++;
            }
            else
                i++;
        }

        System.out.println("No such pair");
        return false;
    }

    public static void main( String[] args ) {
        int arr[] = {1, 8, 30, 100, 160};
        int n = -60;
        findPair(arr, n);
    }
}
