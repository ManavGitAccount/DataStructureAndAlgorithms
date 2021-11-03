package Queue.PriorityQueue;

public class Node {

    public int priority;
    public int info;
    public Node link;

    public Node(int i, int pr){
        this.info = i;
        this.priority = pr;
    }
}
