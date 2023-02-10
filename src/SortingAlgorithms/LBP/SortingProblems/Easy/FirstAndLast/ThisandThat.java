package SortingAlgorithms.LBP.SortingProblems.Easy.FirstAndLast;

public class ThisandThat {
    public static void main( String[] args ) {
        int a[] = {4, 6, 5,3, 2,5, 4,5};
        int x = 5;
        for(int i=0; i<a.length; i++){
            if(x != a[i]){
                continue;
            }
            System.out.println(x);
        }
    }
}
