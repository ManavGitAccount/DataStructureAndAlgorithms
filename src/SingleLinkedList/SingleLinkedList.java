package SingleLinkedList;

import java.util.Scanner;

public class SingleLinkedList {
    
    private Node start;
    
    public SingleLinkedList(){
        this.start = null;
    }

    public void createList() {
         int i, n, data;

         Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of nodes : ");
        n = scan.nextInt();

        if(n==0){
            return;
        }

        for(i=1; i<=n; i++){
            System.out.println("Enter the number of elements to be inserted : ");
            data = scan.nextInt();
            insertAtEnd(data);
        }

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
            System.out.print(p.i + " -->");
            p = p.link;
        }
        System.out.print("null");
    }

    public void countNodes() {
    }

    public void searchData(int data) {
    }

    public void insertInBegining(int data) {

        Node temp = new Node(data);
        temp.link = start;
        start = temp;
    }

    public void insertAtEnd(int data) {
        Node p;
        Node temp = new Node(data);

        if(start == null){
            start = temp;
            return;
        }

        p = start;
        while (p.link != null){
            p = p.link;
        }

        p.link = temp;
    }

    public void insertAfter(int data, int x) {
        Node p = start;

        while(p!=null){
            if(p.i == x){
                break;
            }
            p = p.link;
        }

        if(p == null){
            System.out.println(x + " Not present in the list ");
        }
        else{
            Node temp = new Node(data);
            temp.link = p.link;
            p.link = temp;
        }
    }

    public void insertBefore(int data, int x) {

        Node p = start;
        Node temp;

        if(start == null){
            System.out.println("List is empty");
            return;
        }

        if(x == start.i){
            temp = new Node(data);
            temp.link = start;
            start = temp;
            return;
        }
        while(p!=null){
            if(p.link.i == x){
                break;
            }
            p = p.link;
        }
        if(p == null){
            System.out.println(x + " Not present in the list ");
        }
        else{
            temp = new Node(data);
            temp.link=p.link;
            p.link = temp;
        }

    }

    public void insertAtPosition(int data, int k) {
        Node temp;
        int i;

        if(k == 1){
            temp = new Node(data);
            temp.link = start;
            start = temp;
            return;
        }

        Node p = start;
        for(i=1; i<k-1 && p!= null; i++) {

            p = p.link;
        }
            if(p == null){
                System.out.println(" You can insert only upto " + i + "th position");
            }
            else{
                temp = new Node(data);
                temp.link=p.link;
                p.link = temp;
            }

    }

    public void deleteFirstNode() {

        if(start == null){
            return;
        }
        start = start.link;
    }

    public void deleteLastNode() {

        if(start == null){
            return;
        }

        if(start.link == null){
            start = null;
            return;
        }

        Node p = start;
        while(p.link.link != null){
                p = p.link;
        }
        p.link = null;

    }

    public void deleteNode(int x) {
        if(start == null){
            System.out.println("List is empty\n");
            return;
        }
        if (start.i == x){
            start = start.link;
            return;
        }

        Node p = start;
        while(p.link != null){
            if(p.link.i == x){
                break;
            }
            p = p.link;
        }

        if(p.link == null){
            System.out.println("Element " + x + "not in list ");
        }
        else
            p.link = p.link.link;
    }

    public void reverseList() {
        Node prev,p,next;
        prev = null;
        p = start;

        while(p != null){
            next = p.link;
            p.link = prev;
            prev = p;
            p = next;
        }
        start = prev;
    }

    /**
     * The quick sort is being performed by sorting the data, which we refer by info.
     */
    public void bubbleSortExData() {

        //Here we take 3 references
        Node end,p,q;

        //outer for loop. Goes from last element to first.
        for(end=null; end!= start.link; end=p){
            for(p=start; p.link != end; p=p.link ){

                q = p.link;
                if(p.i > q.i){
                    int temp = p.i;
                    p.i = q.i;
                    q.i = temp;
                }
            }
        }

    }

    /**
     * The quick sort is being performed by sorting the links, which we refer by info.
     */
    public void bubbleSortExLinks() {

        //Here we have 5 Node references
        Node end, r, p, q, temp;

        for(end=null; end!=start.link ; end=p){
            for(r=p=start; p.link!=end; r=p,p=p.link){
                q = p.link;
                if(p.i > q.i){
                    p.link = q.link;
                    q.link =p;
                    if(p!=start){
                        r.link = q;
                    }
                    else{
                        start = q;
                    }
                    temp = p;
                    p = q;
                    q = temp;
                }
            }
        }
    }

    public void mergeSort() {
    }

    public void insertCycle(int data) {
        if(start == null){
            return;
        }

        Node p = start, px = null, prev = null;

        while(p!=null){
            if(p.i == data){
                px = p;
            }
            prev = p;
            p = p.link;
        }

        if(px != null){
            prev.link = px;
        }
        else{
            System.out.println(data + "not present in list");
        }
    }

    public boolean hasCycle() {

        if(findCycle() == null){
            return false;
        }
        return true;
    }

    private Node findCycle() {
        if (start == null || start.link == null) {
            return null;
        }

        Node slowR = start, fastR = start;
        while (fastR != null && fastR.link != null) {
            slowR = slowR.link;
            fastR = fastR.link.link;
            if (slowR == fastR) {
                return slowR;
            }

        }
        return null;
    }

    /**
     * To remove a cycle of the list we need to find the length
     * of the list.
     */
    public void removeCycle() {

        Node c = findCycle();
        if(c==null){
            return;
        }
        System.out.println("Node at which the cycle was detected is " + c.i);

        Node p =c, q = c;
        int lenCycle = 0;
        do{
            lenCycle++;
            q=q.link;
        }while(p!=q);
        System.out.println("Length of the cycle is : " + lenCycle);

        int lenRemList = 0;
        p = start;
        while(p!=q){
            lenRemList++;
            p = p.link;
            q = q.link;
        }
        System.out.println("NUmber of nodes not included in the cycle are: " + lenRemList);
        int lengthList = lenCycle + lenRemList;
        System.out.println("Length of the list is : " + lengthList);

        p = start;
        for(int i=1; i<=lengthList-1; i++){
            p = p.link;
        }
        p.link=null;
    }

    public void concatenate(SingleLinkedList list){

        if(start == null){
            start = list.start;
            return;
        }

        if(list.start == null){
            return;
        }

        Node p = start;

        while(p.link != null){
            p = p.link;
        }
        p.link = list.start;

    }
}
