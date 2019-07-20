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
            lastNode.setNextNode(new Node(++index, lastNode, value));
        }
    }

    public Node remove() {
        Node lastNode = getLastNode(this.node);
        Node newLastNode = lastNode.getPrevNode();
        newLastNode.setNextNode(null);
        this.node.setCount(this.node.getCount() - 1);
        return lastNode;
    }

    public Node removeAt(int index) {
        Node node = getNodeAt(index);
        if (node.getPrevNode() != null) {
            node.getPrevNode().setNextNode(node.getNextNode());
        } else  {
            this.node = node.getNextNode().removePrevNode();
        }
        this.node.setCount(this.node.getCount() - 1);
        return node;
    }

    public boolean isEmpty() {
        if (this.node.isEmpty()) {
            return true;
        }
        return false;
    }

    public Node getNodeAt(int index) {
        return getNodeAt(index, this.node);
    }

    public Node getLastNode() {
        return getLastNode(this.node);
    }

    public void print() {
        print(this.node);
    }





    private Node getNodeAt(int index, Node node) {
        if (node.getIndex() == index) {
            return node;
        }
        return getNodeAt(index, node.getNextNode());
    }

    private void print(Node n) {
        if (n != null || !n.isEmpty()) {
            System.out.println(n.getValue());
            Node nextNode = n.getNextNode();
            if (nextNode != null) {
                print(nextNode);
            }
        }
    }

    private Node getLastNode(Node n) {
        Node nextNode = n.getNextNode();
        if (nextNode == null) {
            return n;
        }
        return getLastNode(nextNode);
    }
}
