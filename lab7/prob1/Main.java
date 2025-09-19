package lab7.prob1;

public class Main {
    public static void main(String[] args) {
        ArrayQueueImpl queue = new ArrayQueueImpl(3);

        // Test enqueue
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("After enqueuing 3 elements: " + queue);

        // Test resize
        queue.enqueue(40);
        System.out.println("After enqueuing 4th element (resize): " + queue);

        // Test peek
        System.out.println("Peek: " + queue.peek());

        // Test dequeue
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("After dequeue: " + queue);

        // Test isEmpty and size
        System.out.println("Is empty: " + queue.isEmpty());
        System.out.println("Size: " + queue.size());

        // Test multiple dequeues
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue on empty: " + queue.dequeue());
        System.out.println("Is empty: " + queue.isEmpty());
    }
}
