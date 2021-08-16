package trees;

import java.util.ArrayList;

public class BinaryTree<T> {
    private Node root;
    private ArrayList<Integer> list = new ArrayList();

    public Node getRoot(){
        return root;
    }

    public BinaryTree(){}

    public void setRoot(Node root){
        this.root = root;
    }

    public String inOrderTraversal(Node focusNode){
        if (focusNode != null){
            inOrderTraversal(focusNode.getLeft());
            this.list.add(focusNode.getData());
            inOrderTraversal(focusNode.getRight());
        }
        return this.list.toString();
    }

    public String preOrderTraversal(Node focusNode){
        if (focusNode != null){
            this.list.add(focusNode.getData());
            preOrderTraversal(focusNode.getLeft());
            preOrderTraversal(focusNode.getRight());
        }
        return this.list.toString();
    }

    public String postOrderTraversal(Node focuseNode){
        if (focuseNode != null){
            postOrderTraversal(focuseNode.getLeft());
            postOrderTraversal(focuseNode.getRight());
            this.list.add(focuseNode.getData());
        }
        return this.list.toString();
    }

    private Integer maxVal;

    public Integer getMax() {
        if (this.root == null) return null ;
        this.maxVal = (Integer) this.root.getData();
        Node current = this.root ;
        checkMax(current);
        return maxVal;
    }
    private void checkMax(Node node){
        if(node != null) {
            if ((Integer)node.getData() > this.maxVal) this.maxVal = (Integer) node.getData();
            checkMax(node.getLeft());
            this.list.add(node.getData());
            checkMax(node.getRight());
        }
    }


}
