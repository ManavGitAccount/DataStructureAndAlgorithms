package Stacks.GeekForGeeks.LinkedListImplementation;

public class MyStack {
    public Node head;
    public int size;

    public MyStack(){
        head = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return(head == null);
    }

    public void push(int x){
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
    }

    public int pop(){
        int res = head.data;
        head = head .next;
        size--;
        return res;
    }

    public int peek(){
        return head.data;
    }
}
