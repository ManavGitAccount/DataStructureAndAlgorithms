package LinkedLists.DoubleLinkedList;

import java.util.Scanner;

public class DoubleLinkedList {

    private Node start;

    public DoubleLinkedList(){
        start = null;
    }

    public void displayList(){

        Node p;

        if(start == null){
            System.out.println("List is empty");
            return;
        }

        p = start;
        System.out.println("List is :\n");
        while(p !=null){
            System.out.print(p.info + "--> ");
            p = p.next;
        }
        System.out.print("-->null");

    }

    public void createList() {
        int i, n, data;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of nodes : ");
        n = scan.nextInt();

        if(n==0){
            return;
        }

        System.out.print("Enter the first element to be inserted");
        data = scan.nextInt();
        insertInEmptyList(data);

        for(i=2; i<=n; i++){
            System.out.println("Enter the number of elements to be inserted : ");
            data = scan.nextInt();
            insertAtEnd(data);
        }
    }

    public void insertInEmptyList(int data) {
        Node temp = new Node(data);
        start = temp;
    }

    public void insertInBeginning(int data) {
        Node temp = new Node(data);
        temp.next = start;
        start.prev = temp;
        start = temp;
    }

    public void insertAtEnd(int data) {
        Node temp = new Node(data);

        Node p = start;
        while(p.next !=null){
            p = p.next;
        }
        p.next = temp;
        temp.prev = p;
    }

    public void insertAfter(int data, int x) {

        Node temp = new Node(data);
        Node p = start;
        while(p != null){
            if(p.info == x){
                break;
            }
            p = p.next;
        }
        if(p == null){
            System.out.println(x + "not present in the list");
        }
        else{
            temp.prev = p;
            temp.next = p.next;
            if(p.next != null){
                p.next.prev = temp;
            }
            else{
                p.next = temp;
            }
        }

    }

    public void insertBefore(int data, int x) {
        if(start == null){
            System.out.println("List is empty");
            return;
        }
        if(start.info == x){
            Node temp = new Node(data);
            temp.next = start;
            start.prev = temp;
            start = temp;
            return;
        }

        Node p = start;
        while(p!=null){
            if(p.info == x){
                break;
            }

            p = p.next;
        }
        if(p == null){
            System.out.println(x + "not present in the list");
        }
        else {
            Node temp = new Node(data);
            temp.prev = p.prev;
            temp.next = p;
            p.prev.next = temp;
            p.prev = temp;
        }
    }

    public void deleteFirstNode() {
        if(start ==null){
            return;
        }
        if(start.next == null){
            start = null;
            return;
        }
        start = start.next;
        start.prev = null;
    }

    public void deleteLastNode() {
        if(start == null){
            return;
        }
        if(start.next == null){
            start = null;
            return;
        }
        Node p = start;
        while(p.next !=null){
            p = p.next;
        }
        p.prev.next = null;
    }

    public void deleteNode(int data) {
        if(start == null){
            return;
        }
        if(start.next == null){
            if(start.info == data){
                start = null;
            }
            else{
                System.out.println(data + " not found ");
            }
            return;
        }

        Node p = start.next;
        while(p.next != null){
            if(p.info == data){
                break;
            }
            p = p.next;
        }
        if(p.next !=null){
            p.prev.next = p.next;
            p.next.prev = p.prev;
        }
        else
        {
            if(p.info == data){
                p.prev.next = null;
            }
            else
                System.out.println(data + "not found");
        }

    }

    public void reverseList() {
        if(start == null){
            return;
        }
         Node p1 = start;
        Node p2 = p1.next;
        p1.next = null;
        p1.prev = p2;
        while(p2 !=null){
            p2.prev = p2.next;
            p2.next = p1;
            p1=p2;
            p2 = p2.prev;
        }
        start = p1;
    }
}
