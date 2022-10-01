package LinkedLists.DoubleLinkedList;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        int choice , data, x;
        Scanner scan = new Scanner(System.in);

        DoubleLinkedList doubleList = new DoubleLinkedList();
        doubleList.createList();

        while(true){

            System.out.println("1.Display List");
            System.out.println("2.Insert in empty list");
            System.out.println("3.Insert a node in beginning of the list");
            System.out.println("4.Insert a node at the end of the list");
            System.out.println("5.Insert a node after a specified node");
            System.out.println("6.Insert a node before a specified node");
            System.out.println("7.Delete first node");
            System.out.println("8.Delete last node");
            System.out.println("9.Delete any node");
            System.out.println("10.Reverse the list");
            System.out.println("11.Quit");
            System.out.println("Enter your choice: ");
            choice = scan.nextInt();

            if(choice == 9){
                break;
            }

            switch(choice){
                case 1:
                    doubleList.displayList();
                    break;
                case 2:
                    System.out.println("Enter the element to be inserted : ");
                    data = scan.nextInt();
                    doubleList.insertInEmptyList(data);
                    break;
                case 3:
                    System.out.println("Enter the element to be inserted : ");
                    data = scan.nextInt();
                    doubleList.insertInBeginning(data);
                    break;
                case 4:
                    System.out.println("Enter the element to be inserted : ");
                    data = scan.nextInt();
                    doubleList.insertAtEnd(data);
                    break;
                case 5:
                    System.out.println("Enter the element to be inserted : ");
                    data = scan.nextInt();
                    System.out.println("Enter the element after which to insert : ");
                    x = scan.nextInt();
                    doubleList.insertAfter(data, x);
                    break;
                case 6:
                    System.out.println("Enter the element to be inserted : ");
                    data = scan.nextInt();
                    System.out.println("Enter the element before which to insert : ");
                    x = scan.nextInt();
                    doubleList.insertBefore(data,x);
                    break;
                case 7:
                    doubleList.deleteFirstNode();
                    break;
                case 8:
                    doubleList.deleteLastNode();
                    break;
                case 9:
                    System.out.println("Enter the element to be deleted : ");
                    data = scan.nextInt();
                    doubleList.deleteNode(data);
                    break;
                case 10:
                    doubleList.reverseList();
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
