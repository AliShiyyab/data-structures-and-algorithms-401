package hashTable;

public class NodeHash<V,K> {
    private K index;
    private V value;
    NodeHash<V,K> next;

    public NodeHash(K index, V value) {
        this.index = index;
        this.value = value;
    }

    public NodeHash(){

    }

    public void setNext(NodeHash<V,K> next) {
        this.next = next;
    }

    public NodeHash<V,K> getNext() {
        return next;
    }

    public K getIndex() {
        return index;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void setIndex(K index) {
        this.index = index;
    }
}
