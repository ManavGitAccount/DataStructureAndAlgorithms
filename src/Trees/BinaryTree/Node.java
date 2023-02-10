package Trees.BinaryTree;

public class Node {

    //Self referencing leftChild
    Node leftChild;

    //Self referencing rightChild
    Node rightChild;

    //data
    char info;

    //Constructor that just takes one data param.
    public Node(char ch){
        this.leftChild = null;
        this.rightChild = null;
        info = ch;
    }
}
