package SortingAlgorithms.LBP.StringProblems.Medium.PrintAnagrams;

import java.util.*;

public class Anagram {

    // Utility function for
    // printing anagram list
    public static void printAnagram(Map<String, List<String>> store) {
        for (Map.Entry<String, List<String>> entry : store.entrySet()) {
            List<String> tempVec = entry.getValue();
            int size = tempVec.size();

            for (int i = 0; i < size; i++)
                 System.out.print(tempVec.get(i) + " ");

            System.out.println();
        }
    }

    // Utility function for storing the list of strings into HashMap
    public static void storeInMap(List<String> arr) {
        Map<String, List<String>> store = new HashMap<>();

        for (int i = 0; i < arr.size(); i++) {
            String tempString = arr.get(i);

            // sort the string
            char[] tempArr = tempString.toCharArray();
            Arrays.sort(tempArr);
            tempString = new String(tempArr);

            // make hash of a sorted string
            if (!store.containsKey(tempString))
                store.put(tempString, new ArrayList<>());
            store.get(tempString).add(arr.get(i));
        }

        // print utility function for printing all the anagrams
        printAnagram(store);
    }

    // Driver code
    public static void main(String[] args) {
        // initialize list of strings
        List<String> arr = new ArrayList<>();
        arr.add("geeksquiz");
        arr.add("geeksforgeeks");
        arr.add("abcd");
        arr.add("forgeeksgeeks");
        arr.add("zuiqkeegs");
        arr.add("cat");
        arr.add("act");
        arr.add("tca");

        // utility function for storing strings into hashmap
        storeInMap(arr);
    }
}