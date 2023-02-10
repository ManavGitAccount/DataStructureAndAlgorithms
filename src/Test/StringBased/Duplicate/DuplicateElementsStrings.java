package Test.StringBased.Duplicate;

public class DuplicateElementsStrings {

    public static void main( String[] args ) {
        String s = "nameofthestring";

        char arr[] = s.toCharArray();


        for(int i = 0; i <arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println("Duplicate Elm : " + arr[i]);
                }
            }
        }

    }
}
