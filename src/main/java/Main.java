public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add("1");
        myLinkedList.add("3");
        myLinkedList.add("20");
        myLinkedList.add("14");

        myLinkedList.print();

        System.out.println("-----------");

        myLinkedList.remove();
        myLinkedList.print();
    }
}
