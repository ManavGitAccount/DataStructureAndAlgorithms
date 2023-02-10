package Test.StringBased.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingOfStringsArrayToList {


    public static List sort(String[] arr){

        List arrList = Arrays.asList(arr);

        //System.out.println("Initial List : " + arrList);
        Collections.sort(arrList);

        return arrList;

    }

    public static void main( String[] args ) {
        String array[] = {"first", "xor", "yale", "second", "third", "fourth"};


        System.out.println("List after Sorting : " + sort(array));

    }
}
