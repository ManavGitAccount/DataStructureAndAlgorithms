package Test.StringBased.Palindrome;

import java.util.Locale;

public class StringIsAPalindrome {

    public static boolean isPalindrome(String str){

        // Pointers pointing to the beginning
        // and to the end of the string
        int i = 0;
        int j = str.length()-1;

        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;

            }
            i++;
            j--;

        }
        return true;
    }

    public static void main( String[] args ) {
        String str = "Manav";

        str = str.toLowerCase(Locale.ROOT);

        if(isPalindrome(str)){
            System.out.println("It is a Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
