package HW_4;

import java.util.Iterator;

@SuppressWarnings("unused")
public class LinkedList extends Node {
    private int size;

    public LinkedList() {
        super(0); // Используем конструктор базового класса для создания пустого узла
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = this.next;
        this.next = newNode;
        size++;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        Node current = this;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        size++;
    }

    public void insertAtMiddle(int data, int position) {
        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }

        Node newNode = new Node(data);
        Node current = this;
        for (int i = 0; i < position; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }
}

