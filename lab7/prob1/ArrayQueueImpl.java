package lab7.prob1;

public class ArrayQueueImpl {
    private final int DEFAULT_CAPACITY = 10;
    private int size;
    private Integer[] arr;
    private int front;
    private int rear;

    // Default constructor
    public ArrayQueueImpl() {
        arr = new Integer[DEFAULT_CAPACITY];
        size = 0;
        front = 0;
        rear = 0;
    }

    public ArrayQueueImpl(int capacity) {
        arr = new Integer[capacity];
        size = 0;
        front = 0;
        rear = 0;
    }
    public Integer peek() {
        if (isEmpty()) {
            return null;
        }
        return arr[front];
    }
    public void enqueue(int obj){
        if (size == arr.length) {
            resize();
        }
        arr[rear] = obj;
        rear = (rear + 1) % arr.length;
        size++;
    }
    public Integer dequeue() {
        if (isEmpty()) {
            return null;
        }
        Integer temp = arr[front];
        arr[front] = null;
        front = (front + 1) % arr.length;
        size--;
        return temp;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }
    private void resize(){
        Integer[] newArr = new Integer[arr.length * 2];
        int j = 0;
        for (int i = front; j < size; j++, i = (i + 1) % arr.length) {
            newArr[j] = arr[i];
        }
        front = 0;
        rear = size;
        arr = newArr;
    }
    public String toString(){
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        int j = 0;
        for (int i = front; j < size; j++, i = (i + 1) % arr.length) {
            sb.append(arr[i]);
            if (j < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
