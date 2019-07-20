public class MyLinkedList {
    private Node node;

    public MyLinkedList() {}

    public void add(String value) {
        if (this.node == null) {
            this.node = new Node(1, 0, value);
        } else {
            int count = this.node.getCount();
            this.node.setCount(++count);

            int index = this.node.getIndex();
            Node lastNode = getLastNode(this.node);
            lastNode.setNextNode(new Node(++index, this.node, value));
        }
    }

    public boolean isEmpty() {
        if (this.node.isEmpty()) {
            return true;
        }
        return false;
    }

    public Node getLastNode(Node n) {
        Node nextNode = n.getNextNode();
        if (nextNode == null) {
            return n;
        }
        return getLastNode(nextNode);
    }

    public void print(Node n) {
        if (n != null || !n.isEmpty()) {
            System.out.println(n.getValue());
            Node nextNode = n.getNextNode();
            if (nextNode != null) {
                print(nextNode);
            }
        }
    }

    public void print() {
        print(this.node);
    }
}
