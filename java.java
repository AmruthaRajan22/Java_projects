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

    // Method to insert a new node at the kth position in the linked list
    public void insertAtK(int data, int k) {
        Node newNode = new Node(data);

        if (k == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        for (int i = 1; i < k - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Position " + k + " is out of bounds.");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtK(10, 1);
        list.insertAtK(20, 2);
        list.insertAtK(30, 3);
	list.insertAtK(40, 4);
	list.insertAtK(50, 5);

        System.out.println("Linked List elements:");
        list.display();
    }
}
