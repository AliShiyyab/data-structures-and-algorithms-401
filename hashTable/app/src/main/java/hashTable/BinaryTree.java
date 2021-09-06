package hashTable;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<B> {
    //Declare Root
    private BinaryTreeNode<B> root;
    //Declare List
    private List inOrder = new ArrayList();
    private List preOrder = new ArrayList();
    private List postOrder = new ArrayList();
    //maxVal
    private Integer maxVal;

    //Getter and Setter For Root
    public BinaryTreeNode<B> getRoot() {
        return root;
    }

    public void setRoot(BinaryTreeNode<B> root) {
        this.root = root;
    }

    //InOrder travesal Function
    public List<B> inOrder(BinaryTreeNode node) {
        if (node != null) {
            inOrder(node.getLeft());
            this.inOrder.add(node.getData());
            inOrder(node.getRight());
        }
        return this.inOrder;
    }

    //PreOrder Traversal Function
    public List<B> preOrder(BinaryTreeNode node) {
        if (node != null) {
            this.preOrder.add(node.getData());
            if (node.getLeft() != null) {
                preOrder(node.getLeft());
            }
            if (node.getRight() != null) {
                preOrder(node.getRight());
            }
        }
        return this.preOrder;

    }

    //PostOrder Traversal Function
    public List<B> postOrder(BinaryTreeNode noed) {
        if (noed != null) {
            if (noed.getLeft() != null) {
                postOrder(noed.getLeft());
            }
            if (noed.getRight() != null) {
                postOrder(noed.getRight());
            }
            this.postOrder.add(noed.getData());
        }
        System.out.println(this.postOrder);
        return this.postOrder;
    }
}
