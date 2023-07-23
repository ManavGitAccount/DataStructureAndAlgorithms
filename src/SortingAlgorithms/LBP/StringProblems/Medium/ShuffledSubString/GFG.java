package SortingAlgorithms.LBP.StringProblems.Medium.ShuffledSubString;// Java program to check if String
// str1 is subString of str2 or not.
import java.util.*;

class GFG
{

    // Function two check String A is shuffled subString of B or not
    static boolean isShuffledSubString(String A, String B)
    {
        int n = A.length();
        int m = B.length();

        // Return false if length of String A is greater than length of String B
        if (n > m)
        {
            return false;
        }
        else
        {
            // Sort String A
            A = sort(A);

            // Traverse String B
            for (int i = 0; i < m; i++)
            {
                // Return false if (i + n - 1 >= m) doesn't satisfy
                if (i + n - 1 >= m)
                    return false;

                // Initialise the new String
                String str = "";

                // Copy the characters of String B in str till length n
                for (int j = 0; j < n; j++)
                     str += B.charAt(i + j);

                // Sort the String str
                str = sort(str);

                // Return true if sorted String of "str" & sorted String of "A" are equal
                if (str.equals(A))
                    return true;
            }
        }
        return false;
    }

    // Method to sort a string alphabetically
    static String sort(String inputString)
    {
        // convert input string to char array
        char tempArray[] = inputString.toCharArray();

        // sort tempArray
        Arrays.sort(tempArray);

        // return new sorted string
        return String.valueOf(tempArray);
    }

    // Driver Code
    public static void main(String[] args)
    {
        // Input str1 and str2
        String str1 = "onetwofour";
        String str2 = "hellofourtwooneworld";

        // Function return true if str1 is shuffled subString of str2
        boolean a = isShuffledSubString(str1, str2);

        // If str1 is subString of str2 print "YES" else print "NO"
        if (a)
            System.out.print("YES");
        else
            System.out.print("NO");
        System.out.println();
    }
}

