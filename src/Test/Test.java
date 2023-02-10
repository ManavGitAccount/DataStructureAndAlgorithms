package Test;

public class Test {

    public static void main( String[] args ) {

      int[]  a = new int[]{1, 2, 3, 4, 5, 6, 2, 3, 1};
      System.out.print("Duplicate Element : ");
      for(int i = 0; i<a.length; i++){
          for(int j= i+1; j<a.length; j++ ){
              //System.out.println(a[j] + "j : ");
              if(a[i] == a[j]){

                  System.out.print( a[i] + ", ");
              }
          }
      }
    }
}
