package placementtraining;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        head = null;
    }

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        System.out.println("Inserted " + data + " at the beginning.");
    }

    void insertAtEnd(int data) {
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
        System.out.println("Inserted " + data + " at the end.");
    }

    void insertAtPosition(int data, int position) {
        if (position <= 0) {
            System.out.println("Invalid position.");
            return;
        }

        if (position == 1) {
            insertAtBeginning(data);
            return;
        }

        int count = 1;
        Node current = head;
        while (count < position - 1 && current != null) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Invalid position.");
        } else {
            Node newNode = new Node(data);
            newNode.next = current.next;
            current.next = newNode;
            System.out.println("Inserted " + data + " at position " + position + ".");
        }
    }

    void display() {
        if (head == null) {
            System.out.println("Linked list is empty.");
        } else {
            System.out.print("Linked list: ");
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
}

public class SinglyLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice, data, position;

        do {
            System.out.println("\nLinked List Operations");
            System.out.println("1. Insert at the beginning");
            System.out.println("2. Insert at the end");
            System.out.println("3. Insert at a specific position");
            System.out.println("4. Display the linked list");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert: ");
                    data = scanner.nextInt();
                    list.insertAtBeginning(data);
                    break;
                case 2:
                    System.out.print("Enter the element to insert: ");
                    data = scanner.nextInt();
                    list.insertAtEnd(data);
                    break;
                case 3:
                    System.out.print("Enter the element to insert: ");
                    data = scanner.nextInt();
                    System.out.print("Enter the position: ");
                    position = scanner.nextInt();
                    list.insertAtPosition(data, position);
                    break;
                case 4:
                    list.display();
                    break;
                case 5:
                    System.out.println("Exiting the program");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
