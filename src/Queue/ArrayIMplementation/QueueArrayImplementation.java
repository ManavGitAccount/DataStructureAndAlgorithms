package Queue.ArrayIMplementation;

import java.util.NoSuchElementException;

public class QueueArrayImplementation {

    private int[] queueArray;
    private int front;
    private int rear;

    public QueueArrayImplementation(){
        queueArray = new int[10];
        front = -1;
        rear = -1;
    }

    public QueueArrayImplementation(int maxSize) {
        queueArray = new int[maxSize];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty(){
        if(front == -1 || front == rear+1){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(rear == queueArray.length - 1){
            return true;
        }
        return false;
    }

    public int size(){
        if(isEmpty()){
            return 0;
        }
        return rear-front + 1;
    }

    public void insert(int x){
        if(isFull()){
            System.out.println("Queue Overflow");
            return;
        }
        if(front == -1){
            front = 0;
        }
        rear = rear + 1;
        queueArray[rear] = x;
    }

    public int delete(){

        int x;
        if(isEmpty()){
            System.out.println("Queue Underflow");
            throw new NoSuchElementException();
        }
        x = queueArray[front];
        front = front + 1;
        return x;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue Underflow\n");
            throw new NoSuchElementException();
        }
        return queueArray[front];
    }

    public void display(){

        int i;
        if(isEmpty()){
            System.out.println("Queue is Empty\n");
            return;
        }
        System.out.println("Queue is : \n\n");
        for(i = front; i<=rear; i++){
            System.out.println(queueArray[i] + " ");
        }
        System.out.println();
    }
}
