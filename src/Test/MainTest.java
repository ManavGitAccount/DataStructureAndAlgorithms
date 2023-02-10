package Test;

import Test.OOPS.PickOne;
import Test.OOPS.TestX;
import Test.OOPS.TestY;

public class MainTest {
    public static void main( String[] args ) {
        PickOne pickOne;

        pickOne = new TestX();
        pickOne.TestMethodOne();

        pickOne = new TestY();
        pickOne.TestMethodOne();
    }
}
