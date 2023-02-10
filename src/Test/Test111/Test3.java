package Test.Test111;

public class Test3 {
    public static void main( String[] args ) {

            int a[] = {1, 2, 3, 4, 5, 6, 7};

            int i = 0;
            int j = 0;

            for(i=0; i<a.length; i++){
                System.out.print(a[i] + "   ");
            }
            System.out.println();

             System.out.println("length of an array " + a.length);


            for(j=a.length-1; j>=0; j--){
                System.out.print(a[j] + "   ");
            }
    }
}
