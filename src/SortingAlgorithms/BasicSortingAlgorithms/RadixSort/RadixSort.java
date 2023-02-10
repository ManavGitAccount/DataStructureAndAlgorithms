package SortingAlgorithms.BasicSortingAlgorithms.RadixSort;

import java.util.Scanner;

public class RadixSort {

    public static Node sort( Node start ) {
        Node[] rear = new Node[10];
        Node[] front = new Node[10];

        int leastSigPos = 1;
        int mostSigPos = digitsInLargest(start);

        int i, dig;
        Node p;
        for (int k = leastSigPos; k <= mostSigPos; k++) {
            for (i = 0; i <= 9; i++) {
                rear[i]  = null;
                front[i] = null;
            }
            for (p = start; p != null; p = p.link) {
                dig = digit(p.info, k);

                if (front[dig] == null) {
                    front[dig] = p;
                } else {
                    rear[dig].link = p;
                }
                rear[dig] = p;

            }
            i = 0;
            while (front[i] == null) {
                i++;
            }
            start = front[i];
            while (i <= 8) {
                if (rear[i + 1] != null) {
                    rear[i].link = front[i + 1];
                } else {
                    rear[i + 1] = rear[i];
                }
                i++;
            }
            rear[9].link = null;
            i++;
        }
        rear[9].link = null;
        return start;
    }


    public static int digit(int n, int k) {
        int d = 0, i;

        for(i=1; i<=k; i++) {
            d = n %10;
            n /=10;
        }
        return d;
    }

    public static int digitsInLargest(Node start) {
        int large = 0;
        Node p = start;
        while(p != null) {
            if (p.info > large) {
                large = p.info;
            }
            p = p.link;
            if(p.info > large) {
                large = p.info;
            }
            p = p.link;
        }

        int ndigits = 0;
        while(large !=0 ) {
            ndigits ++;
            large /=10;
        }
        return ndigits;
    }

    public static void main(String args[]){

        Node temp,p;
        int i, n, data;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of elements in the list : ");
        n = scan.nextInt();

        Node start = null;
        for(i=0; i<n; i++){
            System.out.print("Enter element " + i + " : ");
            data = scan.nextInt();

            temp = new Node(data);
            if(start == null){
                start = temp;
            }
            else{
                p = start;
                while(p.link != null){
                    p = p.link;
                }
                p.link = temp;
            }
        }

        start = sort(start);

        System.out.print("Sorted list is : \n");
        p = start;
        while( p != null){
            System.out.print(p.info + " ");
            p = p.link;
        }
        System.out.println();
        scan.close();
    }
}
