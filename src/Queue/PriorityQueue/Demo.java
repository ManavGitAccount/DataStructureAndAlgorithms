package Queue.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int choice, element, elementPriority;
        Scanner scan = new Scanner(System.in);

        priorityQueue pq = new priorityQueue();


        while(true){
            System.out.println("1. Insert a new element ");
            System.out.println("2. Delete an element ");
            System.out.println("3. Display the queue ");
            System.out.println("4. Quit ");
            System.out.println("5. Enter your choice: ");
            choice = scan.nextInt();
            if(choice == 4){
                break;
            }
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the element to be inserted");
                    element = scan.nextInt();
                    System.out.println("Enter it's priority:  ");
                    elementPriority = scan.nextInt();
                    pq.insert(element, elementPriority);
                    break;
                case 2:
                    System.out.println("Deleted element is " + pq.Delete());
                    break;
                case 3:
                    pq.display();
                    break;
                default:
                    System.out.println("Wrong Choice");
            }
        }
        scan.close();
    }
}
