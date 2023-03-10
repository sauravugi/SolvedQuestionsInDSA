package DsaProblems.src.LinkedList.RemoveFromEnd;

import DsaProblems.src.LinkedList.Node;

public class LinkedList {

    Node head;

    public void append(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            return;
        }
        Node current_node = head;
        while (current_node.next != null) {
            current_node = current_node.next;
        }
        current_node.next = new_node;
    }

    public void delete(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current_node = head;
        while (current_node.next != null) {
            if (current_node.next.data == data) {
                current_node.next = current_node.next.next;
                return;
            }
            current_node = current_node.next;
        }
    }

    // method to print the contents of the linked list
    public void printList() {
        Node current_node = head;
        while (current_node != null) {
            System.out.print(current_node.data + " ");
            current_node = current_node.next;
        }
        System.out.println();
    }

    public Node removeNthFromEnd(Node head, int n) {
        Node fast = head, slow = head;
        int pos = 0;
        while(pos++ < n && fast.next != null) fast = fast.next;
        if (fast == null) return head.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(5);
        list.append(6);
        list.append(9);
        list.printList();
        list.removeNthFromEnd(list.head, 3);
        list.printList();
    }
}
