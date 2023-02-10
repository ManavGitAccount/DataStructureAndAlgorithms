// A Simple Java program to reverse a string

package SortingAlgorithms.LBP.StringProblems.Easy.ReverseAString.Iterative;


public class ReverseStr {
    // Function to reverse a string
    void stringReverse()
    {
        String str = "geeksforgeeks";
        int length = str.length();
        StringBuffer revString = new StringBuffer();

        for (int i = length - 1; i >= 0; i--)
        {
            revString.append(str.charAt(i));
        }
        System.out.println(revString);
    }

    // Driver Code
    public static void main(String []args)
    {
        ReverseStr s= new ReverseStr();
        s.stringReverse();
    }
}
