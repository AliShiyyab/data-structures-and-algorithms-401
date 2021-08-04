package CC9;

import java.util.Arrays;

public class LinkedList {
    private Node head = null;
    private int counter = 0;

    //Insert Function for int
    public void insert(int value){
        Node node = new Node(value);
        if(this.head==null) {
            this.head=node;
        }else{
            Node current = this.head;
            node.setNext(current);
            this.head=node;
        }
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    //Reverse Function
    public static void Reversed(LinkedList list){
        int[] newArr = new int[list.getCounter()];
        LinkedList newList = new LinkedList();
        Node current = list.head;
        System.out.println(newArr.length);
        for (int i = 0 ; i < newArr.length ; i++){
            newArr[i] = current.getData();
            current = current.getNext();
        }
        for (int i = newArr.length - 1 ; i >= 0 ; i--){
            newList.insert(newArr[i]);
        }

        Node curren = list.head;
        while(curren != null){
            System.out.print("{ " + curren.getData() + " } -> ");
            curren = curren.getNext();
        }
        System.out.print("head");
        System.out.println();
    }

    public static void palendrom(LinkedList list) {

    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }
}
