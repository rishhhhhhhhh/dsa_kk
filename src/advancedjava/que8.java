package advancedjava;

interface Queue<T> {
    void enqueue(T item);
    T dequeue();
    T peek();
    boolean isEmpty();
    int size();
}

class LinkedListQueue<T> implements Queue<T> {
    private Node<T> front;
    private Node<T> rear;
    private int count;

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public LinkedListQueue() {
        front = null;
        rear = null;
        count = 0;
    }

    public void enqueue(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        count++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        T item = front.data;
        front = front.next;
        count--;

        if (isEmpty()) {
            rear = null;
        }

        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        return front.data;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }
}
public class que8{
    public static void main(String[] args) {
    Queue<Integer> queue = new LinkedListQueue<>();
queue.enqueue(123);
queue.enqueue(25);
queue.enqueue(88);
queue.enqueue(69);
queue.enqueue(13);


System.out.println(queue.dequeue()); 
System.out.println(queue.peek()); 
System.out.println(queue.size()); 
System.out.println(queue.peek()); 
System.out.println(queue.isEmpty()); }
}