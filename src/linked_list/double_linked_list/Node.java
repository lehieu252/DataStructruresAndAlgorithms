package linked_list.double_linked_list;

public class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
    }

    public void display() {
        System.out.println("{ " + data + " }");
    }
}
