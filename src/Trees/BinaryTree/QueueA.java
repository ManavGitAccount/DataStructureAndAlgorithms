//package Trees;
//
//
//import java.util.NoSuchElementException;
//
//public class QueueA {
//
//    private Node front;
//    private Node rear;
//    public Node link;
//
//    public QueueA(){
//        front = null;
//        rear = null;
//    }
//
//    public int size(){
//        int s = 0;
//        Node p = front;
//        while(p!=null){
//            s++;
//            p=p.link;
//        }
//        return s;
//    }
//
//    public void insert(Node x){
//        Node temp;
//        temp = new Node(x);
//        if(front == null){
//            front = temp;
//        }
//        else {
//            rear.link = temp;
//        }
//        rear = temp;
//    }
//
//    public Node delete(Node p){
//        if(isEmpty()){
//            System.out.println("Queue Underflow");
//            throw new NoSuchElementException();
//        }
//        p = front;
//        front = front.link;
//        return p;
//    }
//
//    public int peek(){
//
//        if(isEmpty()){
//            System.out.println("Queue underflow");
//            throw new NoSuchElementException();
//        }
//        return front.info;
//    }
//
//    boolean isEmpty() {
//        return (front == null);
//    }
//
//    public void display(){
//        Node p = front;
//        if (isEmpty()) {
//            System.out.println("Queue is empty");
//            return;
//        }
//        System.out.println("Queue is : ");
//        while(p != null){
//            System.out.println(p.info + " ->");
//            p = p.link;
//        }
//
//        System.out.println();
//    }
//}