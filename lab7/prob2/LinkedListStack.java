package lab7.prob2;

public class LinkedListStack {
    private Node top;
    private int size;
    public LinkedListStack() {
        top = null;
        size = 0;
    }

    public void push(Integer x) {
        if (x == null) return;
        Node newNode = new Node(x);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        size++;
    }

    public Integer peek() {
        return isEmpty() ? null : top.data;
    }

    public Integer pop() {
        Integer data = peek();
        if (data != null) {
            top = top.next;
            size--;
        }
        return data;
    }

    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return top == null;
    }

    private static class Node {
        Integer data;
        Node next;

        Node(Integer data) {
            this.data = data;
            this.next = null;
        }
    }
    @Override
    public String toString() {
        if (top == null) return "<empty>";
        StringBuilder sb = new StringBuilder();
        Node temp = top;
        while (temp != null) {
            sb.append(temp.data).append(" ");
            temp = temp.next;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LinkedListStack st = new LinkedListStack();
        st.push(1);
        st.push(2);
        System.out.println(st);
        System.out.println("Size = " + st.size());
        System.out.println(st.isEmpty());
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
    }
}
