package DoubleLinkedList;

public class Node {

    public Node prev;
    public Node next;
    public int info;

    public Node(int i){
        this.info = i;
        this.prev = null;
        this.next = null;
    }
}
