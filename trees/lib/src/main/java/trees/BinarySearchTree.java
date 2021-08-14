package trees;

public class BinarySearchTree<T> extends BinaryTree{
    private Node root;

    public BinarySearchTree(Node root){
        this.root= root;
    }
    //add function
    public void add(int value){
        Node node = new Node(value);
        Node previ = null;
        Node current = root;
        while(current!=null){
            if (current.data < value){
                previ = current;
                current=current.getRight();
            }
            else if(current.data > value){
                previ = current;
                current=current.getLeft();
            }
        }
        if(previ.data < value){
            previ.setRight(node);
        }else {
            previ.setLeft(node);
        }
    }

    //contains:
    public boolean Contains(int value, Node root){
        Node current = root;
        if (root != null){
            if (value == current.data){
                return true;
            }else if(value < current.data){
                current=current.getLeft();
                return Contains(value,current);
            }else{
                current=current.getRight();
                return Contains(value,current);
            }
        }
        return false;
    }
}
