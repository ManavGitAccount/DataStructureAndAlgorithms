package SortingAlgorithms.LBP.SortingProblems.MaximumCountOfElement;

import java.util.HashMap;


// Basically we are creating a hash map that updates the map with array element, and the number of times
// that value has occurred.
public class MaximumCountUsingHashMap {

    private static void findMajority(int arr[]){

        //Created a new HashMap. IntegerCount and Integer. Both key and Value
        {
            HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();

            for(int i = 0; i < arr.length; i++) {
                if (map.containsKey(arr[i])) {
                    int count = map.get(arr[i]) +1;
                    if (count > arr.length /2) {
                        System.out.println("Majority found :- " + arr[i]);
                        return;
                    } else
                        map.put(arr[i], count);

                }
                else
                    map.put(arr[i],1);
            }
            System.out.println(" No Majority element");
        }

    }

    public static void main( String[] args ) {

        int a[] = {2,2,2,2,5,5,2,3,3,2};
        findMajority(a);

    }
}
