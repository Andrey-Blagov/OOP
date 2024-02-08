package HW_4;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insertAtBeginning(1);
        linkedList.insertAtBeginning(2);
        linkedList.insertAtBeginning(3);

        linkedList.insertAtEnd(4);
        linkedList.insertAtEnd(5);

        System.out.println("Size of the linked list: " + linkedList.getSize());
        System.out.println("Elements of the linked list:");
        printLinkedList(linkedList);

        linkedList.insertAtMiddle(10, 2);
        System.out.println("\nAfter inserting at middle (position 2):");
        printLinkedList(linkedList);
    }

    private static void printLinkedList(LinkedList list) {
        Node current = list;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

