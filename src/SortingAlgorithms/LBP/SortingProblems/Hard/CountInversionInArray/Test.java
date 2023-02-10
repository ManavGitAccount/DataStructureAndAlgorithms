package SortingAlgorithms.LBP.SortingProblems.Hard.CountInversionInArray;

public class Test {

    static int arr[] = new int[]{1, 20, 6, 4, 5, 0};

    static int getInvCount(int n){
        int inv_count = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] > arr[j]){
                    System.out.println("{" +arr[i] + ", " + arr[j] + "}");
                    inv_count++;
                }
            }
        }

        return inv_count;
    }

    public static void main( String[] args ) {
        System.out.println("number of inversions are : " +
                getInvCount(arr.length));
    }
}
