package Trees.BinaryTree;

public class Demo {
    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree();

        bTree.createTree();

        bTree.display();
        System.out.println("--------------------------------");

        System.out.println("PreOrder");
        bTree.preOrder();
        System.out.println("--------------------------------");

        System.out.println("InOrder");
        bTree.inOrder();
        System.out.println("---------------------------------");

        System.out.println("PostOrder");
        bTree.postOrder();
        System.out.println("---------------------------------");

//        System.out.println("LevelOrder");
//        bTree.levelOrder();
//        System.out.println("---------------------------------");

        System.out.println("Height of the tree : " + bTree.height());

        System.out.println("---------------------------------");


    }
}
