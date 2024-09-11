package linkedlist;

public class LinkedlistImplementation {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static  class basicll {
        Node head = null;
        Node tail = null;

        void displayoflinkedlist() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " "); // Use print for better output formatting
                temp = temp.next;
            }
            System.out.println(); // Add newline for readability
        }

        void insertathead(int data) {
            Node temp = new Node(data);
            if (head == null) {
                tail = temp;
            } else {
                temp.next = head;
            }
            head = temp;
        }

        void insertatanyidx(int data, int idx) {
            // Handle insertion at end and negative index in separate methods
            // (consider using a separate `insertAtIndex` method)
            if (idx == size()) {
                insertatEnd(data);
                return;
            } else if (idx < 0) {
                System.out.println("Wrong idx");
                return;
            }

            // Traverse and insert at the specified index
            Node temp = head;
            for (int i = 1; i < idx && temp != null; i++) {
                temp = temp.next;
            }
            // Handle cases where index is out of bounds
            if (temp == null) {
                System.out.println("Wrong idx");
                return;
            }
            Node t = new Node(data);
            t.next = temp.next;
            temp.next = t;
        }

        void insertatEnd(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {

        basicll ll = new basicll();
        ll.insertatEnd(2);
        ll.insertatEnd(3);
        ll.displayoflinkedlist();











    }
}