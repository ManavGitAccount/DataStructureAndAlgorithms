package Trees.BinarySearchTree;

import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {

        BinarySearchTree binaryTree = new BinarySearchTree();
        int choice,x;

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("1. Display Tree");
            System.out.println("2. Search");
            System.out.println("3. Insert a new node");
            System.out.println("4. Delete a node");
            System.out.println("5. Preorder Traversal");
            System.out.println("6. Inorder Traversal");
            System.out.println("7. Postorder Traversal");
            System.out.println("8. Height of Tree");
            System.out.println("9. Find Minimum Key");
            System.out.println("10. Find Maximum Key");
            System.out.println("11. Quit");
            System.out.println("Enter your choice: ");
            choice = scan.nextInt();

            if(choice == 11){
                break;
            }
            switch(choice)
            {
                case 1:
                    binaryTree.display();
                    break;
                case 2:
                    System.out.println("Enter the key to be searched : ");
                    x = scan.nextInt();

                    if(binaryTree.search1(x)){
                        System.out.println(" key found ");
                    }
                    else{
                        System.out.println(" key not found ");
                    }
                    break;

                case 3:
                    System.out.println(" Enter the key to be inserted : ");
                    x = scan.nextInt();
                    binaryTree.insert1(x);
                    break;

                case 4:
                    System.out.println("Enter the key to be deleted : ");
                    x = scan.nextInt();
                    binaryTree.delete1(x);
                    break;

                case 5:
                    binaryTree.preOrder();
                    break;

                case 6:
                    binaryTree.inOrder();
                    break;

                case 7:
                    binaryTree.postOrder();
                    break;

                case 8:
                    System.out.println("Height of the tree is " + binaryTree.height());
                    break;

                case 9:
                    System.out.println(" Minimum key is " + binaryTree.min1());
                    break;

                case 10:
                    System.out.println(" Maximum key is " + binaryTree.max1());
                    break;
            }
        }
        scan.close();
    }
}
