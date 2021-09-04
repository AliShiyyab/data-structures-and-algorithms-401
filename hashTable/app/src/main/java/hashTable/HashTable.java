package hashTable;

public class HashTable {
    NodeHash[] arr;
    int arrSize;

    //Constructor
    public HashTable(int size){
        this.arrSize = size;
        this.arr = new NodeHash[this.arrSize];
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = new NodeHash();
        }
    }

    //find the place if value used:
    public int Hash(int key){
        return key % arrSize;
    }

    public void Add(int key, int value){
        int index = Hash(key);
        NodeHash newArr = arr[index];
        NodeHash newItem = new NodeHash(key,value);
        newItem.next = newArr.next;
        newArr.next = newItem;
        System.out.println("{ { Index = " + index + " } { Value = " + value + " } } ");
    }

    public int Get(int key){
        int value = 0;
        int index = Hash(key);
        NodeHash newArr = arr[index];
        while (newArr != null){
            if (newArr.getIndex() == key){
                value = newArr.getValue();
            }
            newArr = newArr.next;
        }
        return value;
    }

    public boolean Contains(int key){
        int index = Hash(key);
        NodeHash newArr = arr[index];
        NodeHash itemIsFound = arr[index];
        while (itemIsFound != null){
            if(itemIsFound.getIndex() == key){
                return true;
            }
            itemIsFound = itemIsFound.next;
        }
        return false;
    }

}
