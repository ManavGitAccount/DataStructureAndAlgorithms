package SortingAlgorithms.LBP.ArrayProblems.Medium.RearrangeArrayIntoAlternatePositiveNegative;

public class RearrangeNegativePositive {

    public static void rearrange(int arr[], int n){

        int i = 0;
        int j = n -1;

        //Shift all negative elements to the end
        while(i<j){
            while(i<=n-1 && arr[i] > 0){
                i++;
            }
            while(j>=0 && arr[j] < 0){
                j--;
            }
            if(i<j){
                swap(arr, i,j);
            }
        }

        if(i==0 || j ==0){
            return;
        }

        int k = 0;

        //position all the elements alternatively
        while(k<n && i<n){
            swap(arr, k, i);
            i++;
            k = k+2;
        }
    }

    private static void swap(int[] a, int i, int j ) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    public static void printArray(int []a, int n){

        System.out.println();

        for(int i=0; i<n; i++){
            System.out.printf( a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        RearrangeNegativePositive rearrange = new RearrangeNegativePositive();
        /* int arr[n] = {-5, 3, 4, 5, -6,
                         -2, 8, 9, -1, -4};
        int arr[] = {-5, -3, -4, -5, -6,
                     2 , 8, 9, 1 , 4};
        int arr[] = {5, 3, 4, 2, 1,
                     -2 , -8, -9, -1 , -4};
        int arr[] = {-5, 3, -4, -7,
                     -1, -2 , -8, -9, 1 , -4};*/
        int arr[] = { -3, -2, -1, 1, 2, 3 };
        int n = arr.length;

        System.out.println("Given array is ");
        rearrange.printArray(arr, n);

        rearrange.rearrange(arr, n);

        System.out.println("RearrangeD array is ");
        rearrange.printArray(arr, n);
    }
}

