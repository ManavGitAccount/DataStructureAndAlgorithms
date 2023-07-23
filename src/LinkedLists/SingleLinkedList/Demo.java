package LinkedLists.SingleLinkedList;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        int choice, data, k, x;

        //What is this scanner class ??
        // Need to know about it
        Scanner scan = new Scanner(System.in);

        //creating the object of the single linked list
        SingleLinkedList  myList = new SingleLinkedList();

        //using the create list method of the object to create the list
        myList.createList();

        while(true){
            System.out.println("1.Display list");
            System.out.println("2.Count the number of nodes");
            System.out.println("3.Search for an element");
            System.out.println("4.Insert in empty list/Insert in the beginning of the list");
            System.out.println("5.Insert a node at the end of the list");
            System.out.println("6.Insert a node after a specified node");
            System.out.println("7.Insert a node before a specified node");
            System.out.println("8.Insert a node at a given position");
            System.out.println("9.Delete first node");
            System.out.println("10.Delete last node");
            System.out.println("11.Delete any node");
            System.out.println("12.Reverse the list");
            System.out.println("13.Bubble sort by exchanging data");
            System.out.println("14.Bubble sort by exchanging links");
            System.out.println("15.MergeSort");
            System.out.println("16.Insert Cycle");
            System.out.println("17.Detect Cycle");
            System.out.println("18.Remove Cycle");
            System.out.println("19.Quit");

            System.out.println("Enter your choice: ");
            choice = scan.nextInt();

            if(choice == 19){
                break;
            }

            switch (choice) {
                case 1:
                    myList.displayList();
                    break;
                case 2:
                    myList.countNodes();
                    break;
                case 3:
                    System.out.println("Enter the element to be searched :");
                    data = scan.nextInt();
                    myList.searchData(data);
                    break;
                case 4:
                    System.out.println("Enter the element to be inserted :");
                    data = scan.nextInt();
                    myList.insertInBeginning(data);
                    break;
                case 5:
                    System.out.println("Enter the element to be inserted :");
                    data = scan.nextInt();
                    myList.insertAtEnd(data);
                    break;
                case 6:
                    System.out.println("Enter the element to be inserted :");
                    data = scan.nextInt();
                    System.out.println("Enter the element after which to insert :");
                    x = scan.nextInt();
                    myList.insertAfter(data, x);
                    break;
                case 7:
                    System.out.println("Enter the element to be inserted :");
                    data = scan.nextInt();
                    System.out.println("Enter the element before which to insert : ");
                    x = scan.nextInt();
                    myList.insertBefore(data, x);
                    break;
                case 8:
                    System.out.println("Enter the element to be inserted :");
                    data = scan.nextInt();
                    System.out.println("Enter the position at which to insert : ");
                    k = scan.nextInt();
                    myList.insertAtPosition(data, k);
                    break;
                case 9:
                    myList.deleteFirstNode();
                    break;
                case 10:
                    myList.deleteLastNode();
                    break;
                case 11:
                    System.out.print("Enter the element to be deleted");
                    data = scan.nextInt();
                    myList.deleteNode(data);
                    break;
                case 12:
                    myList.reverseList();
                    break;
                case 13:
                    myList.bubbleSortExData();
                    break;
                case 14:
                    myList.bubbleSortExLinks();
                    break;
                case 15:
                   // myList.mergeSort();
                    break;
                case 16:
                    System.out.print("Enter the element at which the cycle has to be inserted : ");
                    data = scan.nextInt();
                    myList.insertCycle(data);
                    break;
                case 17:
                    if (myList.hasCycle()) {
                        System.out.println("List has a cycle");
                    } else {
                        System.out.println("List does not have a cycle");
                    }
                    break;
                case 18:
                    myList.removeCycle();
                    break;
                default:
                    System.out.println("Wrong Choice");
            }/* End of switch */
            System.out.println();
            } /* End of while */

        }

    }


