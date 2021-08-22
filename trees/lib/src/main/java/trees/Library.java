package trees;

import java.util.*;

public class Library {
    public static void main(String[] args) {
        BinarySearchTree <Integer> test = new BinarySearchTree<>();
        test.setRoot(new Node(10));
        test.getRoot().setLeft(new Node(8));
        test.getRoot().getLeft().setLeft(new Node(6));
        test.getRoot().setRight(new Node(12));
        test.add(10);
        System.out.println(test.inOrder(test.getRoot()));

        BinarySearchTree <Integer> test2 = new BinarySearchTree<>();
        test2.add(10);
        test2.add(15);
        test2.add(30);
        test2.add(12);
        test2.add(8);
        test2.add(9);
        test2.add(5);
        System.out.println(test2.contains(50));
        System.out.println(test2.getMaxValue());
        System.out.println(breadthFirst(test2).toString());
        System.out.println(kArray(test2));
    }

    public static String kArray(BinaryTree<Integer> tree){
        String str = "";
        String str1 = "Fuzz, ";
        String str2 = "Buzz, ";
        String str3 = "FuzzBuzz, ";
        Integer counter = 0;
        if (tree.getRoot() != null){
            List<Integer> newList = tree.preOrder((tree.getRoot()));
            for (Integer i : newList){
                if ((Integer) i % 3 == 0 && (Integer) i % 5 == 0){
                    str += str3;
                    counter++;
                }
                else if ((Integer)i % 3 == 0){
                    str += str1;
                    counter++;
                }
                else if ((Integer)i % 5 == 0){
                    str += str2;
                    counter++;
                }
                else{
                    str += i.toString() + ", ";
                    counter++;
                }
            }
        }
        System.out.println(counter);
        return str;
    }

    public static List<Integer> breadthFirst(BinaryTree<Integer> tree){
        List<Integer> value = new ArrayList<Integer>();
        Queue<Node> test = new LinkedList<>();
        if (tree.getRoot() != null){
            test.add(tree.getRoot());
            while(!test.isEmpty()){
                Node node = test.remove();
                value.add((Integer) node.getData());
                if(node.getLeft() != null){
                    test.add(node.getLeft());
                }
                if (node.getRight() != null){
                    test.add(node.getRight());
                }
            }
        }
        return value;
    }

}