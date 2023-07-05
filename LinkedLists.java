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
    public void insert(int data) {
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
    public void deleteNAfterM(int m, int n) {
        Node current = head;
        int count;
        while (current != null) {
            for (count = 1; count < m && current != null; count++) {
                current = current.next;
            }
            if (current == null) {
                return;
            }
            Node temp = current.next;
            for (count = 1; count <= n && temp != null; count++) {
                temp = temp.next;
            }
            current.next = temp;
            current = temp;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);
        list.insert(9);
        list.insert(10);

        int m = 3;
        int n = 2;

        System.out.println("Original Linked List:");
        list.display();

        list.deleteNAfterM(m, n);

        System.out.println("Linked List after deleting " + n + " nodes after every " + m + " nodes:");
        list.display();
    }
}
