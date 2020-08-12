package stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        ArrayStack st = new ArrayStack();
//        st.push(1);
//        st.push(2);
//        st.push(3);
//        st.push(4);
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        st.pop();

        System.out.println(st.peek());
        System.out.println(st.size());
    }
}
