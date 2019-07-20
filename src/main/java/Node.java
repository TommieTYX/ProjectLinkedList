import lombok.Data;

@Data
public class Node {
    private Integer count;
    private Integer index;
    private Node prevNode;
    private Node nextNode;
    private String value;

    public Node() {
        this.index = 0;
    }

    public Node(Integer index, Node prevNode, Node nextNode, String value) {
        this.index = index;
        this.prevNode = prevNode;
        this.nextNode = nextNode;
        this.value = value;
    }

    public Node(Integer index, Node prevNode, String value) {
        this.index = index;
        this.prevNode = prevNode;
        this.value = value;
    }

    public Node(Integer index, String value) {
        this.index = index;
        this.value = value;
    }

    public Node(Integer count, Integer index, String value) {
        this.count = count;
        this.index = index;
        this.value = value;
    }

    public boolean isEmpty() {
        if (getValue() == null &&
                getPrevNode() == null &&
                getNextNode() == null) {
            return true;
        }
        return false;
    }
}
