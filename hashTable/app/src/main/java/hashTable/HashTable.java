package hashTable;

public class HashTable<V , K> {
    // Array Object of Node
    NodeHash<V,K>[] arrHash;
    int size;

    // Constructor to added a size!
    // Get the size of array depends on the size of hashes!
    public HashTable(int size) {
        this.arrHash = new NodeHash[size];
        this.size = size;
    }

    // Hash Function to return the place of value depends on key value
    public int hash(K key) {
        int valueOfArrayIndex = 1;
        char[] ch = key.toString().toCharArray();
        for (char c : ch) {
            valueOfArrayIndex = valueOfArrayIndex + c;
        }
        valueOfArrayIndex = (valueOfArrayIndex * 599 ) % this.size;
        return valueOfArrayIndex;
    }

    public void addValue(K key, V value) {
        int index = hash(key);
        if(arrHash[index] == null)
            arrHash[index] = new NodeHash<>(key, value);
        else {
            arrHash[index+1] = new NodeHash<>(key, value);
            System.out.println("Added a value after {" + arrHash[index].getValue() + "} Because have a same index");
        }
    }

    // Contains function mean if the key is found return true!
    public boolean contains(K key) {
        int index = hash(key);
        return arrHash[index] != null;
    }

    /*
   get function used to return the data which i searched!
     */
    public V get(K key) {
        V value = null;
        int idnex = hash(key);
        NodeHash<V,K> arrValue = arrHash[idnex];
        while (arrValue != null) {
            if (arrValue.getIndex() == key) {
                value = (V) arrValue.getValue();
                break;
            }
            arrValue = arrValue.getNext();
        }
        return value;
    }

    public String repeated(String str){
        String[] strArray = str.split(" ");
        HashTable<String,String> hashTable = new HashTable<>(2000);
        for(String word : strArray){
            word = word.replaceAll("[^a-zA-z]","").toLowerCase();
            if(hashTable.contains(word)){
                return word;
            }
            else {
                hashTable.addValue(word,word);
            }
        }
        return "No thing is repeated!";
    }
}
