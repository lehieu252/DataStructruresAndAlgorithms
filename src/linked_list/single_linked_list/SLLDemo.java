package linked_list.single_linked_list;

public class SLLDemo {
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        sll.push(1);
        sll.push(2);
        sll.push(3);
        sll.push(4);
        sll.push(5);
        sll.push(6);
        sll.displayLink();
        System.out.println("--------------------------");
        sll.find(5).display();
        System.out.println("--------------------------");

        sll.delete(6);
        sll.displayLink();
    }
}
