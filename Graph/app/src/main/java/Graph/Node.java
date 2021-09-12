package Graph;

public class Node<N> {
    N value;

    public N getValue() {
        return value;
    }

    public void setValue(N value) {
        this.value = value;
    }

    public Node (N value){
        this.value = value;
    }
}
