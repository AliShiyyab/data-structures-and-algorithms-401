package trees;

import java.util.ArrayList;

public class BinaryTree<T> {
    private Node root;
    private ArrayList list = new ArrayList();

    public Node getRoot(){
        return root;
    }

    public void setRoot(Node root){
        this.root = root;
    }

    public String inOrderTraversal(Node focusNode){
        if (focusNode != null){
            inOrderTraversal(focusNode.getLeft());
            list.add(focusNode.getData());
            inOrderTraversal(focusNode.getRight());
        }
        return list.toString();
    }

    public String preOrderTraversal(Node focusNode){
        if (focusNode != null){
            this.list.add(focusNode.getData());
            preOrderTraversal(focusNode.getLeft());
            preOrderTraversal(focusNode.getRight());
        }
        return list.toString();
    }

    public String postOrderTraversal(Node focuseNode){
        if (focuseNode != null){
            postOrderTraversal(focuseNode.getLeft());
            postOrderTraversal(focuseNode.getRight());
            list.add(focuseNode.getData());
        }
        return list.toString();
    }

    private int maxVal;

    public int getMaxTreeValue(){
        if (this.root == null){
            return 0;
        }
        this.maxVal = root.getData();
        Node current = this.root;
        checkMaxVal(current);
        return maxVal;
    }

    private void checkMaxVal(Node node){
        if (node != null){
            if (node.getData() > maxVal){
                maxVal = node.getData();
            }
            checkMaxVal(node.getLeft());
            this.list.add(node.getData());
            checkMaxVal(node.getRight());
        }
    }
}
