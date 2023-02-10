package Trees.BinaryTree;

public class BinaryTree {

    //Reference to a basic root node.
    //Basic building block.
    private Node root;

    //No args Constructor. Root node pointing to null.
    //Basic tree creator.
    public BinaryTree(){
        root = null;
    }

    public void display(){
        display(root, 0);
        System.out.println();
    }

    private void display(Node p, int level){
        int i;

        /** Case 1 : Empty tree.
         * The tree is empty. There is nothing to display. Return.
         */
        if(p==null){
            return;
        }
        display(p.rightChild, level + 1);
        System.out.println();

        /**
         * I don't understand whats happening here
         */
        for(i=0; i<level; i++){
            System.out.print("      ");
        }
        System.out.print(p.info);

        display(p.leftChild, level+1);
    }

    public void preOrder(){
        preOrder(root);
        System.out.println();
    }

    private void preOrder(Node p){
        if(p == null){
            return;
        }
        System.out.print(p.info + "     ");
        preOrder(p.leftChild);
        preOrder(p.rightChild);
    }

    public void inOrder(){
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node p){
        if(p == null){
            return;
        }
        inOrder(p.leftChild);
        System.out.print(p.info + "  ");
        inOrder(p.rightChild);
    }

    public void postOrder(){
        postOrder(root);
        System.out.println();
    }

    private void postOrder(Node p){
        if(p == null){
            return;
        }
        postOrder(p.leftChild);
        postOrder(p.rightChild);
        System.out.print(p.info + "      ");
    }

//    public void levelOrder(){
//        Node p = root;
//
//        if(p==null){
//            System.out.println("Tree is empty");
//            return;
//        }
//
//        QueueA queueA = new QueueA();
//
//        queueA.insert(p);
//        while(!queueA.isEmpty()){
//            p = queueA.delete(p);
//            System.out.println(p.info + " ");
//            if(p.leftChild != null){
//                queueA.insert(p.leftChild);
//            }
//            if(p.rightChild != null){
//                queueA.insert(p.rightChild);
//            }
//            System.out.println();
//        }
//
//    }

    public int height(){
        return height(root);
    }

    private int height(Node p){
        int hL,hR;

        if(p==null){
            return 0;
        }
        hL = height(p.leftChild);
        hR = height(p.rightChild);

        if(hL > hR){
            return 1+hL;
        }
        else{
            return 1+hR;
        }
    }

    public void createTree(){
        root = new Node('P');
        root.leftChild = new Node('Q');
        root.rightChild = new Node('R');
        root.leftChild.leftChild = new Node('A');
        root.leftChild.rightChild = new Node('B');
        root.rightChild.leftChild = new Node('X');
    }
}
