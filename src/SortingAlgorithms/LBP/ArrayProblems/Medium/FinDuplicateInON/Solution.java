package SortingAlgorithms.LBP.ArrayProblems.Medium.FinDuplicateInON;

public class Solution {
    public static void main(String args[])
    {
        int numRay[] = { 2, 3, 4, 2, 3, 7, 4};

        for (int i = 0; i < numRay.length; i++) {
            numRay[numRay[i] % numRay.length] = numRay[numRay[i] % numRay.length] + numRay.length;
        }

        System.out.println("The repeating elements are : ");
        for (int i = 0; i < numRay.length; i++) {
            if (numRay[i] >= numRay.length * 2) {
                System.out.println(i + " ");
            }
        }
    }
}
