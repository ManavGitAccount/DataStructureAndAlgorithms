package SearchingAlgorithms.BinarySearch;

import java.util.Scanner;

public class BinarySearch {

    private BinarySearch(){}

    public static int bsearch(int[] a, int n, int searchValue){

        int first=0, last =n-1, mid;

        while(first<=last){
            mid = (first+last)/2;
            System.out.print("mid -->" + mid + " ," + a[mid]);
            if(searchValue < a[mid]){
                last = mid-1;
            }
            else if(searchValue > a[mid]){
                first = mid + 1;
            }
            else
                return mid;
        }
        return -1;
    }

    public static void main( String[] args ) {

        int i, n, searchValue, index;
        int[] a = new int[20];

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of elements : ");
        n = scan.nextInt();

        System.out.print("Enter the elements in sorted order : ");
        for(i=0; i<n; i++){
            a[i] = scan.nextInt();
        }

        System.out.print("Enter the search value ");
        searchValue = scan.nextInt();

        index = bsearch(a, n, searchValue);

        if(index == -1){
            System.out.println("Value " + searchValue + " item not present in the array");
        }
        else{
            System.out.println("Value " + searchValue + "present at index " + index);
        }

    }
}
