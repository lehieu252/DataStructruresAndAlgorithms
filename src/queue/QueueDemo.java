package queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);

        System.out.println(queue.size());
        System.out.println(queue.peekFront());
        queue.deQueue();
        System.out.println(queue.peekFront());
    }
}
