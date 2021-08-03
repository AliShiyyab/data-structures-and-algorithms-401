package CC7;

public class Node {
    // Declare Data Member:
    private int data;
    private Node next;

    // Constructor:
    public Node(int data){
        this.data = data;
    }

    // getData Function to returned the data:
    public int getData(){
        // in the get Function we just returned data ...
        return data;
    }

    // setNext is used to get the next new value :
    public void setNext(Node next){
        // in the set Function we are not used the return ... just to put or setting a value
        this.next = next;
    }

    // getNext function returned the Nodes.Node next
    public Node getNext(){
        return next;
    }
}