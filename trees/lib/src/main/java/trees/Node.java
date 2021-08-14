package trees;

public class Node {
    int data;
    private Node rightChild;
    private Node leftChild;

    public int getData() {
        return data;
    }

    public Node getLeft() {
        return leftChild;
    }

    public Node getRight() {
        return rightChild;
    }

    public void setLeft(Node left) {
        this.leftChild = left;
    }

    public void setRight(Node right) {
        this.rightChild = right;
    }

    public Node(int data){
        this.data = data;
        this.rightChild=null;
        this.leftChild=null;
    }
}
