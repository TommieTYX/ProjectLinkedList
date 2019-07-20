public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add("1");
        myLinkedList.add("3");
        myLinkedList.add("20");
        myLinkedList.add("14");

        System.out.println("Print all----------- ");
        myLinkedList.print();

        System.out.println("Removed last----------- " + myLinkedList.remove().getValue());
        myLinkedList.print();


        System.out.println("Get index at 1-----------");
        System.out.println(myLinkedList.getNodeAt(1).getValue());
    }
}
