package Test.OOPS;

public class TestB extends TestA{

    public TestB( int x, int y ) {
        super(x, y);
    }

    @Override
    public void show(){
        super.show();
        System.out.println("This is B");
    }

    public static void main( String[] args ) {
        TestB b = new TestB(45, 90);
        TestA a = new TestA(23, 55);

        a.MethodAbstract();

        b.show();
        b.setZ(400);
        System.out.println(b.getZ());
    }
}
