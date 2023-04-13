package IntroductionToObjectOrientedProgramming.chapter6;

public class Queue {

    private String[] elements;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public static final int MAX_QUEUE_SIZE = 1000;

    public Queue(int capacity) {
        this.elements = new String[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.capacity = capacity;
    }

    public boolean queue(String newElement) {
        if(isFull()) {
            return false;
        }

        rear = (rear + 1) % capacity;
        elements[rear] = newElement;
        size++;
        return true;
    }

    public String dequeue() {
        if(isEmpty()) {
            return null;
        }
        String element = elements[front];
        front = (front + 1) % capacity;
        size--;
        return element;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void showElements() {
        for(int i = front; i <= rear; i++) {
            System.out.println(elements[i] + " ");
        }
        System.out.println();
    }
}
