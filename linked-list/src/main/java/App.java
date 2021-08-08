import main.java.linkedList;

public class App{
    public static void main(String[] args) {
        System.out.println("This code wriiten by : Ali Akef Shiyyab");
        System.out.println("-------------------------------------------------------------");

        linkedList list = new linkedList();
        list.insert(5);
        list.insert(4);
        list.insert(3);
        list.insert(2);
        list.insert(1);

        System.out.println(list.isInclude(5));

        System.out.println(list.converToString());
    }
}