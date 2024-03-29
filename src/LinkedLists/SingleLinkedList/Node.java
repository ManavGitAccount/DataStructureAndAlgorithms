package LinkedLists.SingleLinkedList;

/**
 * Simple Node Class.
 * Has two attributes.
 * One is the attribute you are trying to use, an int, a string , an object etc..
 * The other is the link, this is a pointer or a referencing link
 * For simplicity, all the methods are public
 */
public class Node {

    // Class Attributes
    public int i;
    public Node link;

    // Constructor that initializes
    // class attributes.
    public Node(int i) {
        this.i = i;
        this.link = null;
    }
}
