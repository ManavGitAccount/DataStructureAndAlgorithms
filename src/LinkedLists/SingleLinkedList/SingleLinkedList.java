package LinkedLists.SingleLinkedList;

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
        int position = 1;
        Node p = start;
        while(p != null)
        {
            if(p.i == data)
            {
                System.out.println("Element Found at position " + position);
                break;
            }
            position++;
            p=p.link;

            if(p==null)
            {
                System.out.println("Element not found in the list");
            }
        }
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

    /*
    Method that creates a node, adds data to it and references to the next node
     */
    public void  insertAtEnd(int data) {
        Node p;
        Node temp = new Node(data);

        if(start == null){
            start = temp;
            return;
        }

        //p refers to the first node.
        p = start;

        //On completion of the entire while loop, it'll get you to the end
        // of the list with last node p
        while (p.link != null){

            //This is the forward reference.
            // This is how we assign reference to the next node.
            p = p.link;
        }

        //The last node achieved via --> p.link must refer to this temp node.
        //This is because we are inserting at the end. Here p is the last node of the list.
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
        //At the end of the for loop the last value is assigned p.
        //It stops when end refers to the second node of the list
        for(end=null; end!= start.link; end=p){

            // Initialize the inner for loop with p equal to start and keep incrementing
            // p with p=p.link
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

//    public void mergeSort() {
//        start = mergeSortRec(start);
//    }
//
//    private Node mergeSortRec(Node listStart){
//        if( listStart== null || listStart.link == null){
//            return listStart;
//        }
//        /*if more than one element */
//        Node start1 = listStart;
//        Node start2 = divideList(listStart);
//        start1 = mergeSortRec(start1);
//        start2 = mergeSortRec(start2);
//       // Node startM = merge2(start1, start2);
//       // return startM;
//    }

    private Node divideList(Node p){
        Node q  = p.link.link;
        while(q!=null && q.link != null)
        {
            p = p.link;
            q = q.link.link;
        }

        Node start2 = p.link;
        p.link = null;
        return start2;
    }

    public void insertCycle(int data) {

        //If the list contains no node return.
        if(start == null){
            return;
        }

        // We have references to 3 nodes. p referring to start
        // other nodes referring to null for the time being.
        Node p = start, px = null, prev = null;

        while(p!=null){
            //while traversing , if the data is found, we refer p to px
            if(p.i == data){
                px = p;
            }
            // reference prev points to p
            prev = p;
            // keep iterating
            p = p.link;
        }

        //here we just point the link from prev to px to create the cycle.
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

        //This will give us a reference to where the slow and the fast node meet.
        Node c = findCycle();
        if(c==null){
            return;
        }
        System.out.println("Node at which the cycle was detected is " + c.i);

        //Two references.
        Node p =c, q = c;
        int lenCycle = 0;
        //Here in the loop we find the length of the cycle. This goes on until the two nodes meet.
        do{
            lenCycle++;
            q=q.link;
        }while(p!=q);
        System.out.println("Length of the cycle is : " + lenCycle);

        //Here we find the length of the remaining list.
        // p points to the start and q remains where it is.
        // The goal is to meet p and q and in this process when lenRemList keeps moving, it'll give us the count of the
        // remaining list
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

        //This is the part where we remove the cycle from the list
        //Remember the last node was pointing to the cycle. Therefore if we make the last node point to null
        // then the cycle is removed.
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
