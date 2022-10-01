package SortingAlgorithms.LoveBabbarCodePuzzles.SortingProblems.Medium.CountTripletsSum;

public class CountTripletsSum {

    private CountTripletsSum(){}

    static int arr[] = new int[]{5, 1, 3, 4, 7};

    public static int countTriplets(int n, int sum){

        //Initialize result
        int ans = 0;

        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k = j+1; k<n; k++){
                    if(arr[i] + arr[j] + arr[k] < sum){
                        System.out.println("{" + arr[i] + "," + arr[j] + "," + arr[k] + "}");
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    // Driver method to test the above function
    public static void main(String[] args)
    {
        int sum = 10;
        System.out.println(countTriplets(arr.length, sum));
    }
}
