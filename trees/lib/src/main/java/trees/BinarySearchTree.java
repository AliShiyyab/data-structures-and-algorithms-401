package trees;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;

public class BinarySearchTree<B> extends BinaryTree{
    //add and traversal of Add
    public void add(Integer value){
        Node<B> node = new Node(value);
        Node curr;
        if (this.getRoot() == null){
            this.setRoot(node);
        }
        else{
            //append the curr node a root value
            curr = this.getRoot();
            //send data to traverse function:
            addTraverse(curr,node);
        }
    }
    private void addTraverse(Node curr, Node node){
        if ((Integer)node.getData() < (Integer) curr.getData()) {
            if (curr.getLeft() == null) {
                curr.setLeft(node);
            } else {
                curr = curr.getLeft();
                addTraverse(curr, node);
            }
        }
        else {
            if (curr.getRight() == null) {
                curr.setRight(node);
            } else {
                curr = curr.getRight();
                addTraverse(curr, node);
            }
        }
    }

    //containe and traversal
    public boolean contains(Integer value){
        Node root = getRoot();
        return containsTraverse(root, value);
    }

    public boolean containsTraverse(Node root, Integer value){
        if(root == null){
            return false;
        }
        if((Integer)root.getData() == value){
            return true;
        }
        if((Integer)root.getData() > value) {
            return containsTraverse(root.getLeft(), value);
        }else{
            return containsTraverse(root.getRight(), value);
        }
    }

}
