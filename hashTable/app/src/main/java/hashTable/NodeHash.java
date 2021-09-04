package hashTable;

public class NodeHash {
    private int index;
    private int value;
    NodeHash next;

    public NodeHash(int index, int value) {
        this.index = index;
        this.value = value;
    }

    public NodeHash(){

    }

    public int getIndex() {
        return index;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
