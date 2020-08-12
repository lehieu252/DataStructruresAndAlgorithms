package stack;

public class ArrayStack implements Stack{
    public static final int CAPACITY = 1024;
    int top;
    Object[] arr = new Object[CAPACITY];

    ArrayStack(){
        top = -1;
    }

    @Override
    public int size() {
        return top+1;
    }

    @Override
    public boolean isEmpty() {
        return top < 0;
    }

    @Override
    public void push(Object a) {
        arr[++top] = a;
    }


    @Override
    public Object pop() {
        if(top < 0) {
            System.out.println("Stack Underflow");
            return null;
        }
        Object e = arr[top];
        arr[top--] = null;
        return e;

    }

    @Override
    public Object peek() {
        if(isEmpty()) System.out.println("Stack is empty");
        return arr[top];
    }
}
