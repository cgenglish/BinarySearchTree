/**
 * Node
 */

public class Node {

    /**
     * The data or value that the NOde contains
     */
    int data;
    /**
     * Pointer to the left Node - which is smaller than the parent
     * Pointer to the right Node - which is greater or equal to the parent
     */
    Node left, right;

    /**
     * Constructor that takes in data as a parameter and sets it to the instance variable
     * @param data the int data that should be set
     */
    public Node(int data) {
        super();
        this.data = data;
    }


}