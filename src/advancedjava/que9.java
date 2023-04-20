package advancedjava;

interface StackInterface<T> {
    void push(T item);
    T pop() throws StackUnderflowException;
    T peek() throws StackUnderflowException;
    boolean isEmpty();
    int size();
}

class StackUnderflowException extends Exception {
    public StackUnderflowException() {
        super("Stack is empty");
    }
}

class Stack<T> implements StackInterface<T> {
    private T[] stackArray;
    private int top;

    public Stack(int size) {
        stackArray = (T[]) new Object[size];
        top = -1;
    }

    public void push(T item) {
        if (top == stackArray.length - 1) {
            T[] newArray = (T[]) new Object[2 * stackArray.length];
            System.arraycopy(stackArray, 0, newArray, 0, stackArray.length);
            stackArray = newArray;
        }
        stackArray[++top] = item;
    }

    public T pop() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException();
        }
        T item = stackArray[top];
        stackArray[top--] = null;
        return item;
    }

    public T peek() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException();
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}   
    public class que9{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(5);
       // System.out.println("Stack is empty: " + stack.isEmpty());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack size: " + stack.size());
     //   System.out.println("Top element: " + stack.peek());
        try {
            System.out.println("Pop element: " + stack.pop());
            System.out.println("Pop element: " + stack.pop());
            System.out.println("Pop element: " + stack.pop());
            System.out.println("Pop element: " + stack.pop());
        } catch (StackUnderflowException e) {
            System.out.println(e.getMessage());
        }
    }}

