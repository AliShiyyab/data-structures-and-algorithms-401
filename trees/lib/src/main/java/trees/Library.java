package trees;

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

    }
}
