package Linkedlist;
import Nodes.Node;

public class linkedList {
    private Node head = null;

    public void insert(int value){
        Node node = new Node(value);
        if(this.head == null){
            this.head = node;
        }
        else{
            Node current = this.head;
            node.setNext(current);
            this.head = node;
        }
    }

    public boolean isInclude(int value){
        Node current = this.head;
        while (current.getNext() != null) {
            if (current.getData() == value) {
                return true;
            } else {
                current = current.getNext();
            }
            if (current.getNext() == null && current.getData() == value) {
                return true;
            }
        }
        return false;
    }

    public String converToString(){
        String result = "";
        Node current = this.head;
        while(current != null){
            result += "[ " + current.getData() + " ] -> ";
            current = current.getNext();
        }
        result+= "Null :)";
        return result;
    }

}
