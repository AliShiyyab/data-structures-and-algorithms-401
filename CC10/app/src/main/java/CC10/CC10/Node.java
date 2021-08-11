package CC10.CC10;

public class Node<N> {
    private Node<N> next;
    private N data;

    public Node(N data){
        this.data=data;
    }

    public N getData() {
        return data;
    }

    public Node<N> getNext() {
        return next;
    }

    public void setNext(Node<N> next) {
        this.next = next;
    }
}
