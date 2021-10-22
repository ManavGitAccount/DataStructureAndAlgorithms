package CircularLinkedList;
import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        int choice, data, x;
        Scanner scan = new Scanner(System.in);
        CircularLinkedList cList  = new CircularLinkedList();
        cList.createList();

        while(true){

            System.out.println("1. Display List");
            System.out.println("2. Insert in empty list");
            System.out.println("3. Insert in the beginning");
            System.out.println("4. Insert at the end");
            System.out.println("5. Insert after the node");
            System.out.println("6. Delete first node");
            System.out.println("7. Delete last node");
            System.out.println("8. Delete any node");
            System.out.println("9. Quit");

            System.out.print("Enter your choice : ");
            choice = scan.nextInt();

            if(choice == 9){
                break;
            }

            switch(choice){
                case 1:
                    cList.displayList();
                    break;
                case 2:
                    System.out.print("Enter the element to be inserted: ");
                    data = scan.nextInt();
                    cList.insertInEmptyList(data);
                    break;
                case 3:
                    System.out.print("Enter the element to be inserted: ");
                    data = scan.nextInt();
                    cList.insertInBeginning(data);
                    break;
                case 4:
                    System.out.print("Enter the element to be inserted: ");
                    data = scan.nextInt();
                    cList.insertAtEnd(data);
                    break;
                case 5:
                    System.out.print("Enter the element to be inserted");
                    data = scan.nextInt();
                    System.out.print("Enter the element after which to insert");
                    x = scan.nextInt();
                    cList.insertAfter(data, x);
                    break;
                case 6:
                    System.out.print("Delete the First Node");
                    cList.deleteFirstNode();
                    break;
                case 7:
                    System.out.print("Delete the Last Node");
                    cList.deleteLastNode();
                    break;
                case 8:
                    System.out.print("Enter the element to be deleted");
                    data = scan.nextInt();
                    cList.deleteNode(data);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
            System.out.println();
        }
        scan.close();
        System.out.println("Exiting");
    }
}
