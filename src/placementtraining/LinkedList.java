package placementtraining;

public class LinkedList {
    
    private Node head;
    
    private static class Node {
        private int data;
        private Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public void addNode(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    
    public int getCount() {
        int count = 0;
        Node current = head;
        
        while (current != null) {
            count++;
            current = current.next;
        }
        
        return count;
    }
    
    public int findMaxElement() {
        if (head == null) {
            System.out.println("List is empty.");
            return Integer.MIN_VALUE;
        }
        
        int max = head.data;
        Node current = head.next;
        
        while (current != null) {
            if (current.data > max) {
                max = current.data;
            }
            current = current.next;
        }
        
        return max;
    }
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        list.addNode(50);
        
        int count = list.getCount();
        int maxElement = list.findMaxElement();
        
        System.out.println("Count of nodes: " + count);
        System.out.println("Maximum element: " + maxElement);
    }
}
