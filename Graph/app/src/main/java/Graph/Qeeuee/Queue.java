package Graph.Qeeuee;

import Graph.Qeeuee.Node;

public class Queue <Q> {
    private Node front;
    private Node rear;
    int maxSize = 0;

    public Queue(){
        this.front = null;
        this.rear = null;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void enQueue(Q value){
        maxSize++;
        Node node = new Node(value);
        if(this.rear == null){
            this.rear = node;
            this.front = node;
            return;
        }
        Node current = this.rear;
        this.rear = node;
        current.setNext(this.rear);
    }

    public Q deQueue(){
        this.maxSize--;
        if (this.front == null){
            return (Q)"Null";
        }
        Node current = this.front;
        this.front = this.front.getNext();
        current.setNext(null);
        return (Q)current.getData();
    }

    public boolean isEmpty(){
        boolean temp = maxSize > 0 ? false : true;
        return temp;
    }

    public Q peekQueue(){
        return (Q)this.front.getData();
    }

    @Override
    public String toString() {
        Node current = this.front;
        String result = "{ " + current.getData() + " } -> ";
        while(current != this.rear){
            current = current.getNext();
            result += "{ " + current.getData() + " } -> ";
        }
        return result + "Null";
    }
}