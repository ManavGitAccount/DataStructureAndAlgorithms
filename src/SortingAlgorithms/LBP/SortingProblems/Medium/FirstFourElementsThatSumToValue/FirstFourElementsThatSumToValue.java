package SortingAlgorithms.LBP.SortingProblems.Medium.FirstFourElementsThatSumToValue;

public class FirstFourElementsThatSumToValue {

    public static void sumValueOfFourElements(int [] a, int X){

        int n = a.length;

        for(int i= 0; i<n-3; i++){
            for(int j = i+1; j<n-2; j++){
                for(int k = j+1; k < n-1; k++){
                    for(int l = k+1; l<n; l++){
                        if(a[i] + a[j] + a[k] + a[l] == X){
                            System.out.print(a[i] + "  " + a[j]+
                                    "   " + a[k] + "    " + a[l]);
                        }
                    }
                }
            }
        }
    }

    public static void main( String[] args ) {
        int arr[] = {10, 20, 30, 40, 1, 2};
        int X = 91;
        sumValueOfFourElements(arr, X);
    }
}
