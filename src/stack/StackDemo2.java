package stack;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo2 {
    public static void main(String[] args) {
        Stack st = new Stack();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(st.push(s.charAt(i)));
        }
    }
}
