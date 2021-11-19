package Stacks.PostFixNotation;

import java.util.EmptyStackException;

public class StackChar {

        private char[] stackArray;

        // Variable top will store the index of the top most element of the stack
        private int top;

        // Default constructor initialized to 10 array size and is empty as top points to -1
        public StackChar(){
            stackArray = new char[10];
            top = -1;
        }

        // One argument constructor takes the size of the array and creates one with
        // a specified size
        public StackChar(int maxSize){
            stackArray = new char[maxSize];
            top = -1;
        }

        // Returns the number of elements in the stack.
        public int size(){
            return top+1;
        }

        // Boolean method to return true if the stack is empty.
        public boolean isEmpty(){

            if(top == -1){
                return true;}
            else
                return false;
        }

        // Boolean method to return true if the stack is full.
        public boolean isFull(){
            if (top == stackArray.length -1){
                return true;
            }
            else
                return false;
        }

        // Method to enter/push a new element onto the stack
        public void push(char x){
            if(isFull()){
                System.out.println("Stack OverFlow");
                return;
            }
            top = top+1;
            stackArray[top] = x;
        }

        // Removes the top most element from the stack
        public char pop(){
            char x;
            if(isEmpty()){
                System.out.println("Stack Underflow");
                throw new EmptyStackException();
            }
            x = stackArray[top];
            top = top - 1;
            return x;
        }

        // Display the top most element
        public char peek(){
            if(isEmpty()){
                System.out.println("Stack Underflow");
                throw new EmptyStackException();
            }
            return stackArray[top];
        }

        //Display the stack
        public void display(){
            int i;
            if(isEmpty()){
                System.out.println("Stack is empty");
                return;
            }
            System.out.println("Stack is : ");
            for(i=top; i>=0; i--){
                System.out.println(stackArray[i] + " ");
            }
            System.out.println();
        }
}

