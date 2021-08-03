package CC7;

public class LinkedList {
    private Node head = null;

    public void insert(int value){
        Node node = new Node(value);
        if(this.head==null) {
            this.head=node;
        }else{
            Node current = this.head;
            node.setNext(current);
            this.head=node;
        }
    }

    public String linkedlistkth(int k){
        int len = 0;
        Node curr =this.head;
        while (curr!= null) {
            curr= curr.getNext();
            len++;
        }
        if (len < k){
            return "Exception";
        }
        else if (k <= 0){
            return "Null";
        }
        curr = this.head;
        for (int i = 1; i < len - k + 1; i++)
            curr = curr.getNext();
        String result = "";
        result += curr.getData();
        return result;

    }

    @Override
    public String toString() {
        String result = "";
        Node current = this.head;
        while (current != null) {
            result += "[ " + current.getData() + " ] -> ";
            current = current.getNext();
        }
        result +="Null";
        return result;
    }
}
