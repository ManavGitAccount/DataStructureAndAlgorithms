package Queue.Deque;

import java.util.NoSuchElementException;

public class DequeCircularArray {
    private int[] queueArray;
    private int front;
    private int rear;


    public DequeCircularArray(){
        this.queueArray = new int[10];
        this.front = -1;
        this.rear = -1;
    }

    public DequeCircularArray(int maxSize){
        this.queueArray = new int[maxSize];
        this.front = -1;
        this.rear = -1;
    }

    public void insertFront(int x){
        if(isFull()){
            System.out.println("Queue Overflow");
            return;
        }

        if(front == -1){
            front = 0;
            rear = 0;
        }
        else if(front == 0){
            front = queueArray.length-1;
        }
        else{
            front = front -1;
        }
        queueArray[front] = x;
    }

    public void insertRear(int x){
        if(isFull()){
            System.out.println("Queue Overflow");
            return;
        }
        if(front == -1){
            front = 0;
        }
        if(rear == queueArray.length-1){
            rear = 0;
        }
        else{
            rear = rear + 1;
        }
        queueArray[rear] = x;
    }

    public int deleteFront(){
        int x;
        if(isEmpty()){
            System.out.println("Queue Underflow");
            throw new NoSuchElementException();
        }
        x = queueArray[front];

        if(front == rear){
            front = -1;
            rear = -1;
        }
        else if(front == queueArray.length - 1){
            front = 0;
        }
        else{
            front = front +1;
        }
        return x;
    }

    public int deleteRear(){
        int x;
        if(isEmpty()){
            System.out.println("Queue Underflow");
            throw new NoSuchElementException();
        }

        x = queueArray[rear];

        if(front == rear){
            front = -1;
            rear = -1;
        }
        else if (rear == 0){
            rear = queueArray.length-1;
        }
        else
            rear = rear -1;
        return x;
    }

    public boolean isFull(){
        return ((front == 0 && rear == queueArray.length-1) ||
                (front == rear + 1));
    }

    public boolean isEmpty(){
        return (front == -1);
    }

    public void display(){
        int i;
        if(isEmpty()){
            System.out.println();
            return;
        }
        
    }
}
