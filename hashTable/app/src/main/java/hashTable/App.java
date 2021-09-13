package hashTable;

import hashTable.BinaryTree.BinaryTree;
import hashTable.BinaryTree.BinaryTreeNode;
import hashTable.Intersection.TreeInsertion;
import hashTable.leftJoin.leftJoinFun;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        HashTable<String,String> hashTable = new HashTable<>(1024);
        System.out.println(hashTable.size);
        //Test
        System.out.println(hashTable.hash("It"));
        hashTable.addValue("It","Ahmad");
        hashTable.addValue("It","Ali");
        System.out.println(hashTable.contains("It"));
        System.out.println(hashTable.get("It"));
        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println();
        HashTable<Integer,String> hashTable1 = new HashTable<>(100);
        System.out.println(hashTable1.size);
        hashTable1.addValue("10", 10);
        hashTable1.addValue("20", 20);
        System.out.println(hashTable1.contains("10"));
        System.out.println(hashTable1.get("20"));
        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println();
        String a= "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York";
        HashTable<String,String> hashTable2 = new HashTable<>(2000);
        System.out.println(hashTable2.repeated(a));
        String b = "Once upon a time, there was a brave princess who";
        System.out.println(hashTable2.repeated(b));
        String c = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only";
        System.out.println(hashTable2.repeated(c));
        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println();
        BinaryTree<Integer> binaryTree1 = new BinaryTree();
        binaryTree1.setRoot(new BinaryTreeNode<>(100));
        binaryTree1.getRoot().setLeft(new BinaryTreeNode<>(50));
        binaryTree1.getRoot().getLeft().setLeft(new BinaryTreeNode<>(20));
        binaryTree1.getRoot().getLeft().setRight(new BinaryTreeNode<>(80));
        binaryTree1.getRoot().setRight(new BinaryTreeNode<>(150));
        binaryTree1.getRoot().getRight().setLeft(new BinaryTreeNode<>(120));
        binaryTree1.getRoot().getRight().setRight(new BinaryTreeNode<>(180));
        BinaryTree<Integer> binaryTree2 = new BinaryTree();
        binaryTree2.setRoot(new BinaryTreeNode<>(100));
        binaryTree2.getRoot().setLeft(new BinaryTreeNode<>(35));
        binaryTree2.getRoot().getLeft().setLeft(new BinaryTreeNode<>(20));
        binaryTree2.getRoot().getLeft().setRight(new BinaryTreeNode<>(85));
        binaryTree2.getRoot().setRight(new BinaryTreeNode<>(150));
        binaryTree2.getRoot().getRight().setLeft(new BinaryTreeNode<>(110));
        binaryTree2.getRoot().getRight().setRight(new BinaryTreeNode<>(180));

        TreeInsertion<Integer> treeInsertion = new TreeInsertion<>();
        System.out.println(treeInsertion.treeInsertion(binaryTree1,binaryTree2).toString());

        leftJoinFun LL = new leftJoinFun();
        HashMap<Object, String> firstTable  = new HashMap<Object, String>();
        firstTable.put("fond", "enamored");
        firstTable.put("wrath", "anger");
        firstTable.put("diligent", "employed");
        firstTable.put("outift", "garb");
        firstTable.put("outif", "garb");
        HashMap<Object, String> secondTable = new HashMap<Object, String>();
        secondTable.put("fond", "averse");
        secondTable.put("wrath", "delight");
        secondTable.put("diligent", "idle");
        secondTable.put("dilient", "idle");
        secondTable.put("outift", "follow");

        System.out.println(LL.leftJoin(firstTable,secondTable));
        System.out.println(LL.rightJoin(firstTable,secondTable));
    }
}
