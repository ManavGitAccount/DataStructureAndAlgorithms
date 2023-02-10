package Test.StringBased.Sort;

import java.util.Locale;

public class SortAString {

    public static void main( String[] args ) {
        String inputString = "ManavRattan is learning";

        String newString = inputString.toLowerCase(Locale.ROOT);

        char arr[] = newString.toCharArray();

        char temp;
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[j] < arr[i]){
                    //temp stores m
                    temp = arr[i];

                    //m and a are swapped
                    arr[i] = arr[j];

                    // m is returned to it's new position
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr);
    }
}
