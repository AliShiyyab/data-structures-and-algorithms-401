package hashTable;

public class NodeHash<V> {
    private int index;
    private V value;
    NodeHash<V> next;

    public NodeHash(int index, V value) {
        this.index = index;
        this.value = value;
    }

    public NodeHash(){

    }

    public int getIndex() {
        return index;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
