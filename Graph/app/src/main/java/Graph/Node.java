package Graph;

public class Node<N> {
    String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node (String value){
        this.value = value;
    }
}
