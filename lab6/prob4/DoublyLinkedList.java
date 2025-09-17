package lab6.prob4;

import java.util.Arrays;

public class DoublyLinkedList {

    Node header;
    DoublyLinkedList(){
        header = new Node();
    }
    //1. adds to the end of the list
    public void addLast(String item){
        Node newNode = new Node();
        newNode.value = item;

        Node current = header;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        newNode.previous = current;

    }
    // 2. Remove by passing object
    public boolean remove(String item){
        Node current = header.next;

        while (current != null) {
            if (current.value != null && current.value.equals(item)) {

                if (current.previous != null) {
                    current.previous.next = current.next;
                }
                if (current.next != null) {
                    current.next.previous = current.previous;
                }
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // 3. Remove the First Node

    public boolean removeFirst() {
        if (header.next == null) {
            return false;
        }

        Node first = header.next;
        header.next = first.next;

        if (first.next != null) {
            first.next.previous = header;
        }

        return true;
    }


    // 4. Prints the list from last to first
    public void printReverse() {

        Node current = header.next;
        if (current == null) {
            System.out.println("[]");
            return;
        }

        while (current.next != null) {
            current = current.next;
        }

        // Print from last to first
        while (current != header) {
            System.out.print(current.value);
            if (current.previous != header) {
                System.out.print(" ");
            }
            current = current.previous;
        }
    }
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        toString(sb, header);
        return sb.toString();

    }
    private void toString(StringBuilder sb, Node n) {
        if(n==null) return;
        if(n.value != null) sb.append(" " + n.value);
        toString(sb, n.next);
    }

    class Node {
        String value;
        Node next;
        Node previous;

        public String toString() {
            return value == null ? "null" : value;
        }
    }

    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("Bob");
        list.addLast("Harry");
        list.addLast("Steve");
        System.out.println("Original list: " + list);

        // Test addLast
        list.addLast("Carol");
        System.out.println("After adding Carol: " + list);

        // Test remove
        boolean removed = list.remove("Harry");
        System.out.println("Removed Harry: " + removed);
        System.out.println("After removing Harry: " + list);

        // Test removeFirst
        boolean firstRemoved = list.removeFirst();
        System.out.println("Removed first: " + firstRemoved);
        System.out.println("After removing first: " + list);

        // Test printReverse
        System.out.print("List in reverse order: ");
        list.printReverse();

        // Test edge cases
        System.out.println("\n\nTest edge cases");
        DoublyLinkedList emptyList = new DoublyLinkedList();
        System.out.println("Empty list: " + emptyList);
        System.out.println("Remove from empty list: " + emptyList.remove("test"));
        System.out.println("Remove first from empty list: " + emptyList.removeFirst());
        System.out.print("Reverse of empty list: ");
        emptyList.printReverse();
    }
}

