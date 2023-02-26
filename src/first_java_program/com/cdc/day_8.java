import java.util.*;

class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    
    public LinkedList() {
        this.head = null;
    }
    
    // Add a new node to the end of the linked list
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }
    
    // Print the linked list
    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    
    // Reverse the linked list
    public void reverseList() {
        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    
    // Swap nodes a and b
    public void swapNodes(int a, int b) {
        if (a == b) {
            return;
        }
        Node prevA = null;
        Node currA = head;
        while (currA != null && currA.data != a) {
            prevA = currA;
            currA = currA.next;
        }
        Node prevB = null;
        Node currB = head;
        while (currB != null && currB.data != b) {
            prevB = currB;
            currB = currB.next;
        }
        if (currA == null || currB == null) {
            return;
        }
        if (prevA != null) {
            prevA.next = currB;
        } else {
            head = currB;
        }
        if (prevB != null) {
            prevB.next = currA;
        } else {
            head = currA;
        }
        Node temp = currA.next;
        currA.next = currB.next;
        currB.next = temp;
    }
}

public class day_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        int data = sc.nextInt();
        while (data != -1) {
            ll.addNode(data);
            data = sc.nextInt();
        }
        System.out.print("Original linked list: ");
        ll.printList();
        
        ll.reverseList();
        System.out.print("Reversed linked list: ");
        ll.printList();
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        ll.swapNodes(a, b);
        System.out.print("Swapped linked list: ");
        ll.printList();
        sc.close();
  }
}