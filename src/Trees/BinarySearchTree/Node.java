package Trees.BinarySearchTree;

public class Node {
    //Node referencing to a left pointer variable , lchild
    Node lchild;

    //Node referencing to a right pointer variable , rchild
    Node rchild;

    //info variable
    int info;

    // Constructor. Takes one parameter int var.
    // All other references for this object point to null. 
    public Node(int i){
        this.info = i;
        this.lchild = null;
        this.rchild = null;
    }
}
