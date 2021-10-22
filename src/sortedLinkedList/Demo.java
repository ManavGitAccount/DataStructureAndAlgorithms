package sortedLinkedList;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int choice, data;

        Scanner scan = new Scanner(System.in);

        SortedLinkedList myList = new SortedLinkedList();
        myList.createList();

        while(true){
            System.out.println("1. Display List");
            System.out.println("2. Insert a new node");
            System.out.println("3. Search");
            System.out.println("4. Exit");
            System.out.println("Enter your choice : ");
            choice = scan.nextInt();
            if(choice == 4){
                break;
            }
            switch(choice){
                case 1:
                    myList.displayList();
                    break;
                case 2:
                    System.out.println("Enter the element to be inserted : ");
                    data = scan.nextInt();
                    myList.insertInOrder(data);
                    break;
                case 3:
                    System.out.println("Enter the element to be searched : ");
                    data = scan.nextInt();
                    myList.search(data);
                    break;
                default:
                    System.out.println("Wrong choice \n");

            }

        }
    }
}
