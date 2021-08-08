package CC10;

import java.util.Arrays;

public class Stack<S> {
    private int maxSize ;
    private Node<S> top;

    //Stack Constructor
    public Stack(){
        this.maxSize = 0;
        this.top = null;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public boolean isEmpty(){
        boolean temp = maxSize > 0 ? false : true;
        return temp;
    }

    public void pushStack(S value){
        Node node = new Node(value);
        this.maxSize++;
        //push like append function
        if(this.top == null){
            this.top = node;
        }
        else {
            Node current = this.top;
            node.setNext(current);
            this.top = node;
        }
    }

    public Object popStack(){
        Node current = this.top;
        if (isEmpty()){
            System.out.println("Is Null Stack List.");
        }
        else{

            this.top = this.top.getNext();
            current.setNext(null);
//            System.out.println("The Value in the last Stack and i deleted is : " + );
            maxSize--;
        }
        return current.getData();
    }

    public S peek() {
        return this.top.getData();
    }

    @Override
    public String toString() {
        return "Stack of size and top value is {" +
                "maxSize=" + maxSize +
                ", top=" + top.getData().toString() +
                '}';
    }
}
