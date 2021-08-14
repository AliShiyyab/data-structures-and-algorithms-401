package trees;

public class Library {
    public static void main(String[] args) {
        System.out.println("Code Challenge 15 -> Ali Shiyyab :')");
        Node node1 = new Node(500);
        Node node2 = new Node(800);
        Node node3 = new Node(300);
        Node node4 = new Node(400);
        Node node5 = new Node(100);

        Node root = new Node(90);
        BinaryTree binaryTree = new BinaryTree();
        System.out.println(binaryTree.preOrderTraversal(root));
        System.out.println(binaryTree.inOrderTraversal(root));
        System.out.println(binaryTree.postOrderTraversal(root));
        BinarySearchTree binarySearchTree = new BinarySearchTree(root);
        binarySearchTree.add(8);
        binarySearchTree.add(400);
        System.out.println(binarySearchTree.inOrderTraversal(root));
        System.out.println(binarySearchTree.postOrderTraversal(root));
        System.out.println(binarySearchTree.preOrderTraversal(root));
        binarySearchTree.add(-1);
        System.out.println(binarySearchTree.inOrderTraversal(root));
        System.out.println(binarySearchTree.Contains(-1, root));
        System.out.println(binarySearchTree.Contains(10, root));
    }
}
