package Stacks.LinkedListImplementation;

import java.util.EmptyStackException;

public class StackLinkedList {

    private Node top;

    public StackLinkedList(){
        top = null;
    }

    public int size(){
        int x = 0;
        Node p = top;
        while(p != null){
            p = p.link;
            x++;
        }
        return x;
    }

    public void push(int x){
        Node temp = new Node(x);
        temp.link = top;
        top = temp;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            throw new EmptyStackException();
        }
        return top.info;
    }

    private boolean isEmpty() {
        return (top == null);
    }

    public int pop(){
        int x;
        if(isEmpty()){
            System.out.println("Stack Underflow");
            throw new EmptyStackException();
        }
        x= top.info;
        top = top.link;
        return x;
    }

    public void display(){

        Node p = top;
        if(isEmpty()){
            System.out.println("Stack Underflow");
            throw new EmptyStackException();
        }
        while(p != null){
            System.out.println(p.info + " ");
            p = p.link;
        }
        System.out.println();
    }

}
