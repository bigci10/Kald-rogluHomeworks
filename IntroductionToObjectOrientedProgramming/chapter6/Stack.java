package IntroductionToObjectOrientedProgramming.chapter6;

public class Stack {
    private int top;
    private int size;
    private int capacity;
    private String[] elements;

    public Stack(int capacity) {
        this.top = -1;
        this.size = 0;
        this.capacity = capacity;
        this.elements = new String[capacity];
    }

    public static final int MAX_STACK_SIZE = 100;

    public boolean push(String newElement) {

        if (isFull()) {
            return false;
        }

        top++;
        elements[top] = newElement;
        size++;
        return true;
    }

    public String pop() {

        if(isEmpty()) {
            return null;
        }
        String element = elements[top];
        top--;
        size--;
        return element;
    }

    public void clear() {
        top = -1;
        size = 0;
        elements = new String[capacity];
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
        System.out.print("[ ");
        for(int i = top; i >= 0; i--) {
            System.out.print(elements[i] + " ");
        }

        System.out.print("]");
    }
}
