package linked.list.zip;

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

    public int getSize(){
        Node temp = this.head;
        int count = 0;
        while(temp != null){
            count++;
            temp.getNext();
        }
        return count;
    }

    public static LinkedList linkedListZip(LinkedList list1 , LinkedList list2){
        LinkedList list3 = new LinkedList();
        if (list1 == null && list2 == null) {
            return null;
        }
        else if (list1 == null || list2 == null){
            return list1 == null?list2:list1;
        }
        else{
            Node head2 = list2.head;
            Node head1 = list1.head;
            Node node1 = new Node(head1.getData());
            Node node2 = new Node(head2.getData());
            list3.head = node1;
            Node head3 = list3.head;
            head3.setNext(node2);
            head3 = head3.getNext();
            while (head1.getNext()!=null || head2.getNext() !=null) {
                if (head1.getNext()!=null) {
                    head1=head1.getNext();
                    Node nodeList3 = new Node(head1.getData());
                    head3.setNext(nodeList3);
                    head3 = head3.getNext();
                }
                if (head2.getNext()!=null){
                    head2=head2.getNext();
                    Node nodeList4 = new Node(head2.getData());
                    head3.setNext(nodeList4);
                    head3 = head3.getNext();
                }
            }

        }
        return list3;
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
