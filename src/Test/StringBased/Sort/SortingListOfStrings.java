package Test.StringBased.Sort;

import java.util.ArrayList;
import java.util.Collections;

//using collections.
public class SortingListOfStrings {
    public static void main( String[] args ) {

        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("Purple");
        arrList.add("Blue");
        arrList.add("Green");

        /* Collections.sort method is sorting the
        elements of ArrayList in ascending order. */
        Collections.sort(arrList);

        System.out.println("List after we sorted is: " + arrList);


    }
}
