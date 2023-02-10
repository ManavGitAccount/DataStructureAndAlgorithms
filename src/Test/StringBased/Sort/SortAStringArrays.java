package Test.StringBased.Sort;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;

public class SortAStringArrays {

    public static String sortString(String inputString){

        String newInputString = inputString.toLowerCase(Locale.ROOT);
        char arr[] = newInputString.toCharArray();

        Arrays.sort(arr);

        return new String(arr);
    }


    public static void main( String[] args ) {
        String inputString = "ManavRattan is learning Java";

        System.out.println("Input String : " + inputString);
        System.out.println("Output Sorted String : " + sortString(inputString));
    }
}

