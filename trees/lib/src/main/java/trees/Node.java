package trees;

public class Node<N> {
    private N data;
    private Node<N> right;
    private Node<N> left;

    public Node(N data){
        this.data=data;
    }

    public Node<N> getRight() {
        return right;
    }

    public N getData() {
        return data;
    }

    public Node<N> getLeft() {
        return left;
    }

    public void setRight(Node<N> right) {
        this.right = right;
    }

    public void setLeft(Node<N> left) {
        this.left = left;
    }
}
