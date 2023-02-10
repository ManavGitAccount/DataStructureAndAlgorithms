package Test.OOPS;

import Test.AbsOne;

public class TestA extends AbsOne implements PickOne {
    public int x;
    public int y;
    private int z;


    public TestA(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setZ(int z){
        this.z = z;
    }

    public int getZ(){
        z = x * y;
        return z;
    }
    public void show(){
        System.out.println("This is A");
        System.out.println(this.x + ", " + this.y);
    }

    private void functionOnlyofA(){
        System.out.println("No Child Can Use Me");
    }

    @Override
    public void TestMethodOne() {

    }

    @Override
    public void TestMethodTwo() {

    }
}
