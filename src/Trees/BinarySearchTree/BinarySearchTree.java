package Trees.BinarySearchTree;

public class BinarySearchTree {

    private Node root;

    public BinarySearchTree(){
        root = null;
    }

    /**
     * Recursive method of searching
     */
    public boolean search(int x){
        return (search(root, x) != null);
    }
    private Node search(Node p, int x){
        if(p==null){
            return null;
        }
        if(x < p.info){ // search the left subtree
            return search(p.lchild, x);
        }
        if(x > p.info){ // search the right subtree
            return search(p.rchild, x);
        }
        return p; //key found
    }

    /**
     * Iterative Method of searching
     * @param x
     * @return
     */
    public boolean search1(int x){
        Node p = root;
        while(p != null){
            if(x < p.info){
                p = p.lchild; /*Move to the left child*/
            }
            else if(x >p.info){
                p=p.rchild;
            }
            else
                return true;
        }
        return false;
    }

    public void display(){
        display(root, 0);
        System.out.println();
    }

    private void display(Node p, int level){
        int i;
        if(p==null){
            return;
        }
        display(p.rchild, level + 1);
        System.out.println();

        /**
         * I don't understand whats happening here
         */
        for(i=0; i<level; i++){
            System.out.print("      ");
        }
        System.out.print(p.info);

        display(p.lchild, level+1);
    }

    /**
     * Recursive Methods Min and Max
     */
    public int min(){
        if(isEmpty()){
            throw new NullPointerException("Tree is empty");
        }
        return min(root).info;
    }

    private Node min(Node p){
        if(p.lchild == null){
            return p;
        }
        return min(p.lchild);
    }

    public int max(){
        if(isEmpty()){
            throw new NullPointerException("Tree is empty");
        }
        return max(root).info;
    }

    private Node max(Node p){
        if(p.rchild == null){
            return p;
        }
        return max(p.rchild);
    }

    /**
     * Iterative methods for min and max
     * @return
     */
    public int min1(){
        if(isEmpty()){
            throw new NullPointerException("Tree is empty");
        }
        Node p = root;
        while(p.lchild != null){
            p = p.lchild;
        }
        return p.info;
    }

    public int max1(){
        if(isEmpty()){
            throw new NullPointerException("Tree is empty");
        }
        Node p = root;
        while(p.rchild != null){
            p = p.rchild;
        }
        return p.info;
    }

    public boolean isEmpty(){
        return (root == null);
    }

    /**
     * Recursive method for insertion
     */
    public void insert(int x){
        root = insert(root,x);
    }

    private Node insert(Node p, int x){

        if(p == null){
            p = new Node(x);
        }
        else if(x < p.info){
            p.lchild = insert(p.lchild, x);
        }
        else if(x > p.info)
            p.rchild = insert(p.rchild, x);
        else
            System.out.println(x + " is already present in the tree ");
        return p;
    }

    /**
     * Iterative method for insertion
     */
    public void insert1(int x){
        Node p = root;
        Node par = null;

        while(p !=null){
            par = p;
            if(x < p.info){
                p =p.lchild;
            }
            else if(x > p.info){
                p = p.rchild;
            }
            else{
                System.out.println(x + "already present in the tree");
                return;
            }
        }

        Node temp = new Node(x);

        if (par == null){
            root = temp;
        }
        else if(x < par.info){
            par.lchild = temp;
        }
        else
            par.rchild = temp;
    }

    /**
     *
     * Deletion in a binary search tree
     */

    /**
     * Recursive Method
     * @param x
     */
    public void delete(int x){
        root = delete(root, x);
    }

    private Node delete(Node p, int x) {
        Node ch, s;

        if (p == null) {
            System.out.println(x + " not found ");
            return p;
        }
        if (x < p.info) {
            p.lchild = delete(p.lchild, x);
        } else if (x > p.info) {
            p.rchild = delete(p.rchild, x);
        } else {
            if (p.lchild != null && p.rchild != null) {
                s = p.rchild;
                while (s.lchild != null) {
                    s = s.lchild;
                }
                p.info = s.info;
                p.rchild = delete(p.rchild, s.info);
            } else {
                if (p.lchild != null) {
                    ch = p.lchild;
                } else {
                    ch = p.rchild;
                }
                p = ch;
            }
        }
        return p;
    }

    /**
     * Iterative Deletion Method
     */
    public void delete1(int x){
        Node p = root;
        Node par = null;
        while(p != null){
            if(x == p.info){
                break;
            }
            par = p;
            if(x < p.info){
                p = p.lchild;
            }
            else
                p = p.rchild;
        }
        if(p == null){
            System.out.println(x + " is not found ");
            return;
        }
        /**
         * Case C : 2 children
         * Find inorder successor, and it's parent
         */
        Node s, ps;
        if(p.lchild != null && p.rchild != null){
            ps = p;
            s = p.rchild;
            while(s.lchild != null){
                ps = p;
                s = s.lchild;
            }
            p.info = s.info;
            p = s;
            par = ps;
        }

        /**
         * Case B and Case A : 1 or no child
         */
        Node ch;
        if(p.lchild != null){
            ch = p.lchild;
        }
        else{
            ch = p.rchild;
        }
        if(par == null){
            root = ch;
        }
        else if(p == par.lchild)
            par.lchild = ch;
        else
            par.rchild = ch;
    }

    public void postOrder(){
        postOrder(root);
        System.out.println();
    }

    private void postOrder(Node p){
        if(p == null){
            return;
        }
        postOrder(p.lchild);
        postOrder(p.rchild);
        System.out.print(p.info + "      ");
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
        preOrder(p.lchild);
        preOrder(p.rchild);
    }

    public void inOrder(){
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node p){
        if(p == null){
            return;
        }
        inOrder(p.lchild);
        System.out.print(p.info + "  ");
        inOrder(p.rchild);
    }

    public int height(){
        return height(root);
    }

    private int height(Node p){
        int hL,hR;

        if(p==null){
            return 0;
        }
        hL = height(p.lchild);
        hR = height(p.rchild);

        if(hL > hR){
            return 1+hL;
        }
        else{
            return 1+hR;
        }
    }

    public void createTree(){
        root = new Node('P');
        root.lchild = new Node('Q');
        root.rchild = new Node('R');
        root.lchild.lchild = new Node('A');
        root.lchild.rchild = new Node('B');
        root.rchild.lchild = new Node('X');
    }
}
