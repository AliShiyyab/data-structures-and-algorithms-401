package trees;

import java.util.*;

public class BinaryTree<B>{
    //Declare Root
    private Node<B> root;
    //Declare List
    private List inOrder = new ArrayList();
    private List preOrder = new ArrayList();
    private List postOrder = new ArrayList();
    //maxVal
    private Integer maxVal;
    //Getter and Setter For Root
    public Node<B> getRoot() {
        return root;
    }
    public void setRoot(Node<B> root) {
        this.root = root;
    }

    //InOrder travesal Function
    public List<B>  inOrder(Node node){
        if (node != null){
            if (node.getLeft() != null) {
                inOrder(node.getLeft());
            }
            this.inOrder.add(node.getData());
            if (node.getRight() != null) {
                inOrder(node.getRight());
            }
        }
        return this.inOrder;
    }

    //PreOrder Traversal Function
    public List<B>  preOrder(Node node){
        if (node != null){
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
    public List<B> postOrder(Node noed){
        if (noed != null){
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

    //GetMax Function
    public Integer getMaxValue(){
        maxVal = 0;
        if (getRoot() != null){
            List<B> newarr = postOrder(this.getRoot());
            for (B i : newarr){
                if (maxVal < (Integer) i){
                    maxVal = (Integer) i;
                }
            }
        }
        return maxVal;
    }
}
