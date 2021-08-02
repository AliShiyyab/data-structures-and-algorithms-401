package linked.list;

import linked.list.Node;

public class LinkedList {
    private Node head = null;

    //append functions:
    //search if the header is null put the value in the head else go to the last value and put the value in the end
    public void append(int value){
        Node node = new Node(value);
        if(this.head == null){
            this.head = node;
        }
        else{
            Node current = this.head;
            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(node);
        }
    }

    //insert before function
    //select the new and last value and testing it to put the new value previous value
    public void insertAfter(int beforeValue , int newValue){
        Node current = this.head;
        while( current.getNext() != null){
            if (current.getData() == beforeValue){
                Node node = new Node(newValue);
                node.setNext(current.getNext());
                current.setNext(node);
            }
            current = current.getNext();
        }
    }

    public void insertBefore(int before , int newvalue){
        Node current = this.head;
        while (current.getNext() != null){
            if (current.getNext().getData() == before){
                Node n = new Node(newvalue);
                n.setNext(current.getNext());
                current.setNext(n);
                break;
            }
            current = current.getNext();
        }
    }

    // CC5:

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
