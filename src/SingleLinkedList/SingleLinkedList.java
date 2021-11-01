package SingleLinkedList;

import java.util.Scanner;

public class SingleLinkedList {

    // Using the Node class to build the linked list. Node has two elements. One is the data part and the other
    // is the referencing node which is the link. So when we build the list,we use the Nodes data and reference to
    // the other nodes to construct.
    private Node start;


    // SingleLinked List Constructor. We just initialize the class attribute here, we are just saying that I initialize
    // my linked list and point the start node to null for starters.
    public SingleLinkedList(){
        this.start = null;
    }

    // This is the createList method. This is the method that is used to create the list. The important point to remember
    // is that we are creating a list by inserting data at the end.
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

    // Display list method. This method displays the linked list from the first node to the last. Left to right.
    public void displayList() {

        Node p; // Create a temporary node p as starter node.

        // if the start attribute, defined at class level is null, means linked list is empty. Just
        //return.
        if(start == null){
            System.out.println("List is empty");
            return;
        }

        System.out.println("List is : ");

        // If the code comes here, it means the linked list is not empty at least. We point the temporary node p to
        // the Node start.
        p = start;

        // While the Node still has data, which means that is not empty keep the loop going. Until the condition is
        // true keep on doing stuff.
        while(p != null){

            // print the node info
            System.out.print(p.i + " -->");

            // move to the next node by following the link
            p = p.link;
        }
        // When the loop is over, code comes here and prints null.
        System.out.print("null");
    }

    public void countNodes() {
    }

    public void searchData(int data) {
    }

    // Method to add data to the start of the list.
    public void insertInBeginning(int data) {

        // This is a 3-step process.
        // First create the temp node
        // Second, point temps link to start (start is the beginning of the list)
        // lastly point start to temp. This way temp becomes the new first node. If start does not point to temp,
        // then the link of start to the rest of the list is lost. Also step 2 and 3 can not change in order.  
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
