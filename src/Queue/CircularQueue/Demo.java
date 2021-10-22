package Queue.CircularQueue;

import Queue.ArrayIMplementation.QueueArrayImplementation;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        int choice, x;
        Scanner scan = new Scanner(System.in);

        CircularQueue qCL= new CircularQueue();

        while(true){
            System.out.println("1. Insert an element in the queue");
            System.out.println("2. Delete an element from the queue");
            System.out.println("3. Display element at front");
            System.out.println("4. Display all elements from the queue ");
            System.out.println("5. Display size of the queue");
            System.out.println("6. Quit");
            System.out.println(" Enter your choice : ");
            choice = scan.nextInt();
            if(choice==6){
                break;
            }
            switch (choice){
                case 1:
                    System.out.println("Enter the element to be inserted : ");
                    x = scan.nextInt();
                    qCL.insert(x);
                    break;
                case 2:
                    x = qCL.Delete();
                    System.out.println("Element deleted is " + x);
                    break;
                case 3:
                    System.out.println("Element at the front is " + qCL.peek());
                    break;
                case 4:
                    System.out.println("Display queue ");
                    qCL.display();
                    break;
                case 5:
                    System.out.println("Size of queue is " + qCL.size());
                    break;
                default:
                    System.out.println("Wrong choice ");
            }
            System.out.println();
        }
        scan.close();
    }
}
