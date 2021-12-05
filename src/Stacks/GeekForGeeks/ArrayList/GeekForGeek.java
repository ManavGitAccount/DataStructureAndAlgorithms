package Stacks.GeekForGeeks.ArrayList;

public class GeekForGeek {
    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(5);
        st.push(10);
        st.push(20);
        System.out.println(st.pop());
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
    }
}
