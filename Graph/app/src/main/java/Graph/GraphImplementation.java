package Graph;

import java.util.*;

public class GraphImplementation<G> {
    public Map<Node<G>, ArrayList<Node<G>>> map = new HashMap<>();

    /*
    add node Function have:
    Arguments: value of genirice data type
    Returns: The added node -> Node Function data type
    Add a node to the graph
    */
    public Node<G> addNode(G value) {
        Node node = new Node(value);
        map.put(node, new ArrayList<>());
        return node;
    }

//    added an Edge
//    Arguments: 2 nodes to be connected by the edge, weight (optional)
//    Returns: nothing
//    Adds a new edge between two nodes in the graph
//    If specified, assign a weight to the edge
//    Both nodes should already be in the Graph
    public void addEdge(String str1 , String str2) {
        Node<String> n1 = new Node<>(str1);
        Node<String> n2 = new Node<>(str2);
        if (this.map.containsKey(n1) && this.map.containsKey(n2)) {
            this.map.get(n1).add((Node<G>) n2);
            this.map.get(n2).add((Node<G>) n1);
        }
    }

//    get nodes
//    Arguments: none
//    Returns all of the nodes in the graph as a collection (set, list, or similar)
    public ArrayList<Node> getNodes() {
        ArrayList<Node> list = new ArrayList<>();

        if (map.isEmpty()) {
            return null;
        } else {
            list.addAll(map.keySet());
            return list;
        }
    }

//    get neighbors
//    Arguments: node
//    Returns a collection of edges connected to the given node
//    Include the weight of the connection in the returned collection
    public ArrayList<Node<G>> getNeighbors(Node node) {
        return map.get(node);
    }

//    size
//    Arguments: none
//    Returns the total number of nodes in the graph
    public Integer getSize() {
        return map.size();
    }
}
