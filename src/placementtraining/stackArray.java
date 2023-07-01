public class stackArray {
    private int maxSize; 
    private int top;    
    private int[] stackArray;  

    public stackArray(int size) {
        maxSize = size;
        top = -1;
        stackArray = new int[maxSize];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push element.");
            return;
        }
        stackArray[++top] = value;
        System.out.println("Pushed " + value + " onto the stack.");
    }

   
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1;
        }
        int poppedElement = stackArray[top--];
        System.out.println("Popped " + poppedElement + " from the stack.");
        return poppedElement;
    }

  
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek element.");
            return -1;  
        }
        System.out.println("Top element: " + stackArray[top]);
        return stackArray[top];
    }


    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to display.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }



    public static void main(String[] args) {
        stackArray stack = new stackArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();  
        stack.pop();  
        stack.peek();  
        System.out.println("Is stack empty? " + stack.isEmpty());  
        System.out.println("Is stack full? " + stack.isFull());    
        stack.display(); 
    }
}
