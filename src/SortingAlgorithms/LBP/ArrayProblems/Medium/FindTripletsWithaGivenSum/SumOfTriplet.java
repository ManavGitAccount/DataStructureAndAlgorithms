package SortingAlgorithms.LBP.ArrayProblems.Medium.FindTripletsWithaGivenSum;

public class SumOfTriplet {

    public boolean findTriplets(int a[], int n, int sum){

        int l, r;

        //Fix the first element as A[i]
        for(int i=0; i<n-2; i++){
            for(int j = i+1; j<n-1; j++){
                for(int k=i+1; k<n; k++){
                    if(a[i]+a[j]+a[k] == sum){
                        System.out.print("Triplet is : " + a[i] +
                                ", " + a[j] + ", " + a[k]);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String args[]){

        SumOfTriplet sumOfTriplet = new SumOfTriplet();
        int A[] = {1, 4, 45, 6, 10, 8};
        int sum = 2;
        int arr_size = A.length;

        sumOfTriplet.findTriplets(A, arr_size, sum);
    }
}
