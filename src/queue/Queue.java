package queue;

public class Queue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queueArray;
    private int nItems;

    Queue(int size){
        this.maxSize = size;
        queueArray = new int[size];
        front=0;
        rear = -1;
        nItems = 0;
    }

    public void enQueue(int value){
        if(rear == maxSize - 1) {
            System.out.println("Queue overflow");
            rear = -1;
        }
        queueArray[++rear] = value;
        nItems ++;
    }

    public int deQueue(){
        int temp = queueArray[front++];
        if(front == maxSize) front = 0;
        nItems --;
        return temp;
    }

    public boolean isEmpty(){
        return front == rear;
    }

    public int peekFront(){
        return queueArray[front];
    }

    public int size(){
        return nItems;
    }
}
