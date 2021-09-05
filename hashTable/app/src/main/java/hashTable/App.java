package hashTable;

import java.util.Arrays;

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
    }
}
