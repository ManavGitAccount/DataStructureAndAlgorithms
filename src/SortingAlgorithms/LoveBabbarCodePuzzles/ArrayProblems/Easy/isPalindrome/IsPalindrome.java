package SortingAlgorithms.LoveBabbarCodePuzzles.ArrayProblems.Arrays.isPalindrome;

public class IsPalindrome {

    static boolean isPalindrome(int N){

        String str = "" + N;
        int len = str.length();
        for(int i=0; i<len/2; i++){
            if(str.charAt(i) != str.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }

    // Function to check
    // if an array is PalinArray or not
    static boolean isPalindrome(int [] arr, int n){
        // Traversing each element of the array
        // and check if it is palindrome or not
        for(int i=0; i<n; i++){
            boolean ans = isPalindrome(arr[i]);
            if(ans == false){
                return false;
            }
        }
        return true;
    }

    // Driver Code
    public static void main( String[] args ) {

        int[] arr = {121, 131, 20};

        int n= arr.length;

        boolean result = isPalindrome(arr, n);
        if(result == true){
            System.out.println("Array is palindrome");
        }
        else{
            System.out.println("Array is NOT a palindrome");
        }
    }
}
