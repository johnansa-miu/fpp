package lab9.prob3;

public class TestStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack(3);

        System.out.println("=== Testing Basic Operations ===");

        // Basic operations
        try {
            System.out.println("Push 10, 20, 30");
            stack.push(10);
            stack.push(20);
            stack.push(30);
            System.out.println("Stack: " + stack);

            System.out.println("Peek: " + stack.peek());
            System.out.println("Pop: " + stack.pop());
            System.out.println("After pop, peek: " + stack.peek());
            System.out.println("Stack: " + stack);
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }

        System.out.println("\n=== Testing Exception Handling ===");

        System.out.println("1. Testing Overflow:");
        try {
            stack.push(40); // This should cause overflow
            stack.push(50);
        } catch (IllegalStateException e) {
            System.out.println("Overflow handled: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }

        System.out.println("\n2. Testing Null value:");
        try {
            stack.push(null); // This should cause NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Null value handled: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }

        System.out.println("\n3. Emptying the stack:");
        try {
            while (!stack.isEmpty()) {
                System.out.println("Popped: " + stack.pop());
            }
            System.out.println("Stack is now empty: " + stack);
        } catch (Exception e) {
            System.out.println("Error while emptying stack: " + e.getMessage());
        }

        System.out.println("\n4. Testing Underflow on pop:");
        try {
            stack.pop(); // This should cause underflow
        } catch (java.util.EmptyStackException e) {
            System.out.println("Underflow on pop handled: Stack is empty");
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }

        System.out.println("\n5. Testing Underflow on peek:");
        try {
            stack.peek(); // This should cause underflow
        } catch (java.util.EmptyStackException e) {
            System.out.println("Underflow on peek handled: Stack is empty");
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }

        System.out.println("\n=== Final Stack Status ===");
        System.out.println("Stack: " + stack);
        System.out.println("Size: " + stack.size());
        System.out.println("Is empty: " + stack.isEmpty());
        System.out.println("Is full: " + stack.isFull());
    }
}