package SortingAlgorithms.LBP.SortingProblems.MaximumCountOfElement;

public class FindMaximumCount {

    public static void findMajority(int arr[], int n) {

        int maxCount = 0;
        int index = -1;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    System.out.println("count of arr[i] " + arr[i] + " :" + count);
                }

                if (count > maxCount) {
                    maxCount = count;
                    index    = i;
                }
            }
        }
            if (maxCount > n / 2) {
                System.out.println(arr[index]);
            } else {
                System.out.println("No majority element");
            }
        }



    public static void main( String[] args ) {
        int arr[] = {1, 3, 3, 2, 4, 5, 3, 2, 3, 3, 3};
        int n= arr.length;
        findMajority(arr,n);
    }
}
