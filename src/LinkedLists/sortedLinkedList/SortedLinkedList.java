package LinkedLists.sortedLinkedList;
import java.util.Scanner;

public class SortedLinkedList {
    private Node start;

    public SortedLinkedList(){
        start = null;
    }

    public void displayList() {
       Node p;
        if(start == null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("List is : ");
        p = start;
        while(p != null){
            System.out.print(p.info + " -->");
            p = p.link;
        }
        System.out.print("null");
    }
    public void insertInOrder(int data){
        Node temp = new Node(data);

        /**
        List is empty or the new node has to be inserted as the first node
         */
        if(start==null || data < start.info){
            temp.link = start;
            start = temp;
            return;
        }

        Node p = start;
        while(p.link != null && p.link.info <= data){
            p = p.link;
        }
        temp.link = p.link;
        p.link = temp;
    }

    public void createList(){
        int i, n, data;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of nodes : ");
        n = scan.nextInt();

        if(n == 0){
            return;
        }

        for(i = 1; i<=n; i++){
            System.out.print("Enter the element to be inserted : ");
            data = scan.nextInt();
            insertInOrder(data);
        }
    }

    public void search(int x){

        if(start == null){
            System.out.print("List is empty");
            return;
        }

        Node p = start;
        int position = 1;
        while (p !=null && p.info <= x){
            if(p.info == x){
                break;
            }
            position ++;
            p = p.link;
        }
        if (p == null || p.info != x){
            System.out.println(x + " not found in list ");
        }
        else{
            System.out.println(x + "is at position" + position);
        }
    }

}
