package linked_list.single_linked_list;

public class SingleLinkedList {
    Node head;

    SingleLinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }


    // Push a node to head of Single Linked List
    public void push(int value) {
        Node new_node = new Node(value);
        new_node.next = head;
        head = new_node;
    }

    public Node find(int value) {
        Node current = head;
        while (current.data != value) {
            if (current.next != null) {
                current = current.next;
            } else {
                return null;
            }
        }
        return current;
    }

    public void delete(int value) {
        Node current = head;
        Node previous = head;
        while (current.data != value) {
            if (current.next == null) {
                System.out.println("Didn't find node");
            } else {
                previous = current;
                current = current.next;
            }
        }
        if (current == head) {                            // If delete the first node of the link
            head = current.next;
        } else {
            previous.next = current.next;
        }
    }

    public void displayLink() {
        Node current = head;
        while (current != null){
            current.display();
            current = current.next;
        }
    }
}
