package SortingAlgorithms.LBP.ArrayProblems.Hard.CountInversion;

public class CountInversion {

    static int arr[] = new int[] {8, 4, 2, 1};

    static int getInvCount(int n)
    {
        int inv_count = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[i] > arr[j])
                    inv_count++;

        return inv_count;
    }

    static void getInvCountTwo(int n){
        int inv_count = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[i] > arr[j])
                    System.out.println("{" + arr[i]+ ", " +  arr[j] + "}");
    }

    // Driver method to test the above function
    public static void main(String[] args)
    {
        System.out.println("Number of inversions are "
                + getInvCount(arr.length));

       // getInvCountTwo(arr.length);
    }


}
