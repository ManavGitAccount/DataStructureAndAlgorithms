package Queue.Deque;

import Queue.CircularQueue.CircularQueue;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        int choice, x;
        Scanner scan = new Scanner(System.in);

        DequeCircularArray deqCL= new DequeCircularArray(8);

        while(true){
            System.out.println("1. Insert an element in the front of dequeue");
            System.out.println("2. Insert an element from the rear end of the queue");
            System.out.println("3. Display element deleted from the front ");
            System.out.println("4. Display element deleted from the rear ");
            System.out.println("5. Display the dequeue");
            System.out.println("6. Quit");
            System.out.println(" Enter your choice : ");
            choice = scan.nextInt();
            if(choice==6){
                break;
            }
            switch (choice){
                case 1:
                    System.out.println("Enter the element to be inserted from the front: ");
                    x = scan.nextInt();
                    deqCL.insertFront(x);
                    break;
                case 2:
                    System.out.println("Element the element to be inserted from the rear end: " );
                    x = scan.nextInt();
                    deqCL.insertRear(x);
                    break;
                case 3:
                    System.out.println("Element deleted from the front end is : " +deqCL.deleteFront());
                    break;
                case 4:
                    System.out.println("Element deleted from the rear end is : " + deqCL.deleteRear());
                    break;
                case 5:
                    deqCL.display();
                    break;
                default:
                    System.out.println("Wrong choice ");
            }
            System.out.println();
        }
        scan.close();
    }
}
