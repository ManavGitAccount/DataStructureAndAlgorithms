package SortingAlgorithms.LBP.ArrayProblems.Medium.FindElementsThatAppearMoreThanNByK;

import java.util.HashMap;
import java.util.Map;

public class TestClass {

    public static void morethanNdK(int a[], int n, int k){
        int x = n/k;

        //HashMap to count the frequency of each element
        HashMap<Integer, Integer> mapFrequency = new HashMap<>();

        for(int i = 0; i<n; i++){
            if(!mapFrequency.containsKey(a[i])){
                mapFrequency.put(a[i], 1);
            }
            else{
                int count = mapFrequency.get(a[i]);
                mapFrequency.put(a[i], count + 1);
            }
        }

        for(Map.Entry m : mapFrequency.entrySet()){
            Integer temp = (Integer)m.getValue();
            if(temp > x){
                System.out.println(m.getKey());
            }

        }
    }

    public static void main( String[] args ) {
        int a[] = {1, 1, 2, 2, 3, 5, 4,2, 2, 3, 1, 1, 1};

        int n = a.length;
        int k = 6;
        morethanNdK(a, n, k);
    }
}
