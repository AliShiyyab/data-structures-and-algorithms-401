package hashTable;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        HashTable<Integer> age = new HashTable(7);
        System.out.println("The Value Which i added is : ");
        age.Add(1,23);
        age.Add(8,18);
        age.Add(14,20);
        age.Add(13,31);
        age.Add(85,16);
        age.Add(4,10);
        System.out.println(age.Get(1));
        System.out.println(age.Hash(90));
        System.out.println(age.arrSize);
        System.out.println(age.Contains(13));
    }
}
