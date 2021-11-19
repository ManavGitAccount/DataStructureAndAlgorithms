package Trees.BinarySearchTree;

public class BinarySearchTree {

    private Node root;

    public BinarySearchTree(){
        root = null;
    }

    public boolean isEmpty(){
        return (root == null);
    }

    public void insert(int x){
        root = insert(root,x);
    }

    private Node insert(Node p, int x){

    }
}
