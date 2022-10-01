package SortingAlgorithms.LoveBabbarCodePuzzles.SortingProblems.Medium.SquareRootOfAnInteger;

public class SquareRootOfInteger {

    public static int floorSqrt(int x){

        // Base cases
        if (x == 0 || x == 1)
            return x;

        // Starting from 1, try all numbers until
        // i*i is greater than or equal to x.
        int i = 1, result = 1;

        // Interesting trick. This means that for a number like 3,
        // i gets incremented to 2. Result becomes 4 and therefore the loop is exited and we
        // return 2-1 = 1, which is the value of i-1
        while (result <= x) {
            i++;
            result = i * i;
        }
        return i - 1;
    }

    // Driver program
    public static void main(String[] args)
    {
        int x = 4;
        System.out.print(floorSqrt(x));
    }
}
