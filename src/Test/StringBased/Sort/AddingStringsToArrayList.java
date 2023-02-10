package Test.StringBased.Sort;

import java.util.ArrayList;
import java.util.Collections;

public class AddingStringsToArrayList {

    public static void main( String[] args ) {
        String arr[] = {"this", "that", "for", "him", "her"};

        ArrayList<String> arrList = new ArrayList<>();

        for(String a1 : arr){
            arrList.add(a1);
        }
        Collections.sort(arrList);

        System.out.println(arrList);
    }
}
