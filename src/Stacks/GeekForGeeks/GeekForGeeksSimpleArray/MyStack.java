package Stacks.GeekForGeeks.GeekForGeeksSimpleArray;

public class MyStack {

    int arr[];
    int cap;
    int top;


    public MyStack(int c){
        top = -1;
        cap = c;
        arr = new int[cap];
    }

    public void push(int x){
        if(top==cap-1){System.out.println("Stack is full");return;}
        top++;
        arr[top]= x;
    }

    public int pop(){
        if(top==-1){System.out.println("Stack is Empty");return Integer.MIN_VALUE;}
        int x = arr[top];
        top--;
        return x;
    }

    public int peek(){
        return arr[top];
    }

    public int size(){
        return (top+1);
    }

    public boolean isEmpty(){
        return top==-1;
    }

}
