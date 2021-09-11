package hashTable.BinaryTree;

public class BinaryTreeNode <N> {
    private N data;
    private BinaryTreeNode<N> right;
    private BinaryTreeNode<N> left;

    public BinaryTreeNode(N data){
        this.data=data;
    }

    public BinaryTreeNode<N> getRight() {
        return right;
    }

    public N getData() {
        return data;
    }

    public BinaryTreeNode<N> getLeft() {
        return left;
    }

    public void setRight(BinaryTreeNode<N> right) {
        this.right = right;
    }

    public void setLeft(BinaryTreeNode<N> left) {
        this.left = left;
    }
}