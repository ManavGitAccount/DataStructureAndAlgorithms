package Test.OOPS;

import Test.AbsOne;

public class AbsImplOne extends AbstractOne{

    public int subadd(int a, int b){
        return a + b;
    }
    public static void main( String[] args ) {
        AbstractOne absOne = new AbsImplOne();
        absOne.superadd(5,6);

        AbsImplOne implOne = new AbsImplOne();
        //implOne.
    }
}
